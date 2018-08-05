public class Ship {

	private String shipName;
	private String shipYear;

	public Ship(String name, String year) {
		shipName = name;
		shipYear = year;
	}
	
	public void setShipName(String name) {
		this.shipName = name;
	}
	
	public String getShipName() {
		return shipName;
	}
	
	public void setShipYear(String year) {
		this.shipYear = year;
	}
	
	public String getShipYear() {
		return shipYear;
	}
	
	public String toString() {
		return "The ship's name is: " + this.shipName + "\nThe ship's year is: " + this.shipYear;
	}
	
}
