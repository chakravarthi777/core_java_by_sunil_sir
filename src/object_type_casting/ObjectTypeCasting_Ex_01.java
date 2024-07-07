package object_type_casting;

class A
{
	public void method1()
	{
		System.out.println("Method 1....");
	}
}
class B extends A
{
	public void method2()
	{
		System.out.println("Method2....");
	}
}
public class ObjectTypeCasting_Ex_01 {

	public static void main(String[] args) 
	{
		A a1=(A)new B();
		a1.method1();
		B b1=(B)a1;
		b1.method2();
		b1.method1();
	}

}
