package adapter.inquilinos;

public class NuevosInquilinosAdapter extends Inquilinos implements AlquilerOnline {

	@Override
	public void setWeb(String web) {
		// TODO Auto-generated method stub
		System.out.println("Adaptando la opción: " + web);
	}

	@Override
	public void setDescuentoWeb(String descuento) {
		// TODO Auto-generated method stub
		System.out.println("Adaptando el descuento web");
	}

	@Override
	public void setMensualidad(String mensualidad) {
		// TODO Auto-generated method stub
		setMensualidad(mensualidad);
	}
	
}
