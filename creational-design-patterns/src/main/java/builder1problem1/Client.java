package builder1problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
	public static void main(String[] args) {
		
		Sandwich sandwich = new Sandwich(BreadType.Wheat, false, CheeseType.American, MeatType.Turkey, false,
				false, new ArrayList<String>(Arrays.asList("Tomato", "Onion", "Lettuce")));
		sandwich.display();
		
		Sandwich2 sandwich2 = new Sandwich2();
		sandwich2.setBreadType(BreadType.Wheat);
		sandwich2.setCheeseType(CheeseType.American);
		sandwich2.setMeatType(MeatType.Turkey);
		sandwich2.setHasMayo(false);
		sandwich2.setToasted(false);
		sandwich2.setVegetables(new ArrayList<String>(Arrays.asList("Tomato2", "Onion2", "Lettuce2")));
		sandwich2.display();
	}		
}