package decorator.clothes;

import java.util.List;

public class PersonaDecorator extends Persona{
	protected Persona persona;
	public PersonaDecorator(Persona persona) {
		// TODO Auto-generated constructor stub
		this.persona=persona;
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
	
	@Override
	public String getClothes() {
		// TODO Auto-generated method stub
		return persona.description;
	}
	

}
