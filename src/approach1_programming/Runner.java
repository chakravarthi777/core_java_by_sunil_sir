package approach1_programming;

public class Runner
{
	public static int Distance=10;
	public String RunnerName;
	public double Speed;

	public static void main(String[] args)
	{
		Runner r1=new Runner();
		Runner r2=new Runner();
		Runner r3=new Runner();

		r1.RunnerName="RAJ";
		r1.Speed=5;
		r2.RunnerName="JAMES";
		r2.Speed=6;
		r3.RunnerName="ALI";
		r3.Speed=8;

		System.out.println(r1.RunnerName+" runs "+ Distance+" Km marathon at the speed of "+ r1.Speed+" and "+ r1.RunnerName+" completes the race in "+(Distance/r1.Speed));
		System.out.println(r2.RunnerName+" runs "+ Distance+" Km marathon at the speed of "+ r2.Speed+" and "+ r2.RunnerName+" completes the race in "+(Distance/r2.Speed));
		System.out.println(r3.RunnerName+" runs "+ Distance+" Km marathon at the speed of "+ r3.Speed+" and "+ r3.RunnerName+" completes the race in "+(Distance/r3.Speed));
	}
}
