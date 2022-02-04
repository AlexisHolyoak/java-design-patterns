package builder.one;

import java.util.List;

public class Sandwich {
    private BreadType breadType;
    private boolean isToasted;
    private CheeseType cheeseType;
    private MeatType meatType;
    private boolean hasMustard;
    private boolean hasMayo;
    private List<String> vegetables;

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean isToasted) {
        this.isToasted = isToasted;
    }

    public CheeseType getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public boolean isHasMustard() {
        return hasMustard;
    }

    public void setHasMustard(boolean hasMustard) {
        this.hasMustard = hasMustard;
    }

    public boolean isHasMayo() {
        return hasMayo;
    }

    public void setHasMayo(boolean hasMayo) {
        this.hasMayo = hasMayo;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }

    public void display() {
        System.out.format("Sandwich on %s bread%n", breadType);
        if (isToasted) {
            System.out.format("Toasted%n");
        }
        if (hasMayo) {
            System.out.format("With Mayo%n");
        }
        if (hasMustard) {
            System.out.format("With Mustard%n");
        }
        System.out.format("Meat: %s%n", meatType);
        System.out.format("Cheese: %s%n", cheeseType);
        System.out.format("Veggies: %n");
        for (String vegetable : vegetables) {
            System.out.format("   %s%n", vegetable);
        }
        System.out.format("******************************%n%n");
    }
}