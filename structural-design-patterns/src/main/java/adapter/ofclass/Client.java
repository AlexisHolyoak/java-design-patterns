package adapter.ofclass;

import java.awt.Font;

public class Client {

    public static void main(String[] args) {
        NuevaImpresoraAdapter nuevaImpresoraAdapter = new NuevaImpresoraAdapter();
        nuevaImpresoraAdapter.setColor(100, 200, 300);
        nuevaImpresoraAdapter.setFont(new Font("Monospaced", Font.BOLD, 36));

        System.out.println("*************************************************************");

        NuevaImpresora nuevaImpresora = new NuevaImpresora();
        nuevaImpresora.setColor(100, 200, 300);
        nuevaImpresora.setFont(new Font("Monospaced", Font.BOLD, 36));
    }
}
