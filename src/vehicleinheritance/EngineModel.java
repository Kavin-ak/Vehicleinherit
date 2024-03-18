package vehicleinheritance;

public class EngineModel {
	private String type;
	private int horsepower;
	
	public EngineModel(String type,int horsepower) {
		this.type = type;
		this.horsepower = horsepower;
	}
	
	public String gerType() {
		return type;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
}