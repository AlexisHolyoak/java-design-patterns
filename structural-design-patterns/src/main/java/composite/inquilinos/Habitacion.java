package composite.inquilinos;

public class Habitacion extends HabitacionComposition{
	public Habitacion(String precio, String piso) {
		// TODO Auto-generated constructor stub
		this.precio = precio;
		this.piso = piso;
	}
	public Habitacion() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void imprimir(String input) {
		// TODO Auto-generated method stub
		System.out.println("Imprimiendo input de habitacion: " + input);
	}

	@Override
	public HotelComposition add(HotelComposition composition) {
		listaDeCompuestos.add(composition);		
		// TODO Auto-generated method stub
		return composition;
	}

	@Override
	public HotelComposition remove(HotelComposition composition) {
		// TODO Auto-generated method stub
		listaDeCompuestos.remove(composition);
		return composition;
	}
	@Override
	public HotelComposition get(HotelComposition composition) {
		// TODO Auto-generated method stub
		for(int i=0;i<listaDeCompuestos.size();i++) {
			String p =listaDeCompuestos.get(i).getPrecio();
			String f= listaDeCompuestos.get(i).getPiso();
			System.out.println("Precio: " + p + " Piso: " + f);
		}
		
		return composition;
	}
	@Override
	public HabitacionComposition getInquilinos(HabitacionComposition composition) {
		// TODO Auto-generated method stub
		for(int i=0;i<inquilinos.size();i++) {
			String p =inquilinos.get(i).getNombre();
			String f= inquilinos.get(i).getEdad();
			System.out.println(p + " Edad: " + f + " Del "+ composition.getPiso());
		}
		
		return composition;
	}
	@Override
	public HabitacionComposition addInquilino(HabitacionComposition composition) {
		inquilinos.add(composition);
		// TODO Auto-generated method stub
		return composition;
	}
	
}
