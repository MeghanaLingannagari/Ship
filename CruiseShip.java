public class CruiseShip extends Ship {
	public CruiseShip(String shipName, String shipYear, int passengers) {
		super(shipName, shipYear);
		this.passengers=passengers;
	}
	
	private int passengers;
	
	public void setPassengers(int passengers) {
		this.passengers=passengers;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
   @Override
	public String toString() {
		return "The Cruise Ship's name is " + super.getShipName() + "\nThe maximum number of passengers is " + passengers;
	}
}
