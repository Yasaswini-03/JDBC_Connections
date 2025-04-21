package interface1;
abstract class vehicle2 {
	String name;
	abstract void start();
}
class audi2 extends vehicle2 {
	void start() {
		System.out.println("audi is starting");
	}
}

public class program2 {
	public static void main(String[] args) {
		audi2 a = new audi2();
		a.start();
		
	}

}
