package ch07.exam02;

import java.util.Objects;

public class Location {
	private String name;
	private int x;
	private int y;
	public Location() {}
	
	public Location(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		Location lc = new Location();
		if(obj instanceof Location) {
			lc = (Location)obj;
		}
		else return false;
		
		return this.name.equalsIgnoreCase(lc.name) && this.x == lc.x && this.y == lc.y;
	}
	
	@Override
	public String toString() {
		return name + " " + x + " " + y;
	}
	
	
}
