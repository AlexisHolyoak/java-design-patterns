package adapter.ofclass;

import java.awt.Font;

public interface ImprimeColor {
    public void setColor(int red, int green, int blue);

    public void setFont(Font font);

    public void setDuplex(boolean duplex);
}