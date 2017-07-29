package pointers;

public class run {

	public static void main(String[] args) {
		bank HSBC, Barclays, NatWest;
		HSBC = bank.Create();
		Barclays = bank.Create();
		NatWest = bank.Create();
		HSBC.a = 20;
		System.out.println(NatWest.a);
	}

}
