package Classes;

class vehicle {
	void display() {
		class Car {
			void message() {
				System.out.println("Car is started");
			}
		}
		Car C = new Car();
		C.message();
	}
}
public class Localnumber_class {
	public static void main(String[] args) {
		vehicle v = new vehicle();
		v.display();
		
	}

}
