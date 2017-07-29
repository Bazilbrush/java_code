package word_range;

public class run {

	public static void main(String[] args) {
		for (int i = 120; i < 145; i++) {
		//int i = 123;
		int y = i%100;
		int z = i%10;
		int tens = y/10;
		int hund = i/100;
		String output;
		//System.out.println(hund);
		switch (hund){
		case 1: 
		output = "one hundred";
		System.out.print(output);
		break;
		case 2: 
		output = "two hundred";
		System.out.print(output);
		break;
		case 3: 
		output = "three hundred";
		System.out.print(output);
		break;
		case 4: 
		output = "fourhundred";
		System.out.print(output);
		break;
		case 5: 
		output = "five";
		System.out.print(output);
		break;
		case 6: 
		output = "six";
		System.out.print(output);
		break;
		case 7: 
		output = "seven";
		System.out.print(output);
		break;
		case 8: 
		output = "eight";
		System.out.print(output);
		break;
		case 9: 
		output = "nine";
		System.out.print(output);
		break;
        
		}
		System.out.print(" and ");
		switch (tens){
		
		case 2: 
		output = "twenty";
		System.out.print(output);
		break;
		
		case 3: 
		output = "thirty";
		System.out.print(output);
		break;
		case 4: 
			output = "fourty";
			System.out.print(output);
			break;
		case 5: 
			output = "fifty";
			System.out.println(output);
			break;
		case 6: 
			output = "sixty";
			System.out.println(output);
			break;
		case 7: 
			output = "seventy";
			System.out.println(output);
			break;
		
		
		case 8: 
			output = "eighty";
			System.out.println(output);
			break;
		case 9: 
			output = "ninety";
			System.out.println(output);
			break;
		}
		
			switch (z){
			case 1: z = 1;
			output = "-one";
			System.out.print(output);
			break;
			case 2: z = 2;
			output = "-two";
			System.out.print(output);
			break;
			case 3: z = 3;
			output = "-three";
			System.out.print(output);
			break;
			case 4: z = 4;
			output = "-four";
			System.out.print(output);
			break;
			case 5: z = 5;
			output = "-five";
			System.out.print(output);
			break;
			case 6: z = 6;
			output = "-six";
			System.out.print(output);
			break;
			case 7: z = 7;
			output = "-seven";
			System.out.print(output);
			break;
			case 8: z = 8;
			output = "-eight";
			System.out.print(output);
			break;
			case 9: z = 9;
			output = "=nine";
			System.out.print(output);
			break;
	
			}
           System.out.println();
		}
	}
}