package object_type_casting;

public class MainClassCase2 {

	public static void main(String[] args) {
		Animal a=(Animal)new WildAnimal(); //upcasting 1
		a.roam();
		//a.hunt(); since the Wild animal class properities are hidden we cannot access propertites of WildAnimal.
		WildAnimal wa=(WildAnimal)new Lion(); //upcasting 2
		wa.hunt();
		wa.roam();
		//wa.rule(); is hidden so we can not access the properties of hidden class.
		
		//Downcasting
		Lion l=(Lion)wa;
		l.roam();
		l.hunt();
		l.rule();

	}

}
