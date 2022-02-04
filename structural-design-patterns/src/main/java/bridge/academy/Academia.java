package bridge.academy;

public class Academia extends EntidadAbstracta{

	public Academia(IGestion gestion) {
		super(gestion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void matricular() {
		// TODO Auto-generated method stub
		System.out.println("Matriculando en academia");
		gestion.registrar();
	}

}
