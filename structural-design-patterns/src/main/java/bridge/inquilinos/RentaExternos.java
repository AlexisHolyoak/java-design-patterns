package bridge.inquilinos;

public class RentaExternos extends RentaAbstract{

	public RentaExternos(IPagos iPagos) {
		super(iPagos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cobrar() {
		// TODO Auto-generated method stub
		System.out.println("Cobrando la renta a externos");
		iPagos.cancelarPago();
		iPagos.aplicarDescuento();
	}

}
