package interface1;
interface vehicle {
	void start();
	
}
class audi implements vehicle {
	public void start() {
	System.out.println("Car is starting");	
	}
}
public class program1 {
	public static void main(String[] args) {
		audi a = new audi();
		a.start();
		
	}

}
