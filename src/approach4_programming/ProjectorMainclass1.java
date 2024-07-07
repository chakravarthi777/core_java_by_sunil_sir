package approach4_programming;

public class ProjectorMainclass1 {

	public static void main(String[] args) 
	{
		//here there is drawback of code repetation so we need to convert this approach 3 to 
		//approach 4 by using specialized methods
		// specialized methods accepts only defined class objects.
		Projector projector1=new Projector("samsung");
		Projector projector2=new Projector("Sony");
		Projector projector3=new Projector("Lg");
		projector1.display();
		projector1.connect();
		projector1.mirrorScreen();
		
		projector2.display();
		projector2.connect();
		projector2.mirrorScreen();
		
		projector3.display();
		projector3.connect();
		projector3.mirrorScreen();
		

	}

}
