package Collections.list;

class product {
	public static<t> void Arraylist(t[] array) {
		for(t bag : array) {
			System.out.print(bag + " ");
		}
	}
	public static<p> void Array(p[] arr,int index) {
		
		for(p bag : arr) {
			System.out.print(bag + " ");
		}
	}
}
public class generic {
	public static void main(String[] args) {
		Integer[] i = {10,20,30,40,50};
		String[] S = {"ten","twenty","thirty","fourty","fifty"};
		product.Arraylist(S);
		product.Arraylist(i);
		
		
	}

}
