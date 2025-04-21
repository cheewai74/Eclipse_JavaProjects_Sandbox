package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application{

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		HBox pane = new HBox(10);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		
		
		pane.getChildren().addAll(btOK, btCancel);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

class OKHandlerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("OK button clicked");
	}
	
}

class CancelHandlerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Cancel button clicked");
	}
	
}


