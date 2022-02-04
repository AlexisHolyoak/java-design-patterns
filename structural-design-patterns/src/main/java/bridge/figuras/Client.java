package bridge.figuras;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraAbstracta circulo = new Circulo(new Rojo());
		circulo.Dibujar();
		System.out.println("Repintando a negro");
		circulo.color=new Negro();
		circulo.Dibujar();
		FiguraAbstracta rectangulo = new Cuadrado(new Negro());
	}

}
