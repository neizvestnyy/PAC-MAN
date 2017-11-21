package model;

public class ModelEvent {
	
	public int x;
	public int y;
	public EventType eventType;
	
	public ModelEvent(EventType e, int x, int y) {
		this.x = x;
		this.y = y;
		this.eventType = e;
	}
	
	public ModelEvent(EventType e) {
		this.x = -1;
		this.y = -1;
		this.eventType = e;
	}
	
	@Override
	public String toString() {
		return String.format("%s at (%s, %s)", eventType, x, y);
	}

}
