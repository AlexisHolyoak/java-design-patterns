package composite.inquilinos;

public class Company extends HabitacionComposition{
	public Company(String edad, String name) {
		// TODO Auto-generated constructor stub
		this.edad= edad;
		this.nombre ="Compañia: " + name;
	}
	@Override
	public void imprimir(String input) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public HabitacionComposition addInquilino(HabitacionComposition composition) {
		// TODO Auto-generated method stub
		inquilinos.add(composition);
		return composition;
	}
	@Override
	public HabitacionComposition getInquilinos(HabitacionComposition composition) {
		// TODO Auto-generated method stub
				for(int i=0;i<integrantesDeHabitacion.size();i++) {
					String n =integrantesDeHabitacion.get(i).getNombre();
					String e= integrantesDeHabitacion.get(i).getEdad();
					System.out.println( n + " edad: " + e + composition.getPiso());
				}
				return composition;
	}
	
}
