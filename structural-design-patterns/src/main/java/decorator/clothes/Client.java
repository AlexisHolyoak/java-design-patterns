package decorator.clothes;

public class Client {
public static void main(String[] args) {
	Persona person = new Mujer();
	person = new  Blusa(person);
	System.out.println(person.getClothes());
}
}
