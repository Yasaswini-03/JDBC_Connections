package Classes;

abstract class employee {
	abstract void display();
}
public class Anonymous {
	public static void main(String[] args) {
		employee e = new employee() {
			
			@Override
			void display() {
				System.out.println("Employee");
				
			}
		};
		e.display(); 
	}

}
