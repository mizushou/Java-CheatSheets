package class05;

/**
 * Describes a Car model
 * 
 * @author rodrigo moura goncalves
 * 
 */
public class Car {
	// Instance Variables
	private int yearModel;
	private String modelName;

	private static String manufacturer = "Tesla";

	public Car() {

	}

	/**
	 * Car Constructor
	 * 
	 * @param yearModel
	 * @param modelName
	 */
	public Car(int yearModel, String modelName) {
		setYearModel(yearModel);
		setModelName(modelName);
	}

	public Car(int yearModel) {
		setYearModel(yearModel);
	}

	/**
	 * 
	 * @return the year model
	 */
	public int getYearModel() {
		return yearModel;
	}

	/**
	 * Set year model only if the parameter is greater than 2000
	 * 
	 * @param yearModel
	 *            to set
	 */
	public void setYearModel(int yearModel) {
		if (yearModel > 2000) {
			this.yearModel = yearModel;
		}
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		if (modelName != null && !modelName.isEmpty()) {
			this.modelName = modelName;
		}
	}

	public static String getManufacturer() {
		return manufacturer;
	}

	public static void setManufacturer(String manufacturer) {
		Car.manufacturer = manufacturer;
	}

	public void accelerate(double speed) {
		System.out.println("Accelerate double " + speed);		
	}

	public void accelerate(float speed) {
		System.out.println("Accelerate float " + speed);
	}

	public void accelerate(float speed, int distance) {

	}

	public void accelerate(int distance, float speed) {

	}

	@Override
	public String toString() {
		return "Car [yearModel=" + yearModel + ", modelName=" + modelName + "]";
	}

}
