package bridge.inquilinos;

public class Externos implements IPagos {

	@Override
	public void cancelarPago() {
		// TODO Auto-generated method stub
		System.out.println("Los inquilinos externos pagan esto");
	}

	@Override
	public void aplicarDescuento() {
		// TODO Auto-generated method stub
		System.out.println("Los inquilinos externos tienen este descuento");
	}

}
