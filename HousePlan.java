import java.util.ArrayList;

public abstract class HousePlan {
	
	protected ArrayList<String> materials;
	protected ArrayList<String> features;
	private int numRooms;
	private int numWindows;
	private int squareFeet;
	
	/**
	 * Creates a House filling in information called from the child classes
	 * @param numRooms
	 * @param numWindows
	 * @param squareFeet
	 */

	public HousePlan(int numRooms, int numWindows, int squareFeet) {
		this.numRooms = numRooms;
		this.numWindows = numWindows;
		this.squareFeet = squareFeet;
		materials = new ArrayList<String>();
		features = new ArrayList<String>();
		setMaterials();
		setFeatures();
	}
	
	protected abstract void setMaterials();
	
	protected abstract void setFeatures();

	/**
	 * Returns the materials needed for the house
	 * @return materials array list
	 */
	public ArrayList<String> getMaterials() {
		return materials;
	}
	
	/**
	 * Returns the features needed for the house
	 * @return features array list
	 */
	public ArrayList<String> getFeatures() {
		return features;
	}
	
	/**
	 * Returns the number of rooms
	 * @return numRooms
	 */
	public int getNumRooms() {
		return this.numRooms;
	}
	
	/**
	 * Returns the number of Windows
	 * @return numWindows
	 */
	public int getNumWindows() {
		return this.numWindows;
	}
	
	/**
	 * Returns the number of square feet
	 * @return squareFeet
	 */
	public int getSquareFeet() {
		return this.squareFeet;
	}
	
	/**
	 * Returns a string with the description of the specific house
	 * @return House information
	 */
	public String toString() {
		return "\nSquare Feet: " + this.getSquareFeet() + "\nRooms: " + this.getNumRooms() + "\nWindows: " + this.getNumWindows() 
		+ "\nMaterials: \n" + this.printMaterials() + "\nFeatures: \n" + this.printFeatures();
	}
	
	/**
	 * Puts the materials into a string
	 * @return materialString
	 */
	private String printMaterials() {
		String materialString = "";
		for(int i = 0; i < materials.size(); i++) {
			materialString += " - " + materials.get(i) + "\n";
		}
		return materialString;
	}
	
	/**
	 * Puts the features into a string
	 * @return featuresString
	 */
	private String printFeatures() {
		String featuresString = "";
		for(String feature : features) {
			featuresString +=  " - " + feature + "\n";
		}
		return featuresString;
	}
}
