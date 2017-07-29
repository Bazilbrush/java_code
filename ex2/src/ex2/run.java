package ex2;

public class run {

	public static void main(String[] args) {
		int a =1;
		
		
		
		for (;a<10; a++) {
		//System.out.print(a);
		if (a%2 == 0){
			
			System.out.println(a);
			
		} else {
			///System.out.println("odd");
			for (int i=1; i<=a; i++){
				System.out.print (i);
				
			}
			System.out.println();
		}
		
		}
		
	}

}
