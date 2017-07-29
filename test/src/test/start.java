package test;

public class start {

	public static void main(String[] args) {
			int input = 3419;
			//9999
			int x =input%1000;
			int y =input%100;
			int z =input%10;
			String output;
			String teens;
			int tens = y/10;
			//System.out.print(y);
			//System.out.print(z);
			
			switch (tens){
			
			case 2: 
			output = "twenty";
			System.out.println(output);
			break;
			
			case 3: 
			output = "thirty";
			System.out.println(output);
			break;
			case 4: 
				output = "fourty";
				System.out.println(output);
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
			//ones
			if (y < 10){
				switch (z){
				case 1: z = 1;
				output = "one";
				System.out.print(output);
				break;
				case 2: z = 2;
				output = "two";
				System.out.print(output);
				break;
				case 3: z = 3;
				output = "three";
				System.out.print(output);
				break;
				case 4: z = 4;
				output = "four";
				System.out.print(output);
				break;
				case 5: z = 5;
				output = "five";
				System.out.print(output);
				break;
				case 6: z = 6;
				output = "six";
				System.out.print(output);
				break;
				case 7: z = 7;
				output = "seven";
				System.out.print(output);
				break;
				case 8: z = 8;
				output = "eight";
				System.out.print(output);
				break;
				case 9: z = 9;
				output = "nine";
				System.out.print(output);
				break;
			
			} 
			} else {
			//teens
			switch (y){
				case 10: y = 10;
				teens = "ten";
				System.out.println(teens);
				break;
				case 11: 
				teens = "eleven";
				System.out.println(teens);
				break;
				
				case 12: 
				teens = "twelve";
				System.out.println(teens);
				break;
				case 13: 
				teens = "thirteen";
				System.out.println(teens);
				break;
				case 14: 
				teens = "fourteen";
				System.out.println(teens);
				break;
				case 15: 
				teens = "fifteen";
				System.out.println(teens);
				break;
				case 16: 
				teens = "sixteen";
				System.out.println(teens);
				break;
				
				case 17: 
				teens = "seventeen";
				System.out.println(teens);
				break;
				case 18: 
				teens = "eighteen";
				System.out.println(teens);
				break;
				case 19: 
				teens = "nineteen";
				System.out.println(teens);
				break;
			
			} 
			}
			//tens
			//System.out.println(tens);
			
		
		} 
			
			//System.out.println(x);
			}
	
			


