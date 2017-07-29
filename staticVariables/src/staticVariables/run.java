package staticVariables;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank hsbc, natWest;
		hsbc = new bank();
		natWest = new bank();
		hsbc.setDollar(23);
		natWest.dollarRate();
		natWest.setDollar(96);
		hsbc.convertMoney(200);
		natWest.convertMoney(100);
		}

}
