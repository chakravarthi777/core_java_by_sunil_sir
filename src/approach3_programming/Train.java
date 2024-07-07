package approach3_programming;

import java.util.Random;

public class Train {
	
		private String trainName;
		private String trainNumber;
		private static String boardingPoint;
		private String destinationPoint="";
		private int trainSpeed;
		private int journeyDistance;
		private double journeyTime;
		
		public Train(String destinationPoint)
		{
			this.boardingPoint=validateBoardingPoint(destinationPoint);
			this.trainName=trainName(destinationPoint);
			this.trainNumber=generateTrainNumber(destinationPoint);
			if(checkDestinationPoint(destinationPoint))
				this.destinationPoint=destinationPoint;
			this.trainSpeed=assginTrainSpeed(destinationPoint);
			this.journeyDistance=jounreyDistance(destinationPoint);
			this.journeyTime=calculateTime(destinationPoint);
			
		}
		
		public void display()
		{
			String validate=this.destinationPoint;
			if(checkDestinationPoint(validate))
			{
			System.out.println("Boardingpoint 		: "+boardingPoint);
			System.out.println("DestinationPoint        : "+destinationPoint);
			System.out.println("Train Name 	  	: "+trainName);
			System.out.println("Train Number  		: "+trainNumber);
			System.out.println("Train Moves at speed of : "+trainSpeed+" kmph");
			System.out.println("Total Journeydistance	: "+journeyDistance+" kilometers");
			System.out.println("Journey Time            : "+journeyTime+" Hrs");
			}
			else
				System.err.println("Invalid Destination Point");
		}
		//journeyDistance method
		private int jounreyDistance(String destinationPoint)
		{
			int distance=0;
			if(destinationPoint.equalsIgnoreCase("Banglore"))
				distance=600;
			else if(destinationPoint.equalsIgnoreCase("Chennai"))
				distance=700;
			else if(destinationPoint.equalsIgnoreCase("Pune"))
				distance=900;
			else if(destinationPoint.equalsIgnoreCase("Mumbai"))
				distance=1000;
			
			return distance;
		}
		//traiSpeed
		private int assginTrainSpeed(String destinationPoint)
		{
			int trainSpeed=0;
			if(destinationPoint.equalsIgnoreCase("Banglore") )
				trainSpeed=60;
			else if(destinationPoint.equalsIgnoreCase("Chennai"))
				trainSpeed=80;
			else if(destinationPoint.equalsIgnoreCase("Pune"))
				trainSpeed=100;
			else if(destinationPoint.equalsIgnoreCase("Mumbai"))
				trainSpeed=120;
			
			return trainSpeed;
		}
		//generateTrainNumber
		private String generateTrainNumber(String destinationPoint)
		{
			String s1="";
			String s2="";
			int randomNumber=0;
			Random obj=new Random();
			if (destinationPoint.equalsIgnoreCase("Banglore") || destinationPoint.equalsIgnoreCase("Chennai")
					||destinationPoint.equalsIgnoreCase("Pune")||destinationPoint.equalsIgnoreCase("Mumbai")) 
			{ 
				s1=Character.toString(boardingPoint.charAt(0)).toUpperCase()+Character.toString(boardingPoint.charAt(1)).toUpperCase();
				s2=Character.toString(destinationPoint.charAt(0)).toUpperCase()+Character.toString(destinationPoint.charAt(1)).toUpperCase();
				randomNumber=obj.nextInt(10,100);
			}
			
			
			return s1+s2+randomNumber;
		}
		//trainName
		private String trainName(String destinationPoint)
		{
			String tName="";
			if (checkDestinationPoint(destinationPoint)) 
			{ 
				 tName=destinationPoint+"Express";
			}
			
			return tName;
		}

		//destinationpoint validation method
		private boolean checkDestinationPoint(String destinationPoint)
		{
			if (destinationPoint.equalsIgnoreCase("Banglore") || destinationPoint.equalsIgnoreCase("Chennai")
					||destinationPoint.equalsIgnoreCase("Pune")||destinationPoint.equalsIgnoreCase("Mumbai")) 
			{ 
				return true;
			}
			else 
				return false;
		}
		//boardingPoint validation
		private String validateBoardingPoint(String destinationPoint)
		{
			String bp="";
			if (checkDestinationPoint(destinationPoint)) 
			{ 
				 bp="KACHIGUDA";
			}
			return bp;
		}
		
		private double calculateTime(String destinationPoint)
		{
			double time=0;
			if (checkDestinationPoint(destinationPoint)) 
			{ 
				time=journeyDistance/trainSpeed;
				
			}
			return time;
		}
}
