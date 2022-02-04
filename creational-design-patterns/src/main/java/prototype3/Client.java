package prototype3;

import java.util.ArrayList;

public class Client {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Language> list = new ArrayList<Language>();
	    list.add(new Language("C++"));
	    list.add(new Language("JAVA"));

	    ArrayList<Language> shallow = (ArrayList<Language>) list.clone();

	    System.out.println("shallow: " + list.equals(shallow));

	    for (int i=0; i<list.size(); i++) {
	        System.out.println(" * shallow: " + list.get(i).equals(shallow.get(i))); //true
	    }

	    ArrayList<Language> deep = new ArrayList<Language>();
	    for (Language language:list) {
	        deep.add((Language) language.clone());
	    }
	    
	    System.out.println("deep: " + list.equals(deep));
	    
	    for (int i=0; i<list.size(); i++) {
	        System.out.println(" * deep: " + list.get(i).equals(deep.get(i))); //false
	    }
	    
	    list.get(0).name = "PYTHON";
	    System.out.println("Shallow [0]: " + shallow.get(0).getName());
	    System.out.println("Shallow [1]: " + shallow.get(1).getName());
	    System.out.println("Deep: [0]" + deep.get(0).getName());
	    System.out.println("Deep: [1]" + deep.get(1).getName());
	}

}