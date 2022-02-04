package decorator.clothes;

public class Blusa extends PersonaDecorator {

	public Blusa(Persona persona) {
		super(persona);
		// TODO Auto-generated constructor stub
		this.description="blusa";
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return super.getName(name);
	}

	@Override
	public String getAge(String age) {
		// TODO Auto-generated method stub
		return super.getAge(age);
	}

	@Override
	public String getClothes() {
		// TODO Auto-generated method stub
		return persona.getClothes()+this.description;
	}
	
}
