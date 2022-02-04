package factorymethod2;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.reflections.*;

public class AutoFactory {
	
	private static String NAME_PREFIX = "class";
	private Map<String, Type> autos;
	
	public AutoFactory()
    {
        loadTypesICanReturn();
    }
	
	private void loadTypesICanReturn()
    {
        autos = new HashMap<String, Type>();
        Reflections reflections = new Reflections(this.getClass().getPackage().getName());
        Set<Class<? extends IAuto>> classes = reflections.getSubTypesOf(IAuto.class);
        for (Class<? extends IAuto> auto : classes) {
        	 String key = auto.getSimpleName();
        	 autos.put(key, auto); //autos.put("BMW335Xi", com.unmsm.patterns.creational.factorymethod1.BMW335Xi)
        }
    }
	
	public IAuto createInstance(String carName)
    {
		Object object = null;
		Class<?> genericsType = null;
		Type type = getTypeToCreate(carName);
        try {
            String className = getClassName(type);
        	genericsType = Class.forName(className);
            object = genericsType.newInstance();
        } catch(Exception ex) {        	
        }
        return (IAuto) object;
    }
	
	public Type getTypeToCreate(String carName)
    {
        for (Map.Entry<String, Type> entry : autos.entrySet()) {
        	String key = entry.getKey();
        	if (key.contains(carName)) {
        		Type type = autos.get(key);
        		return type;
            }
        }
        return null;
    }
		
	private static String getClassName(Type type) {
	    String fullName = type.toString();
	    if (fullName.startsWith(NAME_PREFIX)) {
	        return fullName.substring(NAME_PREFIX.length() + 1);
	    }
	    return fullName;
	}
}