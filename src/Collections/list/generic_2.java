package Collections.list;

class payment {
	double amount;
	public payment(double amount) {
		this.amount = amount;
	}
	public void pay() {
		System.out.println("paid amount: " + amount + " using Debitcard");
	}
}
class debitcard extends payment {
	public debitcard(double amount) {
		super(amount);
	}
	@Override
	public void pay() {
		System.out.println("paid amount: " + amount + " using Debitcard");
	}
}
class creditcard extends payment {
	public creditcard(double amount) {
		super(amount);
	}
	public void pay() {
		System.out.println("paid amount: " + amount + " using creditcard");
	}
}
class googlepay extends payment {
	public googlepay(double amount) {
		super(amount);
	}
	public void pay() {
		System.out.println("paid amount: " + amount + " using googlepay");
	}
} 

class paymentprocess {
	public static<t extends payment> void paymentprocess(t payment) {
		payment.pay();
	}
}
public class generic_2 {
	public static void main(String[] args) {
		googlepay g = new googlepay(50000.00);
		paymentprocess.paymentprocess(g);
		creditcard c = new creditcard(15000.00);
		paymentprocess.paymentprocess(c);
		debitcard d = new debitcard(5000.00);
		paymentprocess.paymentprocess(d);
		
	}

}
