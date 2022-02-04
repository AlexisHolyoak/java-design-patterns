package bridge.inquilinos;

public abstract class RentaAbstract {
	protected IPagos iPagos;
	
	public RentaAbstract(IPagos iPagos) {
		// TODO Auto-generated constructor stub
		this.iPagos = iPagos;
	}
	public abstract void cobrar();
}
