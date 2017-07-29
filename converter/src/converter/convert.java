package converter;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		String N ="I am going to london";
			//int wordCount = 0;
		//String word ="";
			for (int i = N.length()-1; i>= 0; i--  ){
				String step = N.substring(i, i+1);
				//System.out.print(step);
				
				if (step.equals(" ")){
					//wordCount++;
					for (int x = i+1; x<N.length(); x++ ){
						String word = N.substring(x, x+1);
						System.out.print(word);
						if( word.equals(" ")){
							break;
						}
					}
					System.out.println();
					
				} 
				if(i == 0){
					System.out.println(step);
				}
				
				//System.out.println(word);
			}
			//System.out.println(wordCount+1);
	}

}
