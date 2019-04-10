import static javax.swing.JOptionPane.*; 
class Analyse{
	public static void main(String[] args) {
		while(true){
		String tekst = showInputDialog("Skriv inn ønsket tekst:");
		if(tekst == null) break;
		String bokstav = showInputDialog("Skriv inn ønsket bokstav du ønsker å sjekke antall forekomster av:");
		Tekstanalyse minTekst = new Tekstanalyse(tekst);
		minTekst.getBestemtTegn(bokstav);
		showMessageDialog(null, minTekst.toString());
		//System.out.println("Antall forekomster av bestemt bokstav er: " + minTekst.getBestemtTegn("e"));
		}
	}
}