package gui;

import java.awt.*;
import java.awt.event.*;



public class ext implements ActionListener {
	TextField X,Y, Z;
	public ext(TextField T1, TextField T2,TextField T3){
		X =T1;
		Y=T2;
		Z=T3;
	}
	public void actionPerformed(ActionEvent x){
		int A,B,C;
		A=Integer.parseInt(X.getText());
		B=Integer.parseInt(Y.getText());
		C=A+B;
		Z.setText(Integer.toString(C));
	}

}
