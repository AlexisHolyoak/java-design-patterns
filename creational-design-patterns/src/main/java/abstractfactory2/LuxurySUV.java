package abstractfactory2;

public class LuxurySUV implements SUV {

	private String name;

	public LuxurySUV(String name) {
        this.name = name;
    }

	public String getSUVName() {
        return name;
    }

	public String getSUVFeatures() {
        return "Luxury SUV Features ";
    }
}