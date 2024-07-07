package approach2_programming_readibility_v2;

public class Runner {
		private static int Distance=10;
		private String runnerName;
		private double speed;
		
		public void initialize(String runnerName,int speed)
		{
			if(checkName(runnerName))
			{
			this.runnerName=runnerName;
			}
			else
				System.err.println("Invalid name");
			
			if(checkSpeed(speed))
				this.speed=speed;
			else
				System.err.println("Invalid speed");
		}
		private boolean checkName(String runnerName)
		{
			boolean status=false;
			for(int i=0;i<=runnerName.length()-1;i++)
			{
				if(Character.isAlphabetic(runnerName.charAt(i)))
					status=true;
				else
				{
					status=false;
					break;
				}
			}
			return status;
		}
		private boolean checkSpeed(int speed)
		{
			if(speed>0 && speed<=50)
			{
				return true;
			}
			return false;
		}
		public void display()
		{
			System.out.println(runnerName);
			System.out.println(speed);
		}

}
