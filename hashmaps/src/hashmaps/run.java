package hashmaps;

import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		hashmap x = new hashmap();
		for (int i=0; i<10; i++){
			Scanner reader = new Scanner(System.in);  // Reading from System.in 
			System.out.println("Type variable x"); 
			String input = reader.nextLine();
			Scanner reader1 = new Scanner(System.in);  // Reading from System.in 
			System.out.println("Type variable y");
			String input1 = reader.nextLine();
			int inpX = Integer.parseInt(input);
			int inpY = Integer.parseInt(input1);
			x.map(inpX, inpY, i);
		}

	}

}
