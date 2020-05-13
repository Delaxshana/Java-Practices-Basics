
public class SatelliteCenter {
	private int option;
	
	private ISatellite ISatellite[];
	private IGeoLocation IGeoLocation[];
	
	public SatelliteCenter(int option, ISatellite ISatellite[],IGeoLocation IGeoLocation[]){
		this.option=option;
		this.ISatellite = ISatellite[];
		this.IGeoLocation = IGeoLocation[];

	}
	public void startService() {
		switch(option) {
		case 0: NavigationSatellite.activate();
				break;
		case 1: DroneSatellite.activate();
				break;
	
		}
	}
	public void stopService() {
		switch(option) {
		case 0: NavigationSatellite.deactivate();
				break;
		case 1: DroneSatellite.deactivate();
				break;
	}
	public void locationService() {
		satellite.displayDetails();
	}
	}
}
