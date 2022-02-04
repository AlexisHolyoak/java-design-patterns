package builder.two;

public class BuilderTest {

    public static void main(String[] args) {
        String[] datos = { "d", "g", "a", "b", "c", "h", "k" };
        OrdenacionFactory factory = new OrdenacionFactory();
        OrdenacionBuilder builder = factory.getOrdenacionBuilder("QS");
        OrdenacionDirector director = new OrdenacionDirector(builder);
        director.build(datos);
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
    }
}
