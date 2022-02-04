package builder.two;

public class OrdenacionFactory {

    public OrdenacionBuilder getOrdenacionBuilder(String string) {
        OrdenacionBuilder builder = null;
        if (string.equals("QS")) {
            builder = new OrdenacionQuickSort();
        }
        return builder;
    }
}
