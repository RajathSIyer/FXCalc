package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	private Button button0;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button buttonX;
	@FXML
	private Button buttonDiv;
	@FXML
	private Button buttonAdd;
	@FXML
	private Button buttonSub;
	@FXML
	private Button buttonDec;
	@FXML
	private Button buttonEq;
	private static String val = ""; 
	private int x = 0;
	private int y = 0;
	private boolean check = false;
	@FXML
	private Label label;
	@FXML
	private void handleButtonAction(ActionEvent e)
	
	{
	
		if (e.getSource() == button1) {
	        val += "1";
	        System.out.println("1");
	    } else if (e.getSource() == button2) {
	    	val += "2";
	    } else if (e.getSource() == button3) {
	    	val += "3";
	    } else if (e.getSource() == button4) {
	    	val += "4";
	    } else if (e.getSource() == button5) {
	    	val += "5";
	    } else if (e.getSource() == button6) {
	    	val += "6";
	    } else if (e.getSource() == button7) {
	    	val += "7";
	    } else if (e.getSource() == button8) {
	    	val += "8";
	    } else if (e.getSource() == button9) {
	    	val += "9";
	    } else if (e.getSource() == button0) {
	    	val += "0";
	    } else if (e.getSource() == buttonDec) {
	    	val += ".";
	    } 
	    
	    else if (e.getSource() == buttonAdd) {
	    	val += "+";
	    	y = 0;
	    	x = val.indexOf("+");
	    } 
	    else if (e.getSource() == buttonSub) {
	    	val += "-";
	    	y = 1;
	    	x = val.indexOf("-");
	    }
	    else if (e.getSource() == buttonDiv) {
	    	val += "/";
	    	y = 2;
	    	x = val.indexOf("/");
	    }
	    else if (e.getSource() == buttonX) {
	    	val += "X";
	    	y = 3;
	    	x = val.indexOf("X");
	    } 
	    else 
	    {
	    	check = true;
	    	System.out.println(val.substring(0,x));
	    	Float numOne = Float.parseFloat(val.substring(0,x));
	    	Float numTwo = Float.parseFloat(val.substring(x+1,val.length()));
	    	val += "=";
	    	System.out.println(numOne);
	    	System.out.print(numTwo);
	    	switch(y)
	    	{
	    	case 0:
	    		val += String.valueOf(numOne + numTwo);
	    		break;
	    	case 1:
	    		val += String.valueOf(numOne - numTwo);
	    		break;
	    	case 2:
	    		val += String.valueOf(numOne / numTwo);
	    		break;
	    	case 3:
	    		val += String.valueOf(numOne * numTwo);
	    		break;
	    	}
	    }
		label.setText(val);
		if(check == true)
		{
			check = false;
			val = "";
		}
		System.out.println(val);
		
	    } 
}
