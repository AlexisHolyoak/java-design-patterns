package composite.inquilinos;

public class Oficina extends HotelComposition{

	public Oficina(String precio, String piso) {
		// TODO Auto-generated constructor stub
		this.precio= precio;
		this.piso = piso + " Oficina";
	}

	@Override
	public void imprimir(String input) {
		// TODO Auto-generated method stub
		System.out.println("Imprimiendo en oficina"+input);
	}

	@Override
	public HotelComposition add(HotelComposition composition) {
		
		// TODO Auto-generated method stub
		listaDeCompuestos.add(composition);
		
		return composition;
	}

	@Override
	public HotelComposition remove(HotelComposition composition) {
		// TODO Auto-generated method stub
		listaDeCompuestos.remove(composition);
		return composition;
	}
	
}
