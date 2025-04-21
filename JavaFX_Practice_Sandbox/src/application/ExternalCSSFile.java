/**
 * 
 */
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Java External CSS Style file
 */
public class ExternalCSSFile extends Application {

	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated constructor stub
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass()
					.getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

    

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
