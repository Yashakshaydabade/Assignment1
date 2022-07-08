package springcore_assignment.Q11;

public class Student 
{

    String studentname;
    int rollno;
    String dateOfBirth;
    String classname;
    String section;
    Result obj;
	public Student(String studentname, int rollno, String dateOfBirth, String classname, String section, Result obj)
	{
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.dateOfBirth = dateOfBirth;
		this.classname = classname;
		this.section = section;
		this.obj = obj;
	}
    
}
