package level3_programming;
// sub class can access all the superclass methods or members of superclass through multilevel inheritance.
class A
{
	public static void method1()
	{
		System.out.println("class A method");
	}
}
class B extends A
{
	public static void method2()
	{
		System.out.println("Class B method");
	}
}
class C extends B
{
	public static void method3()
	{
		System.out.println("class C method");
	}
}

public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		C c=new C();
		c.method1();
		c.method2();
		c.method3();
		
	}

}
