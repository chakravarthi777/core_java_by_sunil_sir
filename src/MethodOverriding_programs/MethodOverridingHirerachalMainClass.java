package MethodOverriding_programs;
abstract class One 
{
	public void test()
	{
		System.out.println("test 1hr");
	}
}
 class Two extends One
 {
	 @Override
	 public void test()
	 {
		 System.out.println("test 2hr");
	 }
 }
 class Three extends One
 {
	 
 }
 class four extends One
 {
	 @Override
	 public void test()
	 {
		 System.out.println("test 3hr");
	 } 
 }
public class MethodOverridingHirerachalMainClass {
	public static void main(String[] args) {
		Two t1=new Two();
		t1.test();
		Three th1=new Three();
		th1.test();
		four f1=new four();
		f1.test();
	}

}
