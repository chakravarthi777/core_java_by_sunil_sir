package approach4_programming;

public class TrainMainClass1 {
	public static void usage(Train train)
	{
		train.display();
	}
	public static void main(String[] args) 
	{
		System.out.println();
		usage(new Train("Banglore"));
		System.out.println();
		usage(new Train("chennai"));
		System.out.println();
		usage(new Train("pune"));
		System.out.println();
	}

}
