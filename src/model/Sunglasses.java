package model;

public class Sunglasses extends AccessoriesDecorator {
	
	Outfit outfit;
		
		public Sunglasses(Outfit outfit) {
			this.outfit = outfit;
		}
		
		public String getDescription() {
			return outfit.getDescription() + ", Sunglasses";
		}
		
		public int getCost() {
			return 7 + outfit.getCost();
		}
		

}
