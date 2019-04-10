import java.util.Random;
class Terning{
	private final String spiller;
	private int terningkast;
	private final int sumPoeng;
	private final String ferdig;
	java.util.Random terning = new java.util.Random();

		public Terning(String spiller, int terningkast, int sumPoeng, String ferdig){
		this.spiller = spiller;
		this.terningkast = terningkast;
		this.sumPoeng = sumPoeng;
		this.ferdig = ferdig;
	}
		public String getSpiller(){
		return spiller;
	}
		public int kastTerningen(){
		int terningkast = terning.nextInt(6)+1; 
		return terningkast;
	}
		public int getTot(){
		return sumPoeng;
	}
		public String erFerdig(){
		return ferdig;
	}
}