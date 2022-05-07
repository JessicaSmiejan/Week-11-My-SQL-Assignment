package code;

import java.util.NoSuchElementException;
import java.util.Optional;

public class FlowerOptional {
	public static void main(String[] args) {
			new FlowerOptional();
			FlowerOptional.run();

}

	private static void run() {
		Flower flowers = flowerMethod( Optional.of(new Flower("None")));
		System.out.println(flowers);
		
		try {
			flowerMethod(Optional.empty());
		}
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static Flower flowerMethod(Optional<Flower>optionalflower) {
		return optionalflower.orElseThrow(()-> new NoSuchElementException("No Flowers!"));
	}
}