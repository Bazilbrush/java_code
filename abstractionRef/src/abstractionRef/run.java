package abstractionRef;

public class run {

	public static void main(String[] args) {
		circle c =new circle();
	//	Drawing D=new Drawing();
		doDrawing(c);

	}
	static public void doDrawing(Draw x){
		x.Drawing();
	}

}
