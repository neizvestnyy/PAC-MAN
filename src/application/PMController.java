package application;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class PMController {
	
	@FXML
	StackPane stackPane;
	
	private view.Board view;
	private model.Board model;
	
    public void initialize() {
    	this.view = new view.Board();
    	this.stackPane.getChildren().add(this.view);
    	this.model = new model.Board();
    	this.view.setModel(this.model);
    	this.model.startGame();
    }

}
