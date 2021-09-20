

public class HousePlanFactory {
	/**
	 * Takes in the for type of house and returns a created class for the type of house plan
	 * @param type: type of house
	 * @return the created houseplan
	 */
	public static HousePlan createHousePlan(String type) {
		HousePlan housePlan;
		
		if(type.equalsIgnoreCase("log cabin")) {
			housePlan = new LogCabinPlan();
		}
		if(type.equalsIgnoreCase("tiny home")) {
			housePlan = new TinyHomePlan();
		}
		if(type.equalsIgnoreCase("contemporary home")) {
			housePlan = new ContemporaryPlan();
		}
		else {
			housePlan = new LogCabinPlan();
		}
		
		return housePlan;
	}

}
