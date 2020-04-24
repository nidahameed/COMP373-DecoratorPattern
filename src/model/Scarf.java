package model;

public class Scarf extends AccessoriesDecorator {
	
	Outfit outfit;
		
		public Scarf(Outfit outfit) {
			this.outfit = outfit;
		}
		
		public String getDescription() {
			return outfit.getDescription() + ", Scarf";
		}
		
		public int getCost() {
			return 10 + outfit.getCost();
		}
		

}
