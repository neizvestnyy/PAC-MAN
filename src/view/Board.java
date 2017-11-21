package view;

import java.util.Observable;
import java.util.Observer;

import application.Constants;

import static application.Constants.*;

import javafx.scene.Group;
import javafx.scene.image.ImageView;
import model.ModelEvent;

public class Board extends Group implements Observer {
	
	public class Tile extends ImageView {
		
		public Tile(int x, int y, model.Content content) {
			this.setX(x*8);
			this.setY(y*8);
			switch (content) {
				case WALL:
					this.setImage(WALL_PICTURE);
					break;
				case DOOR:
					this.setImage(DOOR_PICTURE);
					break;
				case DOT:
					this.setImage(DOT_PICTURE);
					break;
				case ENERGIZER:
					this.setImage(ENERGIZER_PICTURE);
					break;
//				case CHERRY:
//					this.setImage(CHERRY_PICTURE);
//					break;
//				case STRAWBERRY:
//					this.setImage(STRAWBERRY_PICTURE);
//					break;
//				case PEACH:
//					this.setImage(PEACH_PICTURE);
//					break;
//				case APPLE:
//					this.setImage(APPLE_PICTURE);
//					break;
//				case GRAPE:
//					this.setImage(GRAPE_PICTURE);
//					break;
//				case GALAXIAN:
//					this.setImage(GALAXIAN_PICTURE);
//					break;
//				case BELL:
//					this.setImage(BELL_PICTURE);
//					break;
//				case KEY:
//					this.setImage(KEY_PICTURE);
//					break;
				default:
					this.setImage(VOID_PICTURE);
			}
		}
		
	}
	
	public class Pac_Man extends ImageView {
		
		public Pac_Man(int x, int y) {
			this.setImage(Constants.PACMAN_PICTURE);
			this.setX(x*8-4);
			this.setY(y*8-4);
			this.setOnKeyPressed(event -> controller.onKeyPressed(event));
			this.setFocused(true);
		}
		
		public void update(int x, int y) {
			this.setX(x*8-4);
			this.setY(y*8-4);
		}

	}
	
	private controller.Board controller = new controller.Board(this);
	private Pac_Man pm;
	private model.Board model;
	private Tile[][] tiles;
	
	public void init() {
		int w = BOARD_WIDTH;
		int h = BOARD_HEIGHT;
		this.tiles = new Tile[w][h];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				Tile tile = new Tile(j, i, this.model.getTile(j, i).getContent());
				this.tiles[j][i] = tile;
				this.getChildren().add(tile);
			}
		}
		this.pm = new Pac_Man(14, 23);
		this.getChildren().add(this.pm);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		ModelEvent event = (ModelEvent) arg1;
		System.out.println(event);
		switch (event.eventType) {
			case START_EVENT:
				this.init();
				break;
			case EAT_FRUIT_EVENT:
				break;
			case EAT_GHOST_EVENT:
				break;
			case GAME_OVER_EVENT:
				break;
			case MOVE_EVENT:
				this.pm.update(event.x, event.y);
		}
	}
	
	public void setModel(model.Board m) {
		if(this.model != null){
			this.model.deleteObserver(this);
		}
		this.model = m;
		m.addObserver(this);
	}
	
	public model.Board getModel() {
		return this.model;
	}

}
