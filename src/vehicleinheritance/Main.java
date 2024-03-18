package vehicleinheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Car mycar = new Car("Pertol", 200, "Totota");
		Bike mybike = new Bike("s1000rr", 300,"BMW");
		
		System.out.println("My car: ");
		System.out.println("brand: " + mycar.getBrand());
		System.out.println("Engine type: " + mycar.gerType());
		System.out.println("Horsepower: " + mycar.getHorsepower());
		
		System.out.println("/nMy bike: ");
		System.out.println("Model: " + mybike.gerModel());
		System.out.println("Engine type: " + mybike.gerType());
		System.out.println("Horsepower: " + mybike.getHorsepower());
	}

}