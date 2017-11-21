package model;

public class Pac_Man extends Entity {
	
	public Pac_Man(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveX(int dx) {
		this.x += dx;
	}
	
	public void moveY(int dy) {
		this.y += dy;
	}

}
