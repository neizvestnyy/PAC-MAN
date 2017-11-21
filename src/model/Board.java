package model;

import java.util.Observable;
import static application.Constants.*;

public class Board extends Observable {
	
	private final String INITIAL_BOARD = 
			  "############################\n"
			+ "#............##............#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#o####.#####.##.#####.####o#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#..........................#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#.####.##.########.##.####.#\n"
			+ "#......##....##....##......#\n"
			+ "######.##### ## #####.######\n"
			+ "     #.##### ## #####.#     \n"
			+ "     #.##          ##.#     \n"
			+ "     #.## ###--### ##.#     \n"
			+ "######.## #      # ##.######\n"
			+ "      .   #      #   .      \n"
			+ "######.## #      # ##.######\n"
			+ "     #.## ######## ##.#     \n"
			+ "     #.##          ##.#     \n"
			+ "     #.## ######## ##.#     \n"
			+ "######.## ######## ##.######\n"
			+ "#............##............#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#.####.#####.##.#####.####.#\n"
			+ "#o..##.......  .......##..o#\n"
			+ "###.##.##.########.##.##.###\n"
			+ "###.##.##.########.##.##.###\n"
			+ "#......##....##....##......#\n"
			+ "#.##########.##.##########.#\n"
			+ "#.##########.##.##########.#\n"
			+ "#..........................#\n"
			+ "############################";
	private Tile[][] tiles;
	
	public Board() {
		this.tiles = new Tile[BOARD_WIDTH][BOARD_HEIGHT];
		this.buildBoard();
	}

	private void buildBoard() {
		String[] lines = INITIAL_BOARD.split("\\n");
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
	
}
