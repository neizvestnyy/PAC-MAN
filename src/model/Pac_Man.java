package model;

import java.util.Observable;

public class Pac_Man extends Observable {
	
	private Point coords;
	
	public Pac_Man(int x, int y) {
		this.coords = new Point(x, y);
	}
	
	public int getX() {
		return this.coords.getX();
	}
	
	public int getY() {
		return this.coords.getY();
	}
	
	public void setX(int x) {
		this.setChanged();
		this.notifyObservers(new MoveEvent(x, this.coords.getY()));
		this.coords.setX(x);
	}
	
	public void setY(int y) {
		this.setChanged();
		this.notifyObservers(new MoveEvent(this.coords.getX(), y));
		this.coords.setY(y);
	}

}
