package builder.one;

import java.util.ArrayList;
import java.util.Arrays;

public class ClubSandwichBuilder extends SandwichBuilder {

    @Override
    public void prepareBread() {
        sandwich.setBreadType(BreadType.White);
        sandwich.setToasted(true);
    }

    @Override
    public void applyMeatAndCheese() {
        sandwich.setCheeseType(CheeseType.Swiss);
        sandwich.setMeatType(MeatType.Turkey);
    }

    @Override
    public void applyVegetables() {
        sandwich.setVegetables(new ArrayList<String>(Arrays.asList("Tomato", "Onion", "Lettuce")));
    }

    @Override
    public void addCondiments() {
        sandwich.setHasMayo(true);
        sandwich.setHasMustard(true);
    }
}