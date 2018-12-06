package polyMorPhism;

public class TestBankAccount {

	public static void main(String[] args) {
		MyAccount ac = new MyAccount();
		ac.account(10);
		ac.account("abc");
		ac.account(20, 30);
		ac.account(40, "ert");
		ac.account("abc", 50);
		

	}

}
