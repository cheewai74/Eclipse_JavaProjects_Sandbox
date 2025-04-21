package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ShowLine extends Application{
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane1 = new Pane();
		Line line1 = new Line(10,10,10,10);
		line1.endXProperty().bind(pane1.widthProperty().subtract(10));
		line1.endYProperty().bind(pane1.heightProperty().subtract(10));
		line1.setStrokeWidth(10);
		line1.setStroke(Color.GREEN);
		pane1.getChildren().add(line1);
		Line line2 = new Line(10,10,10,10);
		line2.startXProperty().bind(pane1.widthProperty().subtract(10));
		line2.endYProperty().bind(pane1.heightProperty().subtract(10));
		line2.setStrokeWidth(10);
		line2.setStroke(Color.GREEN);
		pane1.getChildren().add(line2);
		
		Scene scene = new Scene(pane1, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
