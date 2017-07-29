package pointers;

public class bank {
	int a;
	static bank R;
	private bank(){}
	public void MSG(){
		System.out.println("Hello!");
	}
	public static bank Create(){
		if (R==null){
			R = new bank();
		}
		return R;
	}
	
}
