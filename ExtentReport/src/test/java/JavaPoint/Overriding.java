package JavaPoint;

class Vehicle{
	
	public void run() {
		System.out.println("Vehicle is running : okyy");
	}
}
class Bike extends Vehicle{
	
	public void run() {
		System.out.println("Bike is running");
	}
}

public class Overriding extends Bike{

	public static void main(String[] args) {
		Vehicle sc = new Vehicle();
		sc.run();

	}

}
