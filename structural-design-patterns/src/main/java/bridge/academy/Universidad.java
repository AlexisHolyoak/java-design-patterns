package bridge.academy;

public class Universidad extends EntidadAbstracta{

	public Universidad(IGestion gestion) {
		super(gestion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void matricular() {
		// TODO Auto-generated method stub
		System.out.println("Gestion universitaria");
		gestion.registrar();
	}

}
