package model;

public class Tile {
	
	private Content content;
	private Point coords;
	
	public Tile(int x, int y, Content content) {
		this.content = content;
		this.coords = new Point(x, y);
	}
	
	public Content getContent() {
		return this.content;
	}
	
	public int getX() {
		return this.coords.getX();
	}
	
	public int getY() {
		return this.coords.getY();
	}

}
