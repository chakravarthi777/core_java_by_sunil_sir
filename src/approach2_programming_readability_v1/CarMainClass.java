package approach2_programming_readability_v1;

public class CarMainClass {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		car1.initialize(65,12.6,400);
		car2.initialize(150,26.7,800);
		car1.display();
		car2.display();
	}

}
