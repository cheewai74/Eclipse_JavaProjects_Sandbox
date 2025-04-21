package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuDemo extends Application{
	
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		MenuBar menuBar = new MenuBar();
		
		Menu menuOperation = new Menu("Operation");
		Menu menuExit = new Menu("Exit");
		menuBar.getMenus().addAll(menuOperation, menuExit);
		
		MenuItem menuItemAdd = new Menu("Add");
		MenuItem menuItemSubtract = new Menu("Subtract");
		MenuItem menuItemMultiply = new Menu("Multiply");
		MenuItem menuItemDivide = new Menu("Divide");
		menuOperation.getItems().addAll(
				menuItemAdd, menuItemSubtract,
				menuItemMultiply, menuItemDivide
				);
		
		MenuItem menuItemClose = new MenuItem("Close");
		menuExit.getItems().add(menuItemClose);
		
		menuItemAdd.setAccelerator(
				KeyCombination.keyCombination("Ctrl+A"));
		menuItemSubtract.setAccelerator(
				KeyCombination.keyCombination("Ctrl+S"));
		menuItemMultiply.setAccelerator(
				KeyCombination.keyCombination("Ctrl+M"));
		menuItemDivide.setAccelerator(
				KeyCombination.keyCombination("Ctrl+D"));
		
		HBox hBox1 = new HBox(5);
		tfNumber1.setPrefColumnCount(2);
		tfNumber2.setPrefColumnCount(2);
		tfResult.setPrefColumnCount(2);
		hBox1.getChildren().addAll(
				new Label("Number 1:"), tfNumber1, 
				new Label("Number 2:"), tfNumber2,
				new Label("Result:"), tfResult);
		hBox1.setAlignment(Pos.CENTER);
		
		
		HBox hBox2 = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");
		hBox2.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
		hBox2.setAlignment(Pos.CENTER);
		
		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(menuBar, hBox1, hBox2);
		Scene scene = new Scene(vBox, 600, 450);
		primaryStage.setTitle("MenuDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Handle menu actions
		menuItemAdd.setOnAction(e -> perform('+'));
		menuItemAdd.setOnAction(e -> perform('-'));
		menuItemAdd.setOnAction(e -> perform('*'));
		menuItemAdd.setOnAction(e -> perform('/'));
		menuItemAdd.setOnAction(e -> System.exit(0));
		
		//Handle button actions
		btAdd.setOnAction(e -> perform('+'));
		btSubtract.setOnAction(e -> perform('-'));
		btMultiply.setOnAction(e -> perform('*'));
		btDivide.setOnAction(e -> perform('/'));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void perform(char operator) {
		
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		
		double result = 0;
		
		switch(operator) {
		
			case '+': result = number1 + number2; break;
			case '-': result = number1 - number2; break;
			case '*': result = number1 * number2; break;
			case '/': result = number1 / number2; break;
		}
		
		tfResult.setText(result + "");
	}
	
	

}
