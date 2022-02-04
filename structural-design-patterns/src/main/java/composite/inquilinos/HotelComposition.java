package composite.inquilinos;

import java.util.*;

public abstract class HotelComposition {
	String precio;
	String piso;
	public String getPrecio() {
		return precio;
	}
	public String getPiso() {
		return piso;
	}
	List<HotelComposition> listaDeCompuestos = new ArrayList<>();
	
	public HotelComposition add(HotelComposition composition) {
		throw new UnsupportedOperationException("This is the add composition");
	}
	public HotelComposition remove(HotelComposition composition) {
		throw new UnsupportedOperationException("This is the remove composition");
	}
	public HotelComposition get(HotelComposition composition) {
		throw new UnsupportedOperationException("This is the get composition");
	}
	public abstract void imprimir(String input);
}
