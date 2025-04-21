package application;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo{
	
	@Override
	protected BorderPane getPane() {
		// TODO Auto-generated method stub
		
		BorderPane pane = super.getPane();
		VBox panelForRadioButtons = new VBox(20);
		panelForRadioButtons.setPadding(new Insets(5,5,5,5));
		panelForRadioButtons.setStyle("-fx-border-color: green");
		
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");
		panelForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
		pane.setLeft(panelForRadioButtons);
		
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbBlue.setToggleGroup(group);
		
		rbRed.setOnAction( e->{
			if (rbRed.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		
		rbGreen.setOnAction(e ->{
			if (rbGreen.isSelected()){
				text.setFill(Color.GREEN);
			}
		});
		
		rbBlue.setOnAction( e -> {
			if (rbBlue.isSelected()) {
				text.setFill(Color.BLUE);
			}
		});
		return pane;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
