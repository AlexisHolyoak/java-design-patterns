package factorymethod7;

public class Client {
 
	public static void main(String[] args) {
		System.out.println("");
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza.toString());
		
		System.out.println("*****************************************" + "\n");
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza.toString());
	}
}