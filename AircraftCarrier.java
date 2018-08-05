public class AircraftCarrier extends NavyShip implements Secret {

	public AircraftCarrier(String shipName, String shipYear, NavyShip.PropulsionType propulsionType, String flightDeckSize) {
		super(shipName, shipYear, propulsionType);
		this.flightDeckSize = flightDeckSize;
	}
	private String flightDeckSize;
	private int secretCode;
	public void setFlightDeckSize(String flightDeckSize)
	{
		this.flightDeckSize = flightDeckSize;
	}
	
	public String flightDeckSize()
	{
		return this.flightDeckSize;
	}
	
	public boolean destruct(int secretCode)
	{
		if(this.secretCode == secretCode) 
		{
			return true;
		}
		else
			return false;	
	}
	
	public void setSecretCode(int secretCode)
	{
		this.secretCode = secretCode;
	}
	
	public int getSecretCode()
	{
		return this.secretCode;
	}
	
}
