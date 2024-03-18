package vehicleinheritance;

public class Bike extends EngineModel {
	private String model;
	
	public Bike(String type, int horsepower, String model) {
		super(type, horsepower);
		this.model = model;
		
	}
	
	public String gerModel() {
		return model;
		
	}
	
}