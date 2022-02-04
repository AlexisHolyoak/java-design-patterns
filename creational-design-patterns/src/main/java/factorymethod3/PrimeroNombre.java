package factorymethod3;

public class PrimeroNombre extends ValidaNombre{
        
    public PrimeroNombre(String nombreCompleto) {
        super(nombreCompleto);
        
        int i = nombreCompleto.indexOf(" ");
         
        nombre = nombreCompleto.substring(0, i);        
        apellido = nombreCompleto.substring(i + 1);
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerNombre(){
        return nombre;
    }   
}