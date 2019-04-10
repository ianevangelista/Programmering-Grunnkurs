import static javax.swing.JOptionPane.*; 
class Test {
	private static final String[] VALG = {"Endre lønn", "Endre skatteprosent", "Sjekk antall år jobbet"};
	private static final int LONN = 0;
	private static final int SKATTEPROSENT = 1;
	private static final int ARSJEKK = 2;

	public static void main(String[] args) {
		Navn navn = new Navn("Ian", "Evangelista");
		Person person = new Person(navn, 1999);
		ArbTaker arbTaker = new ArbTaker(person, "001", 2017, 10000, 0.35);

		while(true){
			int inputValg = showOptionDialog(null, "Velg ønsket operasjon", "Endre data", 0, PLAIN_MESSAGE, null, VALG, VALG[0]);
			String resultat = "";
			if(inputValg < 0)break;
			switch(inputValg){
				case LONN:
					String lonnInput = showInputDialog("Skriv inn ny lønn: ");
					double nyLonn = Double.parseDouble(lonnInput);
					arbTaker.setNyLonn(nyLonn);
					resultat = arbTaker.toString();
					showMessageDialog(null, resultat);
					break;
				case SKATTEPROSENT:
					String prosentInput = showInputDialog("Skriv inn ny skatteprosent: ");
					double nyProsent = Double.parseDouble(prosentInput);
					arbTaker.setNySkatteProsent(nyProsent);
					resultat = arbTaker.toString();
					showMessageDialog(null, resultat);
					break;
				case ARSJEKK:
					String arInput = showInputDialog("Sjekk om den ansatte har jobbet i over: ");
					int arLest = Integer.parseInt(arInput);
					resultat = arbTaker.sjekkAr(arLest);
					showMessageDialog(null, resultat);
				default:
					resultat = "Hei, du har ikke endret noe";
					showMessageDialog(null, resultat);
					break;
			}
		}
	}

		/*arbTaker.setNyLonn(5000);
		arbTaker.setNySkatteProsent(0.20);


		System.out.println(arbTaker.getArbtakernr());
		System.out.println(arbTaker.getAnsettelsesar());
		System.out.println(arbTaker.getManedsLonn());
		System.out.println(arbTaker.getSkatteProsent());
		System.out.println(arbTaker.getSkatteTrekkMnd());
		System.out.println(arbTaker.getBruttLonn());
		System.out.println(arbTaker.skatteTrekkAr());
		System.out.println(arbTaker.getNavn());
		System.out.println(arbTaker.antAr());
		System.out.println(arbTaker.antArJobbet());
		System.out.println(arbTaker.sjekkAr(1));*/
}

