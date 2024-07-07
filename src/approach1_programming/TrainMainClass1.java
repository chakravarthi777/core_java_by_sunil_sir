package approach1_programming;
import java.util.Random;
public class TrainMainClass1
{
	public static void main(String[]args)
	{
		Train t1=new Train();
		Train t2=new Train();
		Random r1 = new Random();
        int n1 =r1.nextInt(10,99);
        int n2=r1.nextInt(10,99);
		t1.destinationPoint="Bangalore";
		t1.trainName="Bangalore express";
		t1.trainNumber="KABA"+n1;
		t1.trainSpeed=70;
		t1.journeyDistance=700;
		
		t2.destinationPoint="Chennai";
		t2.trainName="Chennai express";
		t2.trainNumber="KACH"+n2;
		t2.trainSpeed=90;
		t2.journeyDistance=950;
		
		System.out.println("------Train1 details------");
		System.out.println("Boarding point "+Train.boardingPoint);
		System.out.println("Destination point "+t1.destinationPoint);
		System.out.println("Train name "+t1.trainName);
		System.out.println("Train number "+t1.trainNumber);
		System.out.println("Train speed "+t1.trainSpeed+"Km/h");
		System.out.println("Journey distance "+t1.journeyDistance+"Kms");
		System.out.println("Time taken for train is "+(t1.journeyDistance/t1.trainSpeed));
		
		System.out.println("------Train2 details------");
		System.out.println("Boarding point "+Train.boardingPoint);
		System.out.println("Destination point "+t2.destinationPoint);
		System.out.println("Train name "+t2.trainName);
		System.out.println("Train number "+t2.trainNumber);
		System.out.println("Train speed "+t2.trainSpeed+"Km/h");
		System.out.println("Journey distance "+t2.journeyDistance+"Kms");
		System.out.println("Time taken for train is "+(t2.journeyDistance/t2.trainSpeed));
	}
}
