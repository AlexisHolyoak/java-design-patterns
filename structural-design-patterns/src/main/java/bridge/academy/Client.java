package bridge.academy;

public class Client {
	public static void main(String[] args) {
		EntidadAbstracta sil = new Academia(new Alumno());		
		sil.gestion = new Docente();
		sil.gestion = new Alumno();
		sil.gestion = new Alumno();
		sil.matricular();
	}
}
