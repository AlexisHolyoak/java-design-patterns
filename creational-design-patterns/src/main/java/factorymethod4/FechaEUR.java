package factorymethod4;

import java.util.Calendar;

public class FechaEUR extends FechaGenerica{

	public String obtenerFecha(){
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        
        return(dia + "/" + mes + "/" + anio);
    }
}