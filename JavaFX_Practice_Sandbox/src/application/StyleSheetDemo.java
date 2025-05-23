package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class StyleSheetDemo extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hBox = new HBox(5);
		Scene scene = new Scene(hBox, 300, 250);
		
		// Load the stylesheet
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Pane pane1 = new Pane();
		Circle circle1 = new Circle(50,50,30);
		Circle circle2 = new Circle(150, 50, 30);
		Circle circle3 = new Circle(100,100,30);
		pane1.getChildren().addAll(circle1, circle2, circle3);
		pane1.getStyleClass().add("border");
		
		circle1.getStyleClass().add("plaincircle");
		circle2.getStyleClass().add("plaincircle");
		circle3.setId("redcircle");
		
		Pane pane2 = new Pane();
		Circle circle4 = new Circle(100, 100, 30);
		circle4.getStyleClass().addAll("circleborder", "plainCircle");
		circle4.setId("greencircle"); // Add a style class
		pane2.getChildren().add(circle4);
		pane2.getStyleClass().add("border");
		hBox.getChildren().addAll(pane1, pane2);
		primaryStage.setTitle("StyleSheetDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
