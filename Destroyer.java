public class Destroyer extends NavyShip implements Secret{

	public Destroyer(String shipName, String shipYear, NavyShip.PropulsionType propulsionType, String missileType) {
		
		super(shipName, shipYear, propulsionType);
		this.missileType = missileType;
	}
	private String missileType;
	private int secretCode;
	public void setmissile(String vesselType)
	{
		this.missileType = missileType;
	}
	
	public String missileType()
	{
		return this.missileType;
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
