package application;

import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoanCalculator extends Application{
	
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumnerOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	private Button btCalculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
		gridPane.add(tfAnnualInterestRate, 1, 0);
		gridPane.add(new Label("Number Of Years"), 0, 1);
		gridPane.add(tfNumnerOfYears, 1, 1);
		gridPane.add(new Label("Loan Amount"), 0, 2);
		gridPane.add(tfLoanAmount, 1, 2);
		gridPane.add(new Label("Monthly Payment"), 0, 3);
		gridPane.add(tfMonthlyPayment, 1, 3);
		gridPane.add(new Label("Total Payment"), 0, 4);
		gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(btCalculate, 1, 5);
		btCalculate.setOnAction(e -> calculateLoanPayment());
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("LoanCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void calculateLoanPayment() {
		
		double interest = Double.parseDouble(tfAnnualInterestRate.getText());
		int year = Integer.parseInt(tfNumnerOfYears.getText());
		double loanAmount = Double.parseDouble(tfLoanAmount.getText());
		Loan loan = new Loan(interest, year, loanAmount);
		tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
		tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

class Loan implements java.io.Serializable{
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	public double getTotalPayment() {
		
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / ( 1 
				- (Math.pow(1/ ( 1+  monthlyInterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}
	
	
}
