package adapter.inquilinos;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NuevosInquilinosAdapter adaptado = new NuevosInquilinosAdapter();
		adaptado.setDescuentoWeb("200");
		adaptado.setId("id");
		adaptado.setName("Alexis");
		adaptado.setWeb("website");
		System.out.println("*****************");
		
		NuevosInquilinos nuevo = new NuevosInquilinos();
		nuevo.setDescuentoWeb("200");

		nuevo.setName("Alexis");
		nuevo.setWeb("website");
	}

}
