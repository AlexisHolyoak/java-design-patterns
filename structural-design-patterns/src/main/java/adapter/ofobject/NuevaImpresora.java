package adapter.ofobject;

import java.awt.Font;

public class NuevaImpresora implements ImprimeColor {

    public void setColor(int red, int green, int blue) {
        System.out.println("Nueva Impresora setColor");
    }

    public void setFont(Font font) {
        System.out.println("Nueva Impresora setFont");
    }

    public void setDuplex(boolean duplex) {
        System.out.println("Nueva Impresora setDuplex");
    }
}
