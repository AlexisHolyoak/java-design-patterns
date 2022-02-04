package composite.inquilinos;

public class Encargado extends HabitacionComposition{
	
	public Encargado(String edad, String nombre) {
		this.edad = edad;
		this.nombre ="Encargado: " + nombre;
	}

	@Override
	public HabitacionComposition addInquilino(HabitacionComposition composition) {
		// TODO Auto-generated method stub
		integrantesDeHabitacion.add(composition);
		return composition;
	}

	@Override
	public HabitacionComposition removeInquilino(HabitacionComposition composition) {
		// TODO Auto-generated method stub
		integrantesDeHabitacion.remove(composition);
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

	@Override
	public void imprimir(String input) {
		// TODO Auto-generated method stub
		
	}
	
}
