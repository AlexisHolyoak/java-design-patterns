package bridge.academy;

public abstract class EntidadAbstracta {
	IGestion gestion;
	public EntidadAbstracta(IGestion gestion) {
		// TODO Auto-generated constructor stub
		this.gestion = gestion;
	}
	public abstract void matricular();
}
