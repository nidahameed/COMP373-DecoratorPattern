package model;

public class Earrings extends AccessoriesDecorator {
	
	Outfit outfit;
	
	public Earrings(Outfit outfit) {
		this.outfit = outfit;
	}
	
	public String getDescription() {
		return outfit.getDescription() + ", Earrings";
	}
	
	public int getCost() {
		return 15 + outfit.getCost();
	}
	

}
