package gui;

import java.awt.*;

public class Window {

	public static void main(String[] args) {
		Frame Win = new Frame("Calculator");
		Win.setSize(500, 300);
		Win.setVisible(true);
		TextField T1 = new TextField(10);
		TextField T2 = new TextField(10);
		TextField T3 = new TextField(10);
		Button B1 = new Button("=");
		
		
		Win.add(B1);
		ext E = new ext(T1, T2, T3);
		FlowLayout Fl = new FlowLayout();
		Win.setLayout(Fl);
		Win.add(new Label("No1: "));
		Win.add(T1);
		Win.add(new Label("+: "));
		Win.add(new Label("No2: "));
		Win.add(T2);
		Win.add(T3);
		B1.addActionListener(E);
		
	}

}
