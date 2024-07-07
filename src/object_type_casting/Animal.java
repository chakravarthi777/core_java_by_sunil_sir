package object_type_casting;

public class Animal 
{
	public void roam()
	{
		System.out.println("Roaming...");
	}
}
class WildAnimal extends Animal
{
	public void hunt()
	{
		System.out.println("hunt...");
	}
}
class Lion	extends WildAnimal
{
	public void rule()
	{
		System.out.println("rule the jungle...");
	}
}
