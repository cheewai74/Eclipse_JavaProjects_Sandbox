package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HTMLDemo extends Application{
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		WebView browser = new WebView();
		WebEngine webEngine = browser.getEngine();
		webEngine.loadContent("<html><b><u>T</u>wo</b><br>lines</html>");
		
		StackPane root = new StackPane();
		root.getChildren().add(browser);
		
		Scene scene = new Scene(root, 100, 150);
		primaryStage.setTitle("HTMLDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
