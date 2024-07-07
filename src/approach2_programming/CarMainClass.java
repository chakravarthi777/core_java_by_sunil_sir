package approach2_programming;

public class CarMainClass {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		c1.initialize(65,12.6,400);
		c2.initialize(150,26.7,800);
		c1.display();
		c2.display();
	}

}
