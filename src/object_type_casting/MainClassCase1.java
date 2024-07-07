package object_type_casting;

public class MainClassCase1 extends Lion
{
	public static void main(String[] args) 
	{
		/*upcasting hiding class WildAnimal
		or making wildAnimal object seems to behaviour*/
		Animal a=(Animal)new WildAnimal(); 
		a.roam();
		WildAnimal wa=(WildAnimal)new Lion(); //upcasting
		wa.hunt();
		wa.roam();
		
		//downcasting
		WildAnimal wa1=(WildAnimal) a;
		wa1.roam();
		wa1.hunt();
		Lion l=(Lion)wa;
		l.roam();
		l.hunt();
		l.rule();
	}
}
