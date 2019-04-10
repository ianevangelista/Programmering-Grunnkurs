import static javax.swing.JOptionPane.*; 
class TekstbehandlingOppg {
	public static void main(String[] args) {

		while(true){
		String tekst = showInputDialog("Skriv inn ønsket tekst:");
		if(tekst == null) break;
		String ord1 = showInputDialog("Skriv inn ønsket ord du vil bytte ut fra teksten:");
		String ord2 = showInputDialog("Skriv inn ønsket ord du vil bytte inn i teksten:");
		Tekstbehandling minTekst = new TekstbehanTedling(tekst);
		showMessageDialog(null, minTekst.toString() + "\nDin tekst med ordbytte: " + minTekst.byttOrd(ord1,ord2));
		}
	}
}