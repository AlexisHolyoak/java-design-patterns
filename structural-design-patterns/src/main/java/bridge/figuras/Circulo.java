package bridge.figuras;

public class Circulo extends FiguraAbstracta{

	public Circulo(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando circulo...");
		color.pintar();
	}

}
