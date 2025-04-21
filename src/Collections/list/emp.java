package Collections.list;


class comparing {
	public static <t> boolean compare(t t1,t t2) {
		return t1.equals(t2);
		
	}
}
public class emp {
	public static void main(String[] args) {
		comparing c = new comparing();
		System.out.println(c.compare(5, 5));
		System.out.println(c.compare("hii", "hello"));
		
	}

}
