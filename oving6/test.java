import java.util.Random;
import java.util.Vector;
import java.util.Stack;
class TallGen{
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		int[] antall = new int[10];

		for (int i = 0; i < antall.length; i++) {
			int tall = random.nextInt(10);
			antall.push(tall);
		}

		System.out.println(antall);

		
	}
}