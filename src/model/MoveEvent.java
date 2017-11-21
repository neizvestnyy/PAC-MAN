package model;

public class MoveEvent {
	
	public final int x;
	public final int y;
	
	public MoveEvent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("MoveEvent : %1$2s , %2$2s", this.x, this.y);
	}
	
}