package factorymethod4;

import common.Util;

public class Client {

	public static void main(String[] args) throws Exception {
		 ConfiguracionRegional configuracionRegional = ConfiguracionRegional.getInstancia();
		 String region = Util.getPropertyValue("config.properties", "Region");
		 configuracionRegional.setRegion(region);
	     FechasFactory fFecha = new FechasFactory();
	     FechaGenerica fechaHoy = fFecha.obtenerFecha();
	     System.out.println(region + ": " + fechaHoy.obtenerFecha());
	}
}