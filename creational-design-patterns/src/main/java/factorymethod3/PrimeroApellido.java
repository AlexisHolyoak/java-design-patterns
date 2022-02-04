package factorymethod3;

public class PrimeroApellido extends ValidaNombre{
    
    public PrimeroApellido(String nombreCompleto) {
        super(nombreCompleto);
        
        int i = nombreCompleto.indexOf(",");
        
        apellido = nombreCompleto.substring(0, i);
        nombre = nombreCompleto.substring(i + 1);
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerNombre(){
        return nombre;
    }   
}