package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ContextMenuDemo  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		ContextMenu contextMenu = new ContextMenu();
		MenuItem menuItemNew = new MenuItem("New", new ImageView(getClass().getResource("New.png").toExternalForm()));
		MenuItem menuItemOpen = new MenuItem("Open", new ImageView(getClass().getResource("open.png").toExternalForm()));
		MenuItem menuItemPrint = new MenuItem("Print", new ImageView(getClass().getResource("Print.png").toExternalForm()));
		MenuItem menuItemExit = new MenuItem("Exit");
		contextMenu.getItems().addAll(menuItemNew, menuItemOpen, menuItemPrint, menuItemExit);
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setTitle("ContextMenuDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.setOnMousePressed( e-> contextMenu.show(pane, e.getScreenX(), e.getScreenY()));
		
		menuItemNew.setOnAction(e -> System.out.println("New"));
		menuItemOpen.setOnAction(e -> System.out.println("Open"));
		menuItemPrint.setOnAction(e -> System.out.println("Print"));
		menuItemExit.setOnAction(e -> System.out.println("Exit"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
