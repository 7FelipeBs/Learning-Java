package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;
	@FXML
	private Button btSum;

	
	@FXML
	public void onBtnSumAction() {
		Locale.setDefault(Locale.US);
		
		try {
			FormatResultNumber(SumNumbers());
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error format Number", null, e.getMessage(), AlertType.ERROR);
		}
	}
	
	
	private void FormatResultNumber(Double number) {
		if(number % 1 != 0) {
			 labelResult.setText(String.format("%.2f", number));
		}
		else{
			labelResult.setText(String.format("%.0f", number));
		}
	}
	
	private double SumNumbers() {
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		return number1 + number2;
	}
}
