package approach1_programming;

public class Balloon
{
		public static String sellerName="RAJA"; 
		public static String gas="HELIUM";
		public String balloonColours;

		public static void main(String[]args)
		{
			Balloon b1=new Balloon();
			Balloon b2=new Balloon();
			Balloon b3=new Balloon();
			Balloon b4=new Balloon();

			b1.balloonColours="red";
			b2.balloonColours="Orange";
			b3.balloonColours="White";
			b4.balloonColours="Black";

			System.out.println("A ballon seller "+sellerName+" Sells "+b1.balloonColours+" ,"+b2.balloonColours+" ,"+b3.balloonColours+" ,"+b4.balloonColours+" ballons filled with "+gas+" gas");
		}
	}
