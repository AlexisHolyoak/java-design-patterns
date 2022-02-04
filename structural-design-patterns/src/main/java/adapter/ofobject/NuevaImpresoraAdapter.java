package adapter.ofobject;

import java.awt.Font;

public class NuevaImpresoraAdapter implements ImprimeColor {
    ViejaImpresora vieja = null;

    public NuevaImpresoraAdapter(ViejaImpresora vieja) {
        this.vieja = vieja;
    }

    public void setColor(int r, int g, int b) {
        vieja.setGrayscale((r + g + b) / 3);
    }

    public void setFont(Font f) {
        if (f.getName().equals("Arial")) {
            vieja.setFontNumber(1);
        }
        if (f.getName().equals("Times")) {
            vieja.setFontNumber(2);
        }
        if (f.getName().equals("Monospaced")) {
            vieja.setFontNumber(3);
        }
    }

    public void setDuplex(boolean duplex) {
    }
}
