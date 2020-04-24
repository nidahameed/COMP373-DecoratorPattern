package model.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class testOutfits {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetCost() {
		//testing various combinations to ensure the right costs are being printed
		Outfit outfit = new Dress();
		outfit = new Earrings(outfit);
		outfit = new Scarf(outfit);
		assertEquals(125, outfit.getCost());
	}
	
	@Test
	void testGetCost2() {
		//testing another scenario
		Outfit outfit = new Shirt();
		outfit = new Earrings(outfit);
		outfit = new Sunglasses(outfit);
		outfit = new Necklace(outfit);
		assertEquals(182, outfit.getCost());
	}
	
	@Test
	void testGetCost3() {
		//another cost scenario with different items for an outfit
		Outfit outfit = new Shoes();
		outfit = new Sunglasses(outfit);
		outfit = new Necklace(outfit);
		assertEquals(87, outfit.getCost());
	}
	
	@Test
	void testGetCost4() {
		Outfit outfit = new Pants();
		outfit = new Sunglasses(outfit);
		outfit = new Scarf(outfit);
		assertEquals(47, outfit.getCost());
	}
	
	@Test
	void getDescription() {
		Outfit outfit = new Dress();
		outfit = new Earrings(outfit);
		outfit = new Scarf(outfit);
		assertEquals("Dress, Earrings, Scarf" , outfit.getDescription());
	}
	
	@Test
	void getDescription2() {
		Outfit outfit = new Shoes();
		outfit = new Necklace(outfit);
		outfit = new Scarf(outfit);
		assertEquals("Shoes, Necklace, Scarf" , outfit.getDescription());
	}
	
	@Test
	void getDescription3() {
		Outfit outfit = new Shirt();
		outfit = new Necklace(outfit);
		outfit = new Scarf(outfit);
		outfit = new Earrings(outfit);
		outfit = new Sunglasses(outfit);
		assertEquals("Shirt, Necklace, Scarf, Earrings, Sunglasses" , outfit.getDescription());
	}
	
	@Test
	void getDescription4() {
		Outfit outfit = new Dress();
		outfit = new Necklace(outfit);
		outfit = new Earrings(outfit);
		outfit = new Sunglasses(outfit);
		assertEquals("Dress, Necklace, Earrings, Sunglasses" , outfit.getDescription());
	}

}


