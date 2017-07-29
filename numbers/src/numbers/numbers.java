package numbers;

public class numbers {

	public static void main(String[] args) {
		int [] test = {79,79,79,23,42,1,16};

		int out=0;

		for (int i=0; i<test.length-1; i++){

			if(test[0] > test[i+1]){
				out =test[i];
				
			}
			System.out.println(out);
			}	
			//System.out.println(out);
			
			//System.out.println(out2);
		}
	}
		