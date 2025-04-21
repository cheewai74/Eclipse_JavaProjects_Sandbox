package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaDemoHandler extends Application {
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		HBox hBox = new HBox();
		Button btNew = new Button("New");
		Button btOpen = new Button("Open");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		
		hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);
		
//	    Lamda expression:
//		(type1 param1, type2 param2, ...) -> expression
//		or
//		(type1 param1, type2 param2, ...) -> { statements; }
//		
		
		btNew.setOnAction(e -> {System.out.println("Process New");});
		btOpen.setOnAction(e -> {System.out.println("Process Open");});
		btSave.setOnAction(e -> {System.out.println("Process Save");});
		btPrint.setOnAction(e -> {System.out.println("Process Print");});
		
		Scene scene = new Scene(hBox, 300, 50);
		primaryStage.setTitle("LambdaDemoHandler");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
