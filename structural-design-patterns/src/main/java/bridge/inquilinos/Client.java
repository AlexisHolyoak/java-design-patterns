package bridge.inquilinos;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentaAbstract alumnoA= new RentaAlumnos(new Alumnos());
		alumnoA.cobrar();
		alumnoA.iPagos= new Externos();
		alumnoA.cobrar();
	}

}
