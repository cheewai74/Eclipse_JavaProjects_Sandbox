package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class CheckBoxDemo extends ButtonDemo{

	@Override
	protected BorderPane getPane() {
		// TODO Auto-generated method stub
		
		BorderPane pane = super.getPane();
		Font fontBoldItalic = Font.font("Times New Roman",
				FontWeight.BOLD, FontPosture.ITALIC, 20);
		Font fontBold = Font.font("Times New Roman",
				FontWeight.BOLD, FontPosture.REGULAR, 20);	
		Font fontItalic = Font.font("Times New Roman",
				FontWeight.NORMAL, FontPosture.ITALIC, 20);
		Font fontNormal = Font.font("Times New Roman",
				FontWeight.NORMAL, FontPosture.REGULAR, 20);
		text.setFont(fontNormal);
		
		VBox panelForCheckBoxes = new VBox(20);
		panelForCheckBoxes.setPadding(new Insets(5,5,5,5));
		panelForCheckBoxes.setStyle("-fx-border-color: green");
		
		
		CheckBox chkBold = new CheckBox("Bold");
		CheckBox chkItalic = new CheckBox("Italic");
		panelForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
		pane.setRight(panelForCheckBoxes);
		
		EventHandler<ActionEvent> handler = e ->{
			if(chkBold.isSelected() && chkItalic.isSelected()) {
				text.setFont(fontBoldItalic);
			} else if (chkBold.isSelected()) {
				text.setFont(fontBold);
			} else if (chkItalic.isSelected()) {
				text.setFont(fontItalic);
			}
			else {
				text.setFont(fontNormal);
			}
		};
		
		chkBold.setOnAction(handler);
		chkItalic.setOnAction(handler);
		
		return pane;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
