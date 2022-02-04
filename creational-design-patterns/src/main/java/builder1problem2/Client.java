package builder1problem2;

public class Client {
	public static void main(String[] args) {
		
		MySandwichBuilder builder = new MySandwichBuilder();
		// ClubSandwichBuilder builder = new ClubSandwichBuilder();
		builder.createSandwich();
		Sandwich sandwich = builder.getSandwich();
		sandwich.display();
	}		
}