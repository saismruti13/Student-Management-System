class Student
{
	int sId;
	String sName;
	int sAge;
	double sMark;

	Student(int sId, String sName, int sAge, double sMark)
	{
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sMark = sMark;
	}

	void display()
	{
		System.out.println("Student Details are: ");
		System.out.println("-------------------------");
		System.out.println("Student Id is: "+sId);
		System.out.println("Student Name is: "+sName);
		System.out.println("Student Age is: "+sAge);
		System.out.println("Student Mark is: "+sMark);
		System.out.println();
	}
}