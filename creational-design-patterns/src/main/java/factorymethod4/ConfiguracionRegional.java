package factorymethod4;

public class ConfiguracionRegional {
    
	private static ConfiguracionRegional unicaInstancia = null;
    public static final String REGION_EEUU = "EEUU";
    public static final String REGION_LA = "LA";
    public static final String REGION_EUR = "EUR";
    
    private String region = null;
    
    public String getRegion(){
        return region;
    }
    
    public void setRegion(String region){
        this.region = region;
    }
    
    public static ConfiguracionRegional getInstancia() {
        if (unicaInstancia != null) {
        	return unicaInstancia;
        }
    	synchronized(ConfiguracionRegional.class) {
    		if (unicaInstancia == null) {
                unicaInstancia = new ConfiguracionRegional();
    		}
    	}        
        return unicaInstancia;
    }  
}