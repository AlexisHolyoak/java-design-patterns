package adapter.inquilinos;

public class NuevosInquilinos implements AlquilerOnline {

	@Override
	public void setWeb(String web) {
		// TODO Auto-generated method stub
		System.out.println("Opción nueva sin adaptar web: " + web);
	}

	@Override
	public void setDescuentoWeb(String descuento) {
		// TODO Auto-generated method stub
		System.out.println("Opcion sin adaptar descuento: " + descuento);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Opción sin adaptar nombre: "+name);
	}

	@Override
	public void setMensualidad(String mensualidad) {
		// TODO Auto-generated method stub
		System.out.println("Opción sin adaptar mensualidad: "+mensualidad);
	}

}
