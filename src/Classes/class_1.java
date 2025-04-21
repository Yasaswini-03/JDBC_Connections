package Classes;
class Student {
	private static String message="Hello,everyone";
	static class Action {
		void display() {
			System.out.println(message);
		}
	}
}
public class class_1 {
	public static void main(String[] args) {
//		Student S = new Student();
//		Student.Action a = S.new Action();
//		a.display();
		Student.Action a = new Student.Action();
		a.display();  
	}

}
