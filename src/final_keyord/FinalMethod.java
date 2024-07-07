package final_keyord;

class A
{
	public final static void method1()
	{
		System.out.println("final variable...");
	}
}
public class FinalMethod extends A
{
/*
	@Override
	public static void method1()
	{
		System.out.println("overridden method...");
	}*/
	public static void main(String[] args) {
		
	}

}
// if method is declared as final then it is not possible to override...