package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application{
	
	 

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(getPane(),800, 400);
		primaryStage.setTitle("Button Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        launch(args);
	}
	
	protected Text text = new Text(50, 50, "JAVA FX GUI Programming Practice");
	
	protected BorderPane getPane() {
		
		HBox paneForButtons = new HBox(20);
		Button btLeft = new Button(
				"Left", new ImageView(getClass().getResource("left.png").toExternalForm())
				);
		Button btRight = new Button(
				"Right", new ImageView(getClass().getResource("Right.png").toExternalForm())
				);
		paneForButtons.getChildren().addAll(btLeft, btRight);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: green");
			
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setCenter(paneForText);
		
		btLeft.setOnAction(e -> text.setX(text.getX() - 10));
		btRight.setOnAction(e -> text.setX(text.getX() +10));
		return pane;
		
	}

}
