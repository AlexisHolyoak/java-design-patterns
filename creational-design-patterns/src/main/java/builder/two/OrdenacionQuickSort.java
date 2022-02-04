package builder.two;

import java.util.Vector;

public class OrdenacionQuickSort extends OrdenacionBuilder {

    String[] datos = null;

    public Vector<String> ordenar(String[] datos) {

        this.datos = datos;
        quickSort(0, datos.length - 1);
        Vector<String> resp = new Vector<String>();
        for (int i = 0; i < datos.length; i++) {
            resp.add(datos[i]);
        }
        return resp;
    }

    public void quickSort(int izq, int der) {
        String pivot;
        int sizq, sder;
        int ieq;
        String tmpVal;

        if (izq >= der) {
            return;
        }

        pivot = datos[(izq + der) / 2];

        ieq = sizq = izq;
        sder = der;

        while (sizq <= sder) {
            if (datos[sder].compareTo(pivot) > 0) {
                sder--;
            } else {
                tmpVal = datos[sizq];
                datos[sizq] = datos[sder];
                datos[sder] = tmpVal;
                if (datos[sizq].compareTo(pivot) < 0) {
                    tmpVal = datos[ieq];
                    datos[ieq] = datos[sizq];
                    datos[sizq] = tmpVal;
                    ieq++;
                }
                sizq++;
            }
        }
        quickSort(izq, ieq - 1);
        quickSort(sder + 1, der);
    }
}
