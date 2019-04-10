class Tekstanalyse {
	private String tekst;
	private int[] antallTegn = new int[30];
	private char tegn;
	private int verdi;
	private double totAntall;
	private double antall;
	private double prosent;
	private int antallBestemt;
	private String utskrift;

	public Tekstanalyse(String tekst){
		this.tekst = tekst.toLowerCase();
		setTegn();	
		getAntallForskjelligTegn();
		getProsNonBoks();
	}

	public void setTegn(){
		for(int i = 0; i < tekst.length(); i++){
			tegn = tekst.charAt(i);
			verdi = tegn - 97; // sjekket unicode-verdien til hver bokstav hvor a = 97 og oppover

			if (verdi > -1 && verdi < 26) {
				antallTegn[verdi]++;// må bruke verdi og ikke i
			} 
			
			else if (verdi == 133) {// funnet ved sjekk av unicode
				antallTegn[26]++;
			}

			else if (verdi == 151) {
				antallTegn[27]++;
			}

			else if (verdi == 132) {
				antallTegn[28]++;
			}

			else if (verdi > 28 || verdi < 0) {
				antallTegn[29]++;
			}
			System.out.println("Unicode til tegnet " + tegn + " på plass " + i + " er " + verdi);
		}	
		for (int i = 0; i < antallTegn.length; i++) {
			System.out.println(antallTegn[i]);
		}
	}

	public double getAntallForskjelligTegn(){//funker
		for(int i = 0; i < antallTegn.length; i++){
			if(antallTegn[i] != 0){
				antall++;
			}
		}
		return antall;
	}

	public double getTotTegn(){//funker
		totAntall = 0;
		for(int i = 0; i < antallTegn.length; i++){
			totAntall += antallTegn[i];
		}
		return totAntall;
	}

	public double getProsNonBoks(){
		getTotTegn();
		int antallNonBoks = 0;

		
		if(antallTegn[29] != 0){
			antallNonBoks += antallTegn[29];
		}
		
		prosent = antallNonBoks/totAntall*100;
		return prosent;
	}

	public int getBestemtTegn(String bokstav){//setter en bokstav som parameter
		tegn = bokstav.charAt(0);//det første og eneste tegnet gis variabelen tegn
		verdi = tegn - 97;
		antallBestemt = antallTegn[verdi];


			if(antallBestemt != antallTegn[verdi]){
				return antallBestemt = 0;
			}else{

			return antallBestemt;
			}
		}

	public String getForekomst(){
		int storst = 0;
		int bokstav = 0;
		for (int i = 0; i < 29 ; i++) {
			int nyttTall = antallTegn[i];
			if(nyttTall > storst){
				storst = nyttTall;
				bokstav = i;
			}
		}

		int bokstav1 = bokstav + 97;
		String utskrift = "";
		if (bokstav1 == (26+97)){
			utskrift = "Den bokstaven som forekommer oftest er: æ";
		}
		else if (bokstav1 == (27+97)){
			utskrift = "Den bokstaven som forekommer oftest er: ø";
		}
		else if (bokstav1 == (28+97)){
			utskrift = "Den bokstaven som forekommer oftest er: å";
		}
		else{
			utskrift = "Den bokstaven som forekommer oftest er: " + (char)bokstav1;
		}

		return utskrift;
		
	}

	public String toString(){
		String output = "Antall forskjellige tegn er: "+ antall +"\nAntall tegn er: "+ totAntall +"\nProsentandelen av ikke-bokstaver er: "+ prosent +"\nAntall forekomster av den bestemte bokstaven er: "+ antallBestemt +"\n" + getForekomst();
		return output;					
	}
}