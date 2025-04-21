package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application{
	
	private String[] fruit_list = {
			"Banana", "Dragon Fruit", 
			"Durian", "Mangosteen", 
			"Rambutan","Soursop",
			"Star Fruit"
			};
	
	private ImageView[] ImageViews = {
			new ImageView(getClass().getResource("banana.jpg").toExternalForm()),
			new ImageView(getClass().getResource("dragonfruit.jpg").toExternalForm()),
			new ImageView(getClass().getResource("durian.jpg").toExternalForm()),
			new ImageView(getClass().getResource("mangosteen.jpg").toExternalForm()),
			new ImageView(getClass().getResource("rambutan.jpg").toExternalForm()),
			new ImageView(getClass().getResource("soursop.jpg").toExternalForm()),
			new ImageView(getClass().getResource("starfruit.jpg").toExternalForm())
	};

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		ListView<String> lv = 
				new ListView<>(
						FXCollections.observableArrayList(fruit_list)
						);
		lv.setPrefSize(400, 400);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		// Create a pane to hold image views
		FlowPane imagePane  = new FlowPane(10, 10);
		BorderPane pane = new BorderPane();
		pane.setLeft(new ScrollPane(lv));
		pane.setCenter(imagePane);
		
		lv.getSelectionModel().selectedItemProperty().addListener(
				ov ->{
					imagePane.getChildren().clear();
					for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
						imagePane.getChildren().add(ImageViews[i]);
					}
				}
				);
		
		Scene scene = new Scene(pane, 600, 200);
		primaryStage.setTitle("ListViewDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
