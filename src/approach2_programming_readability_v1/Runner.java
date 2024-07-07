package approach2_programming_readability_v1;

public class Runner {
		private static int Distance=10;
		private String runnerName;
		private double speed;
		
		public void initialize(String runnerName,int speed)
		{
			this.runnerName=runnerName;
			this.speed=speed;
		}
		public void display()
		{
			System.out.println(runnerName);
			System.out.println(speed);
		}

}
