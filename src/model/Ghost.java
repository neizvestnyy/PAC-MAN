package model;

public class Ghost extends Entity {
	
	private boolean isVulnerable;
	
	public Ghost() {
		
	}
	
	public boolean isVulnerable() {
		return this.isVulnerable;
	}
	
	public void isVulnerable(boolean v) {
		this.isVulnerable = v;
	}

}
