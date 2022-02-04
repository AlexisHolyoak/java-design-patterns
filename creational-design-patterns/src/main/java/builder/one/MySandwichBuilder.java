package builder.one;

import java.util.ArrayList;
import java.util.Arrays;

public class MySandwichBuilder extends SandwichBuilder {

    @Override
    public void prepareBread() {

        sandwich.setBreadType(BreadType.White);
        sandwich.setToasted(true);
    }

    @Override
    public void applyMeatAndCheese() {
        sandwich.setCheeseType(CheeseType.Cheddar);
        sandwich.setMeatType(MeatType.Chicken);
    }

    @Override
    public void applyVegetables() {
        sandwich.setVegetables(new ArrayList<String>(Arrays.asList("Tomato", "Onion")));
    }

    @Override
    public void addCondiments() {
        sandwich.setHasMayo(false);
        sandwich.setHasMustard(true);
    }
}