package composite.inquilinos;

import java.util.*;
public abstract class HabitacionComposition extends HotelComposition{
	String edad;	
	String nombre;
	List<HabitacionComposition> inquilinos = new ArrayList<>();
	public String getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	List<HabitacionComposition> integrantesDeHabitacion = new ArrayList<>();
	public HabitacionComposition addInquilino(HabitacionComposition composition) {
		throw new UnsupportedOperationException("Habitacion Composition add not supported");
	}
	public HabitacionComposition removeInquilino(HabitacionComposition composition) {
		throw new UnsupportedOperationException("Habitacion Composition remove not supported");
	}
	public HabitacionComposition getInquilinos(HabitacionComposition composition) {
		throw new UnsupportedOperationException("Habitacion Composition get not supported");
	}
}
