
public class LogCabinPlan extends HousePlan{

	/**
	 * Creates a Log Cabin
	 */
	public LogCabinPlan() {
		super(2,10,1800);
	}
	
	/**
	 * Sets the specific materials for the Log Cabin
	 */
	public void setMaterials() {
		materials.add("Log Siding");
		materials.add("Board and Batten Siding");
		materials.add("White pine");
	}
	
	/**
	 * Sets the specific features for the Log Cabin
	 */
	public void setFeatures() {
		features.add("Timbered Roof");
		features.add("High Insulations");
		features.add("Rustic Effect");
	}
	
	/**
	 * Returns the type of house and calls to the super function
	 */
	public String toString() {
		return "Log Cabin" + super.toString();
	}

}
