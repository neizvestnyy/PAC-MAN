package model;

public class Ghost {
	
	private Point coords;
	private boolean isVulnerable;
	private static final int EARNINGS = 200;
	
	public Ghost() {
		
	}
	
	public boolean isVulnerable() {
		return this.isVulnerable;
	}
	
	public void isVulnerable(boolean v) {
		this.isVulnerable = v;
	}

}
