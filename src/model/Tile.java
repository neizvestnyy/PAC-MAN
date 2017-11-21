package model;

public class Tile {
	
	private Content content;
	private int x;
	private int y;
	
	public Tile(int x, int y, Content content) {
		this.content = content;
		this.x = x;
		this.y = y;
	}
	
	public Content getContent() {
		return this.content;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

}
