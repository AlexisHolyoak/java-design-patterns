package factorymethod4;

public class FechasFactory {
    
    public FechaGenerica obtenerFecha(){
        
        ConfiguracionRegional config = ConfiguracionRegional.getInstancia();
        
        if (config.getRegion().equalsIgnoreCase(ConfiguracionRegional.REGION_EEUU)) {
            return new FechaEEUU();
        } else if (config.getRegion().equalsIgnoreCase(ConfiguracionRegional.REGION_EUR)) {
            return new FechaEUR();
        } else {
            return new FechaLA();
        }
    }
}