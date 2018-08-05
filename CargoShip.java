public class CargoShip extends Ship {

	public CargoShip(String name, String year, int tonnage) {
		super(name, year);
		this.tonnage = tonnage;
	}
	
	private int tonnage;
	
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	
	@Override
	public String toString() {
		return "The Cargo Ship's name is " + super.getShipName() + "\nThe Cargo Ship's tonnage is " + tonnage;
	}
}
