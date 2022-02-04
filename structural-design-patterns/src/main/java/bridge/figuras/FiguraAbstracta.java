package bridge.figuras;

public abstract class FiguraAbstracta {
 protected IColor color;
 public FiguraAbstracta(IColor color) {
	 this.color = color;
 }
 public abstract void Dibujar();
}
