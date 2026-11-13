import java.util.Scanner;
class StudentManagement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Student students[] = new Student[5];

		int count = 0;

		while(true){
			System.out.println("\n-----MENU-----");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Search Students");
			System.out.println("4. Update Students");
			System.out.println("5. Delete Students");
			System.out.println("6. Exit");

			System.out.println("Enter Choice");

			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				try{
					if(count >= students.length){
						throw new ArrayIndexOutOfBoundsException("Database Full");

					}
					System.out.println("Enter Id: ");
					int sId = sc.nextInt();

					System.out.println("Enter Name: ");
					String sName = sc.next();

					System.out.println("Enter Age: ");
					int sAge  = sc.nextInt();

					System.out.println("Enter Marks: ");
					double sMark = sc.nextDouble();

					students[count] = new Student(sId,sName,sAge,sMark);
					count++;
					System.out.println("Student Added.");
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				break ;

			case 2:
				for(int i=0; i< count; i++){
					students[i].display();
				}

				break;

			case 3:

				System.out.println("Enter Student ID: ");
				int search = sc.nextInt();

				boolean found = false;

				for(int i = 0; i<count; i++){
					if(students[i].sId == search){
						students[i].display();
						found = true;
					}
				}
				if (!found)
					System.out.println("Student Not Found");
					break;
			case 4:
				System.out.print("Enter Student Id: ");
				int update = sc.nextInt();

				System.out.print("Enter New Name: ");
				String newName = sc.next();

				found = false;

				for(int i = 0;i< count; i++){

					if(students[i].sId == update) {

						students[i].sName = newName;
						found = true;
						System.out.println("Updated successfully");
					}
				}
				if(! found)
					System.out.println("Student Not Found");
				break;

			case 5:
				System.out.print("Enter Student Id: ");
				int delete = sc.nextInt();

				found = false;

				for(int i = 0;i< count; i++){
					if(students[i].sId == delete) {
						for (int j = i;j < count - 1; j++){
							students[j] = students[j+1];
						}

						students[count - 1] = null;
						count--;

						found = true;

						System.out.println("Deleted successfully");

						break;
					}
				}
				if (!found)
					System.out.println("Student not found");
				break;

			case 6:

				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
		}	
	}
}