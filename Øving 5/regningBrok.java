import static javax.swing.JOptionPane.*;
class BrokRegning {
 	public static void main(String[] args) {
 
 		String teller = showInputDialog("Skriv inn ønsket teller: ");
 		int tellerLest = Integer.parseInt(teller);
 		String nevner = showInputDialog("Skriv inn ønsket nevner: ");
 		int nevnerLest = Integer.parseInt(nevner);

 		Brok brok = new Brok(tellerLest, nevnerLest);

 		
 		String operasjon = showInputDialog("1:Addisjon\n2:Subtraksjon\n3:Multiplikasjon\n4:Divisjon");
		int operasjonLest = Integer.parseInt(operasjon);

		String nyTeller = showInputDialog("Skriv inn ønsket teller: ");
		int nyTellerLest = Integer.parseInt(nyTeller);
		String nyNevner = showInputDialog("Skriv inn ønsket nevner: ");
		int nyNevnerLest = Integer.parseInt(nyNevner);
		Brok nyBrok = new Brok(nyTellerLest, nyNevnerLest); 


		switch(operasjonLest){
			case 1:
				brok.add(nyBrok);
				String utskrift = brok.toString();
				showMessageDialog(null, utskrift);
				break;
			case 2:
				brok.minus(nyBrok);
				utskrift = brok.toString();
				showMessageDialog(null, utskrift);
				break;
			case 3:
				brok.multi(nyBrok);
				utskrift = brok.toString();
				showMessageDialog(null, utskrift);
				break;
			case 4:
				brok.div(nyBrok);
				utskrift = brok.toString();
				showMessageDialog(null, utskrift);
				break;
			default :
				showMessageDialog(null, "Ugyldig operasjon valgt, bruk: 1, 2, 3 eller 4");
				break;
	
 		}
 	}
 }