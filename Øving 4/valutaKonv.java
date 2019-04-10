import static javax.swing.JOptionPane.*;
class valutaKonvertering {
  public static void main(String[] args) {

	String valutaLest1 = showInputDialog("1:USD\n2:EUR\n3:SEK");
	char valutaValgt1 = valutaLest1.charAt(0);

	String valutaLest2 = showInputDialog("1:Til NOK\n2:Fra NOK");
	int valutaValgt2 = Integer.parseInt(valutaLest2);

	String verdiLest = showInputDialog("Skriv inn ønsket verdi");
  	int inputVerdi = Integer.parseInt(verdiLest);

    Valuta nok = new Valuta("NOK", 1);
    Valuta usd = new Valuta("USD", 0.11888);
    Valuta eur = new Valuta("EUR", 0.10251);
    Valuta sek = new Valuta("SEK", 1.08464);

    	if(valutaValgt2==1){

			switch(valutaValgt1){
				case '1':
					showMessageDialog(null, "Du har valgt: " +inputVerdi+ usd.getValuta()+" og tilsvarer " +(inputVerdi/usd.getKurs())+nok.getValuta());
					break;
				case '2':
					showMessageDialog(null, "Du har valgt: " +inputVerdi+ eur.getValuta()+" og tilsvarer " +(inputVerdi/eur.getKurs())+nok.getValuta());
					break;
				case '3':
					showMessageDialog(null, "Du har valgt: " +inputVerdi+ sek.getValuta()+" og tilsvarer " +(inputVerdi/sek.getKurs())+nok.getValuta());
					break;
				default :
					showMessageDialog(null, "Ugyldig valuta valgt, bruk: 1 2 3");
					break;
			}
		}
		
		else if(valutaValgt2==2){

			switch(valutaValgt1){
				case '1':
					showMessageDialog(null, "Du har valgt: " +inputVerdi+ nok.getValuta()+" og tilsvarer " +(inputVerdi*usd.getKurs())+usd.getValuta());
					break;
				case '2':
					showMessageDialog(null, "Du har valgt: " +inputVerdi+ nok.getValuta()+" og tilsvarer " +(inputVerdi*eur.getKurs())+eur.getValuta());
					break;
				case '3':
					showMessageDialog(null, "Du har valgt: " +inputVerdi+ nok.getValuta()+" og tilsvarer " +(inputVerdi*sek.getKurs())+sek.getValuta());
					break;
				default :
					showMessageDialog(null, "Ugyldig valuta valgt, bruk: 1 2 3");
					break;
				}
			}else{
				showMessageDialog(null, "Ugyldig valg, bruk: 1 eller 2");
			}
		}
	}