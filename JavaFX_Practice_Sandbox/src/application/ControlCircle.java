package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	
	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hBox = new HBox();
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	// Inner Class
	class EnlargeHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			circlePane.enlarge();
		}		
		
	}
	
	
	// Inner Class
	class ShrinkHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			circlePane.shrink();
		}		
		
	}
	

}


class CirclePane extends StackPane {
	
	private Circle circle = new Circle(50);

	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BURLYWOOD);
	}
	public void enlarge() {
		circle.setRadius(circle.getRadius() + 2);
	}
	
//	public void shrink() {
//		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
//	}
	
	public void shrink() {
		circle.setRadius(circle.getRadius() > 2
		? circle.getRadius() - 2 : circle.getRadius());
		}
	
	
}
