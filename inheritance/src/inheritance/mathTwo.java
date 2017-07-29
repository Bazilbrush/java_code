package inheritance;

public class mathTwo extends math {
	public void div(int a, int b){
		float c = a/b;
		System.out.println(c);
	}
	public void mult(int a, int b) {
		float c = a*b;
		System.out.println(c);
	}
	public void add(int a, int b){
		int c = a+b;
		System.out.println("blah :"+c);
	}
}
