package model;

public class Necklace extends AccessoriesDecorator {
	
	Outfit outfit;
	
		public Necklace (Outfit outfit) {
			this.outfit = outfit;
		}
		
		public String getDescription() {
			return outfit.getDescription() + ", Necklace ";
		}
		
		public int getCost() {
			return 20 + outfit.getCost();
		}
		

}
