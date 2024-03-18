package vehicleinheritance;

public class Car extends EngineModel{
	private String Brand;
	
	public Car(String type,int horsepower, String Brand) {
		super(type, horsepower);
		this.Brand = Brand;
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return Brand;
	}
}