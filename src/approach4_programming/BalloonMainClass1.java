package approach4_programming;

public class BalloonMainClass1 {
	public static void usage(Balloon balloon)
	{
		balloon.display();
	}
	public static void main(String[] args) {
		usage(new Balloon("red"));
		usage(new Balloon("Orange"));
		usage(new Balloon("white"));
		usage(new Balloon("Black"));
	}

}
