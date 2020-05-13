
public class SatelliteLocation implements IGeoLocation{
	String SLocation;
	public void displayLocation() {
		System.out.println("Satellite location is " + SLocation);
	}
	
	public SatelliteLocation(String location) {
		SLocation=location;
	}
}
