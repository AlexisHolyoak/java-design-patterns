package bridge.inquilinos;

public class Alumnos implements IPagos{

	@Override
	public void cancelarPago() {
		// TODO Auto-generated method stub
		System.out.println("Los inquilinos que son alumnos pagan asi");
	}

	@Override
	public void aplicarDescuento() {
		// TODO Auto-generated method stub
		System.out.println("Los inquilino que son alumnos tienen este descuento");
	}

}
