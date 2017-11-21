package model;

import java.util.Observable;

import javafx.scene.input.KeyEvent;

import static application.Constants.*;

public class Board extends Observable {
	
	private Tile[][] tiles;
	private Pac_Man pm;
	
	public Board() {
		this.tiles = new Tile[BOARD_WIDTH][BOARD_HEIGHT];
		this.buildBoard(0);
		this.pm = new Pac_Man(14, 23);
	}
	
	public void buildBoard(int type) {
		if (type >= BOARDS.length)
			throw new IllegalArgumentException("Unknown board type");
		String[] lines = BOARDS[type].split("\\n");
		for (int l = 0; l < BOARD_HEIGHT; l++) {
			String line = lines[l];
			for (int c = 0; c < BOARD_WIDTH; c++) {
				char character = line.charAt(c);
				switch (character) {
					case '#':
						this.tiles[c][l] = new Tile(c, l, Content.WALL);
						break;
					case '.':
						this.tiles[c][l] = new Tile(c, l, Content.DOT);
						break;
					case 'o':
						this.tiles[c][l] = new Tile(c, l, Content.ENERGIZER);
						break;
					case '-':
						this.tiles[c][l] = new Tile(c, l, Content.DOOR);
						break;
					default:
						this.tiles[c][l] = new Tile(c, l, Content.VOID);
				}
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		return this.tiles[x][y];
	}
	
	public void onKeyPressed(KeyEvent event) {
		switch (event.getCode()) {
			case LEFT:
				this.pm.moveX(-1);
				this.setChanged();
				this.notifyObservers(new ModelEvent(EventType.MOVE_EVENT, this.pm.getX(), this.pm.getY()));
				break;
			case RIGHT:
				this.pm.moveX(1);
				this.setChanged();
				this.notifyObservers(new ModelEvent(EventType.MOVE_EVENT, this.pm.getX(), this.pm.getY()));
				break;
			case UP:
				this.pm.moveY(-1);
				this.setChanged();
				this.notifyObservers(new ModelEvent(EventType.MOVE_EVENT, this.pm.getX(), this.pm.getY()));
				break;
			case DOWN:
				this.pm.moveY(1);
				this.setChanged();
				this.notifyObservers(new ModelEvent(EventType.MOVE_EVENT, this.pm.getX(), this.pm.getY()));
				break;
			default:
				
		}
	}
	
	public void startGame() {
		this.setChanged();
		this.notifyObservers(new ModelEvent(EventType.START_EVENT));
	}
	
}
