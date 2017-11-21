package model;

public enum Content {
	
	WALL(0), VOID(0), DOOR(0), DOT(10), ENERGIZER(50), CHERRY(100), STRAWBERRY(300),
	PEACH(500), APPLE(700), GRAPE(1000), GALAXIAN(2000), BELL(3000), KEY(5000);
	
	private int earnings;
	
	Content(int earning) {
		this.earnings = earnings;
	}
	
	public int getEarnings() {
		return this.earnings;
	}

}
