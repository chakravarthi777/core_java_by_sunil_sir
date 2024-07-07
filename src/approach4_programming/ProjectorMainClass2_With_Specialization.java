package approach4_programming;

public class ProjectorMainClass2_With_Specialization {
	// specialized method. : it is used to implement the dry principle 
	public static void usage(Projector projector)
	{
		projector.display();
		projector.connect();
		projector.mirrorScreen();
	}
	public static void main(String[] args) {
		usage(new Projector("Sony"));
		usage(new Projector("Lg"));
		usage(new Projector("Samsung"));
	}

}
