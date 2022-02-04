package builder1problem2;

import java.util.ArrayList;
import java.util.Arrays;

public class MySandwichBuilder {
	
	Sandwich sandwich;
	
	public Sandwich getSandwich()
	{
		return sandwich;
	}
	
	public void createSandwich()
	{
		sandwich = new Sandwich();
		this.prepareBread();
		this.applyMeatAndCheese();
		this.addCondiments();
		this.applyVegetables();
	}
	
	public void prepareBread() {
		sandwich.setBreadType(BreadType.White);
        sandwich.setToasted(true);
	}

	public void applyMeatAndCheese() {
		sandwich.setCheeseType(CheeseType.Cheddar);
        sandwich.setMeatType(MeatType.Chicken);
	}

	public void applyVegetables() {
		sandwich.setVegetables(new ArrayList<String>(Arrays.asList("Tomato", "Onion")));
	}

	public void addCondiments() {		
		sandwich.setHasMayo(false);
        sandwich.setHasMustard(true);
	}
}