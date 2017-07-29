
public class run {

	public static void main(String[] args) {
		int decimal =0;
		int p = 0;
		int BinaryNumber = 1011;
		while(true){
			if(BinaryNumber == 0){
				break;
			} else {
				int temp = BinaryNumber%10;
				decimal +=temp*Math.pow(2, p);
				BinaryNumber = BinaryNumber/10;
				p++;
			}
		}
		System.out.println(decimal);
	}

}
