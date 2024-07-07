package object_type_casting;
class IronMan
{
	public void suit()
	{
		System.out.println("Use titanium suit...");
	}
}
class Tony extends IronMan
{
	public void ceo()
	{
		System.out.println("ceo of stark industries...");
	}
}
class Inventor	extends IronMan
{
	public void weapons()
	{
		System.out.println("invent new weapons...");
	}
}
public class HierarchalTypeCasting {

	public static void main(String[] args) 
	{
		IronMan i1=(IronMan)new Tony(); //upcasting
		i1.suit();	
		Tony t=(Tony)i1; //DownCasting
		t.suit();
		t.ceo();
		
		System.out.println();
		
		IronMan i2=(IronMan)new Inventor(); //upcasting
		i2.suit();
		Inventor in=(Inventor)i2; //DownCasting
		in.suit();
		in.weapons();
	}

}
