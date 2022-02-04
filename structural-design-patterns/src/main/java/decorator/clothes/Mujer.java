package decorator.clothes;

import java.util.List;

public class Mujer extends Persona{
	public Mujer() {
		// TODO Auto-generated constructor stub
		this.description = "Mujer";
	}
	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getAge(String age) {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public String getClothes() {
		// TODO Auto-generated method stub
		return this.description;
	}

	
}
