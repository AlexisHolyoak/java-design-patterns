package bridge.figuras;

public class Cuadrado extends FiguraAbstracta{

	public Cuadrado(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando cuadrado");
		color.pintar();
	}

}
