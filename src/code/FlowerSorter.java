package code;

import java.util.List;

public class FlowerSorter {

	public static void main(String[] args) {
		new FlowerSorter().run();
	}

	/* First Method
	//private void run() {
		
		//List<Flower> lambdaFlower = flowers.getflowers();
		//lambdaFlower.sort((f1,f2)-> flowers.compare(f1, f2));
		//System.out.println(lambdaFlower);
		 * 
		 */
	//  Second  Method
	private void run() {
		List<Flower> lambdaFlower = sortByLambda();
			System.out.println(lambdaFlower);
			
		List<Flower> methJeeps = sortByMeth();	
		System.out.println(methJeeps);
		}

	private List<Flower> sortByMeth() {
		List<Flower> flowers = Flower.getflowers();
		flowers.sort(Flower::compare);
		return flowers;
	}

	private List<Flower> sortByLambda() {
		List<Flower> lambdaflowers = Flower.getflowers();
		lambdaflowers.sort((f1,f2)-> Flower.compare(f1, f2));
		return lambdaflowers;
		}
	}

