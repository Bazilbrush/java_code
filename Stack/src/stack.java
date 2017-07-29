import java.util.Arrays;

public class stack {
	
		int [] stack = { 1, 4, 3, 7, 0};
		
		
		public void push(int input){
			int temp;
			int temp1;
			for (int i= 4; i >0; i--){
				stack[i] = stack[i-1];
					
				}
			stack[0] = input;
				
				
				System.out.println(Arrays.toString(stack));
			}
		public int pop(){
			int read = stack[0];
			for (int i = 0; i <stack.length-1; i++){
				stack[i] = stack[i+1];
				
			}
			stack[4] = 0;
			System.out.println(Arrays.toString(stack));
			return read;	
		} 
		
		public int peek (){
			return stack[0];
		}
		public void clear(){
			for (int i =0; i<stack.length-1; i++){
			
				stack[i] =0;
			}
		}
			
		}

