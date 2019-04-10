import static javax.swing.JOptionPane.*; 
class TemperaturOppg {
	public static void main(String[] args) {
		Temperaturer tabell = new Temperaturer(3, 3);

		int[] nyTabell1 = tabell.getMiddelDag();//sjekker middeltemp for dag 3
		int[] nyTabell2 =tabell.getMiddelTime();//sjekker middeltemp for time 1 gjennom alle dagene
		tabell.getMiddelManed();//sjekker middeltemp for hele måneden
		int[] nyTabell = tabell.antDognGruppe();//sjekker 

		for (int i = 0;i < nyTabell1.length; i++) {
			System.out.println("Dag " + (i+1) + " " + nyTabell1[i]);
		}
		}
}
