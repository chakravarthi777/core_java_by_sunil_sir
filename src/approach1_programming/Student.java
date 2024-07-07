package approach1_programming;

public class Student 
{
	public static String schoolName="VJIT";
	public String studentName;
	public double percentage;
	
	public static void main(String[]args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.studentName="Vithesh";
		s1.percentage=85.1;
		s2.studentName="Bindu";
		s2.percentage=86.4;
		s3.studentName="Priyanka";
		s3.percentage=87.3;
		
		System.out.println("All the students are from "+schoolName);
		System.out.println("--------Student1 details---------");
		System.out.println(s1.studentName);
		System.out.println(s1.percentage);
		System.out.println("--------Student2 details---------");
		System.out.println(s2.studentName);
		System.out.println(s2.percentage);
		System.out.println("--------Student3 details---------");
		System.out.println(s3.studentName);
		System.out.println(s3.percentage);
		
	}
	
}

