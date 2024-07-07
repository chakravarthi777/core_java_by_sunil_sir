package object_type_casting;

public class MainClassCase5 
{
	public static void main(String[] args) 
	{
		WildAnimal w=(WildAnimal)new Lion();
		
		w.roam();
		w.hunt();
		//w.rule(); cannot access the rule method of Lion class because it is not inherited.
		
		Lion l=(Lion)w;
		// since lion class contains the propertites of WildAnimal,Animal classes. 
		// All the copies of superclass methods are avaliable in Lion class.
		l.roam();
		l.hunt();
		l.rule();
	}
}
