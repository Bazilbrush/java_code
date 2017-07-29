package input_division;

import java.util.Scanner;

public class Division {

	public static void main(String input[]) {
		// TODO Auto-generated method stub
		
		//Scanner reader = new Scanner(System.in);  // Reading from System.in 
		//System.out.println("Type something in!"); 
		//input[0] = reader.next();
		//input[1] = reader.next();
		//reader.close();
		
		int A,B,C;
		A=B=C=0;
		try{
		A= Integer.parseInt(input[0]);
		B= Integer.parseInt(input[1]);
		Div x = new Div();
		x.Divide(A, B);
		
		}
		catch(ArithmeticException x){
			System.out.println("division by ZERO");
		}
		catch(ArrayIndexOutOfBoundsException x){
			System.out.println("number of variables passed is wrong");
		}
		catch(MyExp x){
			System.out.println("blah");
		}
		catch(Exception x){
			System.out.println("Something went wrong");
		}
		System.out.println(C);

	}

}
