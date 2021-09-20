
public class ContemporaryPlan extends HousePlan{

	/**
	 * Creates the Contemporary House calls to super
	 */
	public ContemporaryPlan() {
		super(5,40,3000);
	}
	
	/**
	 * Sets the specific materials for the contemporary house
	 */
	public void setMaterials() {
		materials.add("Ceramics");
		materials.add("High-Strength Alloys");
		materials.add("Composites");
	}
	
	/**
	 * Sets the specific features for the contemporary house 
	 */
	public void setFeatures() {
		features.add("Oversized Window");
		features.add("Unconventional Roofs");
		features.add("Minimalism");
		features.add("Open Floor Plan");
	}
	
	/**
	 * returns the name of house and calls to the super function
	 */
	public String toString() {
		return "Contemporary House" + super.toString();
	}

}
