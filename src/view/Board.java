package view;

import java.util.Observable;
import java.util.Observer;

import static application.Constants.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Board extends GridPane implements Observer {
	
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
				case CHERRY:
					this.setImage(CHERRY_PICTURE);
					break;
				case STRAWBERRY:
					this.setImage(STRAWBERRY_PICTURE);
					break;
				case PEACH:
					this.setImage(PEACH_PICTURE);
					break;
				case APPLE:
					this.setImage(APPLE_PICTURE);
					break;
				case GRAPE:
					this.setImage(GRAPE_PICTURE);
					break;
				case GALAXIAN:
					this.setImage(GALAXIAN_PICTURE);
					break;
				case BELL:
					this.setImage(BELL_PICTURE);
					break;
				case KEY:
					this.setImage(KEY_PICTURE);
					break;
				default:
					this.setImage(VOID_PICTURE);
			}
		}
		
	}
	
	//private controller.Board controller = new controller.Board(this);
	private model.Board model;
	private Tile[][] tiles;
	
	public void init() {
		int w = BOARD_WIDTH;
		int h = BOARD_HEIGHT;
		this.tiles = new Tile[w][h];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				this.tiles[i][j] = new Tile(i, j, this.model.getTile(i, j).getContent());
			}
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
	}

}
