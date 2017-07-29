package inheritance_constructor;

public class two extends one {
		public two(){
			super(1,7);
			System.out.println("a");
		}
		public two(int a){
			super(2,5);
			System.out.println("b");
		}
}
