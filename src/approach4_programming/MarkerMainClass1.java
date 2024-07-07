package approach4_programming;

public class MarkerMainClass1 {
	public static void usage(Marker marker)
	{
		marker.markerDetails();
	}
	public static void main(String[] args) {
		
		usage(new Marker("cello",15));
		usage(new Marker("parker",20));
		usage(new Marker("renolds",18));
	}

}
