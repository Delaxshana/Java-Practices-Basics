
public class NavigationSatellite implements ISatellite {
	private String sName;
	public NavigationSatellite(String SaName) {
		sName=SaName;
		
	}
	public void activate() {
		System.out.println(sName + "navigational satellite activate");
	}
	public void deactivate() {
		System.out.println(sName + "navigational satellite deactivate");
		
	}
	
}
