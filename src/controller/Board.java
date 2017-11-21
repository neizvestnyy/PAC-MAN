package controller;

import javafx.scene.input.KeyEvent;

public class Board {
	
	private view.Board view;
	
	public Board(view.Board view) {
		this.view = view;
	}
	
	public void onKeyPressed(KeyEvent event) {
		this.view.getModel().onKeyPressed(event);
	}

}
