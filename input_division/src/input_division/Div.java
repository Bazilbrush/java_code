package input_division;

public class Div {
	public void Divide(int x, int y)throws MyExp{
		int z =0;
		if (x<y){
			MyExp Error = new MyExp();
			//System.out.println("x is smaller than y ERROR");
			throw Error;
			
		} else {
			z = x/y;
			System.out.println(z);
		}
	}
}
