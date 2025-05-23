package application;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application{
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle(0, 0, 25, 50);
		rectangle.setFill(Color.GREEN);
		Circle circle = new Circle(125, 100, 50);
		circle.setFill(Color.WHEAT);
		pane.getChildren().addAll(circle, rectangle);
		
		// Create a path transition
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(circle);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		circle.setOnMouseClicked(e -> pt.pause());
		circle.setOnMouseReleased(e -> pt.play());
		
		
		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("PathTransitionDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
