package prototype3;

public class Language implements Cloneable{

    String name;
    
    public Language(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}