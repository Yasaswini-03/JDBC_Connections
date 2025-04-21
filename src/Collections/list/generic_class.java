package Collections.list;

class products<t> {
	private t brand;
	public void pack(t brand) { //setter
		this.brand = brand;
	}
	public t unpack() { //getter
		return brand;
	}
}

class Bag extends products<Bag> {
	public String toString() {
		return "Gucci";
	}
	
}
class perfume extends products<perfume> {
	public String toString() {
		return "Denver";
	}
}
public class generic_class {
	public static void main(String[] args) {
		products<Bag> p = new products<>();
		p.pack(new Bag());
		System.out.println(p.unpack());
		
		products<perfume> q = new products<>();
		q.pack(new perfume());
		System.out.println(q.unpack());
		
	}

}
