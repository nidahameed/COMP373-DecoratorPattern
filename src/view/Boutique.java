package view;
import model.*;

public class Boutique {
	
	public static void main(String args[]) {
		
		Outfit outfit = new Dress();
		System.out.println("Outfit Option #1: " + outfit.getDescription() + " Cost: $" + outfit.getCost());
		
		Outfit outfit2 = new Dress();
		outfit2 = new Earrings(outfit2);
		outfit2 = new Scarf(outfit2);
		System.out.println("Outfit Option #2: " + outfit2.getDescription() + " Cost: $" + outfit2.getCost());
		
		Outfit outfit3 = new Shirt();
		outfit3 = new Sunglasses(outfit3);
		outfit3 = new Necklace(outfit3);
		System.out.println("Outfit Option #3: " + outfit3.getDescription() + " Cost: $" + outfit3.getCost());

		
	}

}
