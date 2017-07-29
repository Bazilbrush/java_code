package findInString;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in 
		System.out.println("Type your sentence in!"); 
		String input = reader.nextLine();  
		System.out.println("Original Message: "+input); 
		Scanner search = new Scanner(System.in);
		System.out.println("Search for: ");
		String searchInp = search.nextLine();
		
		int counter=0;
		int index;
		//make char array to hold the data
		for (int i = 0; i<input.length() - searchInp.length(); i++){
			String search1 = input.substring(i, i+searchInp.length());
			if (search1.equals(searchInp)){
				
				counter +=1;
				index = i;
				System.out.println("at: "+index);
			}
		}
		System.out.println("found: "+counter);		
					
				
				
			
		
				
		//System.out.print(matchinglet);
				
			
		
		
		
	}
}		


