package adapter.ofclass;

import java.awt.Font;

public class NuevaImpresoraAdapter extends ViejaImpresora implements ImprimeColor {

    public void setColor(int red, int green, int blue) {
        setGrayscale((red + green + blue) / 3);
    }

    public void setFont(Font f) {
        if (f.getName().equals("Times")) {
            setFontNumber(1);
        }
        if (f.getName().equals("Arial")) {
            setFontNumber(2);
        }
        if (f.getName().equals("Monospaced")) {
            setFontNumber(3);
        }
    }

    public void setDuplex(boolean duplex) {
    }
}
