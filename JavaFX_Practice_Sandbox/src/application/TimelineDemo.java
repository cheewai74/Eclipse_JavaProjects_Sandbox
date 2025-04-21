package application;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineDemo extends Application {
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		StackPane pane = new StackPane();
		Text text = new Text(20, 50, "Gong Xi Fai Cai");
		text.setFill(Color.RED);
		pane.getChildren().add(text);
		
		// Create a handler for changing text
		EventHandler<ActionEvent> eH = e -> {
			if(text.getText().length() != 0) {
				text.setText("");
			}
			else {
				text.setText("Gong Xi Fai Cai");
			}
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(500), eH));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		//Pause and resume animation
		text.setOnMouseClicked(e -> {
			if (animation.getStatus() ==
					Animation.Status.PAUSED) {
				animation.play();
			}
			else {
				text.setText("Gong Xi Fai Cai");
			}
			
		});
		
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("TimelineDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
