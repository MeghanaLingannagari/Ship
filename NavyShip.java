public abstract class NavyShip extends Ship{
	public enum PropulsionType { NUCLEAR, FUEL, STEAM, COAL}

	private PropulsionType propulsion;
	
	public NavyShip(String shipName, String shipYear, PropulsionType propulsionType) {
		super(shipName, shipYear);
		
		propulsion = propulsionType;
    }
	public String getPropulsionTypeAsString() {
		switch(propulsion)
		{
		case NUCLEAR:
			return "NUCLEAR";
		
		case FUEL:
			return "FUEL";
			
		case STEAM:
			return "STEAM";
			
		case COAL:
			return "COAL";
			
		default:
			return "Invalid";
		}
		
	}
	
	}

		
		
	
             