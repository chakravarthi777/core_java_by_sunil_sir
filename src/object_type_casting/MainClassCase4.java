package object_type_casting;

public class MainClassCase4 
{
	public static void main(String[] args) 
	{
		//upcasting
		Animal a=(Animal)new Lion();
		a.roam();
		//a.hunt(); cannot be accessible because we have not created object for intermediate class
		//a.rule(); cannot be accessible because even we created object for Lion class the lion class is hidden
		
		Lion l=(Lion)a;
		l.roam();
		l.hunt();
		l.rule();
	}
}
