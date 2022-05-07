package code;

import java.util.ArrayList;
import java.util.List;

public class Flower {

	private String name;
	
	private static List<Flower> flowers = List.of(
			new Flower ("Rose"),
			new Flower ("Daisy"),
			new Flower ("Hydrangea"),
			new Flower ("Lilly"),
			new Flower ("Carnation")
			);
	
	
	public Flower( String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Flower name: " + name;
	}
	
	public static int compare( Flower f1, Flower f2) {
		return f1.name.compareTo(f2.name);
	}
	
	public static List <Flower> getflowers(){
		return new ArrayList<>(flowers);
		
		
	}
}
