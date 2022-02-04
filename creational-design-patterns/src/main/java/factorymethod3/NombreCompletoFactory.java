package factorymethod3;

public class NombreCompletoFactory {
    
    public NombreCompletoFactory() {
    }
    
    public static ValidaNombre obtenerValidador(String nombreCompleto) {
        int i = nombreCompleto.indexOf(",");
        if ( i > 0 ) {
            return (new PrimeroApellido(nombreCompleto));
        } else {
            return (new PrimeroNombre(nombreCompleto));
        }            
    }
}