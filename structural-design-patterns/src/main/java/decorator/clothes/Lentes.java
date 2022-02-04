package decorator.clothes;

public class Lentes extends PersonaDecorator{

	public Lentes(Persona persona) {
		super(persona);
		// TODO Auto-generated constructor stub
		this.description = "Lentes";
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return persona.getName(name);
	}

	@Override
	public String getAge(String age) {
		// TODO Auto-generated method stub
		return persona.getAge(age);
	}
	
}
