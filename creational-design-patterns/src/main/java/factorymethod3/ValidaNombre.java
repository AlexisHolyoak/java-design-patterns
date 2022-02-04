package factorymethod3;

public abstract class ValidaNombre {
    
    String nombreCompleto = null;
    String apellido = null;
    String nombre = null;
    
    public ValidaNombre(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public abstract String obtenerNombre();    
    public abstract String obtenerApellido();    
}