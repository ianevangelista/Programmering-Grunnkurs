import java.util.Random;
class TallGen{
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		int[] antall = new int[10];

		for (int i = 0; i < antall.length; i++) {
			int tall = random.nextInt(10);
			antall[i] = tall;
			System.out.println(antall[i]);
		}

		for(int tallSjekk = 0; tallSjekk < antall.length; tallSjekk++){
			int tot = 0;
			for (int i = 0; i < antall.length; i++) {
				if (antall[i] == tallSjekk){
					tot++;
				}
			}
			System.out.println("Antallet av " + tallSjekk + " er: " + tot);
		}
	}
}