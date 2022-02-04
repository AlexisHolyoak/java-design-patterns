package bridge.inquilinos;

public class RentaAlumnos extends RentaAbstract {

	public RentaAlumnos(IPagos iPagos) {
		super(iPagos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cobrar() {
		// TODO Auto-generated method stub
		System.out.println("Aplicando la renta a los alumnos");
		iPagos.cancelarPago();
		iPagos.aplicarDescuento();
	}

}
