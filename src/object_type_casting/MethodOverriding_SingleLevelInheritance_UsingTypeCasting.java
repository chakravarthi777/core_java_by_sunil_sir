package object_type_casting;

class Vehicle
{
	public void move()
	{
		System.out.println("Move at constant speed....");
	}
}
class Car extends Vehicle
{
	@Override
	public void move()
	{
		System.out.println("Move at 120 kmph..");
	}
}
public class MethodOverriding_SingleLevelInheritance_UsingTypeCasting {

	public static void main(String[] args) {
		
		Vehicle v1=(Vehicle)new Car();
		v1.move();
		
	}

}
