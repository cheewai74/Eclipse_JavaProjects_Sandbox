package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application{
	
	private CirclePane circlePane = new CirclePane();

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		hBox.getChildren().add(btnEnlarge);
		hBox.getChildren().add(btnShrink);
		
		// Create and register the handler
		btnEnlarge.setOnAction(e -> circlePane.enlarge());
		btnShrink.setOnAction(e -> circlePane.shrink());
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		borderPane.setAlignment(hBox, Pos.CENTER);
				
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("ControlCircleWithMouseAndKey");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		circlePane.setOnMouseClicked(e -> {
			if(e.getButton() == MouseButton.PRIMARY) {
				circlePane.enlarge();
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				circlePane.shrink();
			}
		});
		
		scene.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) {
				circlePane.enlarge();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				circlePane.shrink();
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
