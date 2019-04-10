class Tekstbehandling {
	private String tekst;
	private String nyTekst;
	private String[] ord;

	public Tekstbehandling(String tekst) {
		this.tekst = tekst;
	}

	public int antallOrd() {
		ord = tekst.split(" ");
		int totOrd = ord.length;
		return totOrd;
	}

	public int avgOrdLengde() {
		ord = tekst.split(" ");
		int ordLengde = 0;
		int totLengde = 0;
		int avgLengde = 0;
		for (int i = 0; i < ord.length; i++) {
			ordLengde = ord[i].length();
			totLengde += ordLengde;
		}
		avgLengde = totLengde/ord.length;
		return avgLengde;
	}

	public int avgOrdPeriode() {
		ord = tekst.split(".:?!");
		int totPeriode = ord.length;
		int totOrd = antallOrd();
		int avgPerPeriode = 0;
		avgPerPeriode = totOrd/totPeriode;

		return avgPerPeriode;
	}

	public String byttOrd(String ord1, String ord2) {
		String nyTekst = tekst.replace(ord1, ord2);
		return nyTekst;
	}

	public String getText() {
		return tekst;
	}

	public String setCapital() {
		String storeBokst = tekst.toUpperCase();
		return storeBokst;
	}

	public String toString() {
		String utskrift = "Din tekst: " + tekst + "\nDin tekst i store bokstaver: " + setCapital() + "\nAntall ord: " + antallOrd() + "\nGjennomsnittlig ordlengde: " + avgOrdLengde() + "\nGjennomsnittlig ord per periode: " + avgOrdPeriode();
		return utskrift;
	}
}

