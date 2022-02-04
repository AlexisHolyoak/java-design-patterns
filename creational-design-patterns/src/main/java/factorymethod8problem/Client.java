package factorymethod8problem;

public class Client {
 
	public static void main(String[] args) {
		DependentPizzaStore dependentStore = new DependentPizzaStore();
 
		Pizza pizza = dependentStore.createPizza("NY", "cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = dependentStore.createPizza("Chicago", "cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = dependentStore.createPizza("NY", "clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = dependentStore.createPizza("Chicago", "clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}