package approach4_programming;

public class RunnerMainClass1 
{
	public static void usage(Runner runner)
	{
		runner.display();
	}
	public static void main(String[] args) {
		usage(new Runner("James",20));
		usage(new Runner("cham",40));
		usage(new Runner("alex",35));
	}

}
