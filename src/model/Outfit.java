package model;

abstract public class Outfit {
	
	String description = "Unknown Outfit";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int getCost();

}
