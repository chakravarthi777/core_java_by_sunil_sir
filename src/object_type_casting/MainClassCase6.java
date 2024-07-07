package object_type_casting;

public class MainClassCase6 {
	public static void main(String[] args) 
	{
		Animal a=(Animal)new WildAnimal();
		a.roam();
		//a.hunt cannot be accessed because wildAnimal class propertites are hidden.
		//a.rule(); cannot be accessed because lion class in not inherited.
		//DownCasting
		WildAnimal w=(WildAnimal)a;
		w.roam();
		w.hunt();
		//w.rule(); cannot be accessed because lion class in not inherited.it is sub class of WildAnimal class.
		// and we have not created object for lion class.
	}
}
