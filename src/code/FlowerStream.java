package code;

import java.util.stream.Collectors;

public class FlowerStream {

	public static void main(String[] args) {
		new FlowerStream().run();
		
		
	}

	private void run() {
		
		String flowers = Flower.getflowers().stream()
			.map((flower)-> flower.toString())
			.sorted()
			.collect(Collectors.joining(", "));
			
	System.out.println(flowers);	
	
	}

}
