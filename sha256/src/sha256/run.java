package sha256;

import java.util.List;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		//type shit in
		Scanner reader = new Scanner(System.in);  // Reading from System.in 
		System.out.println("Type something in!"); 
		String input = reader.nextLine();  
		System.out.println("Original Message: "+input); 
		//start preparing the message-------------------------
		preProcess x = new preProcess();
		//pad
		String test =x.padMes(input);  //output to a temp string
		//to hex
		
		List<String> temp = x.toHex(test);  //
		//extend the array with some bit rotations
		List<String> extended = x.extend(temp);
		//System.out.println(extended);
		x.compressor(extended);
	}

}
