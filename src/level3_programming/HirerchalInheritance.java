package level3_programming;

class Father1
{
	public static void car()
	{
		System.out.println("father asset car...");
	}
}
class Son1 extends Father
{
	public static void bike()
	{
		System.out.println("son asset bike...");
	}
}
class Daughter1 extends Father
{
	public static void scooty()
	{
		System.out.println("Daughter asset scooty...");
	}
}

public class HirerchalInheritance {

	public static void main(String[] args) {
		Son1 son=new Son1(); //either son can access father asset or daughet can access father asset
		son.car();
		son.bike();
		System.out.println();
		Daughter1 daughter=new Daughter1();
		daughter.scooty();
		daughter.car();
	}

}
