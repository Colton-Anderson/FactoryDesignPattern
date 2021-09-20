
public class TinyHomePlan extends HousePlan{
 
	/**
	 * Creates a Tiny Home calls to super
	 */
	public TinyHomePlan() {
		super(1,5,200);
	}
	
	/**
	 * Sets the specific materials for the Tiny Home
	 */
	protected void setMaterials() {
		materials.add("Lumber");
		materials.add("Insulation");
		materials.add("Metal Roofing");
		materials.add("Hardware");
	}
	
	/**
	 * Sets the features for the Tiny Home
	 */
	protected void setFeatures() {
		features.add("Natural Light");
		features.add("Creative Storage");
		features.add("Multipurpose areas");
		features.add("Multi-use applications");
	}
	
	/**
	 * returns the type of house and calls to the super function
	 */
	public String toString() {
		return "Tiny Home" + super.toString();
	}

}
