package level3_programming;
//single level inheritance
class Father
{
	public static void car()
	{
		System.out.println("Father asset car...");
	}
}
class Son extends Father
{
	public static void bike()
	{
		System.out.println("son asset bike...");
	}
}
public class SingleInheritance {

	public static void main(String[] args) 
	{
		Son son=new Son();
		son.car();
		son.bike();

	}

}
