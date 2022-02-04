package builder1problem1;

import java.util.List;

public class Sandwich {
	private BreadType breadType;
	private boolean isToasted;
	private CheeseType cheeseType;
	private MeatType meatType;
	private boolean hasMustard;
	private boolean hasMayo;
	private List<String> vegetables;        
    
    public Sandwich(BreadType breadType, boolean isToasted, CheeseType cheeseType, MeatType meatType, boolean hasMustard, boolean hasMayo, List<String> vegetables)
    {
    	this.breadType = breadType;
    	this.isToasted = isToasted;
    	this.cheeseType = cheeseType;
    	this.meatType = meatType;
    	this.hasMustard = hasMustard;
    	this.hasMayo = hasMayo;
    	this.vegetables = vegetables;
    }        

	public void display()
    {
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