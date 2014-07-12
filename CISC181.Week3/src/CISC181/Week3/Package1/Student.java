package CISC181.Week3.Package1;

import java.util.Date;

public class Student extends Person {

	private String Major;
	
	public String getMajor ( )
    {
        return this.Major;
    }
    public void setFirstName (String Major)
    {
        this.Major = Major;           
    }
    
	public Student() {
		
	}

	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major) 
	{
		super(FirstName, MiddleName, LastName, DOB);
		this.Major = Major;
		
	}

}
