class NyString {
	
	private final String tekst;

	public NyString(String tekst) {
		this.tekst = tekst.toLowerCase();
		forkortTegn();
		fjernTegn();
	}

	public void forkortTegn() {
		char tegn;
		String totOrd = "";
		String setningOrd;
		String[] ord = tekst.split(" ");
		for (int i = 0; i < ord.length; i++) {
			setningOrd = ord[i];
			tegn = setningOrd.charAt(0);
			totOrd += tegn;
		}
		System.out.println("Forkortningen av teksten din: " + tekst + " er " +totOrd);
	}

	public void fjernTegn() {
		String nyTekst = tekst.replace("e","");
		System.out.println("Dersom tegnet 'e' fjernes fra teksten din: " + tekst + " får du " + nyTekst);
	}
}