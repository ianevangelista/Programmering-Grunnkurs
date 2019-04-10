import static javax.swing.JOptionPane.*;
class TilfeldigTall {
 	public static void main(String[] args) {

 		String velgSystem = showInputDialog("Velg ønsket tallsystem: 1: Heltall eller 2: Desimaltall");
 		int systemValgt = Integer.parseInt(velgSystem);

 		while(true){

	 		if(systemValgt == 1){
	 			String helNedre = showInputDialog("Skriv inn ønsket ønsket nedre grense for heltall: ");
	 			int helNedreLest = Integer.parseInt(helNedre);

	 			String helOvre = showInputDialog("Skriv inn ønsket ønsket øvre grense for heltall: ");
	 			int helOvreLest = Integer.parseInt(helOvre);

	 			MinRandom randHel = new MinRandom(helNedreLest, helOvreLest);
	 			int randomHel = randHel.nesteHeltall(helNedreLest, helOvreLest);
	 			String utskrift = randHel.toStringHel();
	 			showMessageDialog(null, utskrift + randomHel);
	 		}
	 		else if(systemValgt == 2){
	 			String desNedre = showInputDialog("Skriv inn ønsket ønsket nedre grense for desimaltall: ");
	 			double desNedreLest = Double.parseDouble(desNedre);

	 			String desOvre = showInputDialog("Skriv inn ønsket ønsket øvre grense for desimaltall: ");
	 			double desOvreLest = Double.parseDouble(desOvre);

	 			MinRandom randDes = new MinRandom(desNedreLest, desOvreLest);
	 			double randomDes = randDes.nesteDesimaltall(desNedreLest, desOvreLest);
	 			String utskrift = randDes.toStringDes();
	 			showMessageDialog(null, utskrift + randomDes);

	 		}else{
	 			showMessageDialog(null, "Ugyldig valg av tallsystem. Velg 1 eller 2. Prøv på nytt.");
	 		}
	 	}	
 	}
}
