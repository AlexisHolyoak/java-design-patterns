package factorymethod3;

public class Client {

	public static void main(String[] args) {
		ValidaNombre validaNombre = NombreCompletoFactory.obtenerValidador("Juan Pérez");
		System.out.println("Class Name: " + validaNombre.getClass().getSimpleName());
		System.out.println("Nombre: " + validaNombre.obtenerNombre());
		System.out.println("Apellido: " + validaNombre.obtenerApellido());
		
		System.out.println("***************************************************");
		
        validaNombre = NombreCompletoFactory.obtenerValidador("Pérez, Juan");
        System.out.println("Class Name: " + validaNombre.getClass().getSimpleName());
		System.out.println("Nombre: " + validaNombre.obtenerNombre());
		System.out.println("Apellido: " + validaNombre.obtenerApellido());
	}
}