package object_type_casting;

public class MainClassCase3 {
	public static void main(String[] args) 
	{
		Animal a=(Animal)new Lion();
		a.roam();
		System.out.println();

		//DownCasting				
		WildAnimal wa=(WildAnimal)a;
		wa.roam();
		wa.hunt();
		System.out.println();
		
		Lion l=(Lion)a;
		l.roam();
		l.hunt();
		l.rule();
	}
}
