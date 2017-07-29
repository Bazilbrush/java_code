
public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer two = new Outer();
		two.display_inner();
	}

}


class Outer{
	int num;
	private class InnerClass{
		public void print(){
			System.out.println("this is an inner class");
		}
	}
	void display_inner(){
		InnerClass one = new InnerClass();
		one.print();
		
	}

}

//Anonymous class
class Test {
    void f() {
        // lots of stuff
        new Thread(new Runnable() {
            public void run() {
                //doSomethingBackgroundish();
            }
        }).start();
        // lots more stuff
    }
}