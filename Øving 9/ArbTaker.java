class ArbTaker {
	private Person personalia;
	private final String arbtakernr;
	private final int ansettelsesar;
	private double manedsLonn;
	private double skatteProsent;

	public ArbTaker(Person personalia, String arbtakernr, int ansettelsesar, double manedsLonn, double skatteProsent){
		Navn navn = personalia.getNavn();
		int fAr = personalia.getAr();
		this.personalia = new Person(navn, fAr);
		this.arbtakernr = arbtakernr;
		this.ansettelsesar = ansettelsesar;
		this.manedsLonn = manedsLonn;
		this.skatteProsent = skatteProsent;
	}


	public String getArbtakernr(){
		return arbtakernr;
	}

	public int getAnsettelsesar(){
		return ansettelsesar;
	}

	public double getManedsLonn(){
		return manedsLonn;
	}

	public double getSkatteProsent(){
		return skatteProsent;
	}

	public void setNyLonn(double nyLonn){
		if(nyLonn <= 0){
			throw new IllegalArgumentException("Du kan ikke skrive 0 eller et negativt tall, du skrev " + nyLonn);
		}
		this.manedsLonn = nyLonn;
	}

	public void setNySkatteProsent(double nySkatt){
		if(nySkatt <= 0){
			throw new IllegalArgumentException("Du kan ikke skrive 0 eller et negativt tall, du skrev " + nySkatt);
		}
		this.skatteProsent = nySkatt;
	}

	public double getSkatteTrekkMnd(){
		double skatteTrekkMnd = manedsLonn * skatteProsent;
		return skatteTrekkMnd;
	}

	public double getBruttoLonn(){
		int antMnd = 12;
		double brutto = antMnd * manedsLonn;
		return brutto;
	}

	public double skatteTrekkAr(){
		double antMnd = 10.5;
		double skatteTrekkMnd = manedsLonn * skatteProsent;
		double skatteTrekkAr = skatteTrekkMnd * antMnd;
		return skatteTrekkAr;
	}

	public String getNavn(){
		return personalia.hentEtternavn() + ", " + personalia.hentFornavn();
	}

	public int antAr(){
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int currentAr = kalender.get(java.util.Calendar.YEAR);
		int arFodt = personalia.getAr(); 
		int antAr = currentAr - arFodt;
		return antAr;

	}

	public int antArJobbet(){
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int currentAr = kalender.get(java.util.Calendar.YEAR);
		int antArJobbet = currentAr - ansettelsesar;
		return antArJobbet;		
	}

	public String sjekkAr(int ar){

		if(ar <= 0){
			throw new IllegalArgumentException("Du kan ikke skrive 0 eller et negativt tall, du skrev " + ar);
		}

		else if(ar == antArJobbet()){
			return "Personen har jobbet der i " + ar + " år";
		}
		else{
			return "Personen har ikke jobbet der i " + ar + " år, men har jobbet der i " + antArJobbet() + " år";
		}
	}

	public String toString(){
		String utskrift;
		utskrift = "Ditt navn: " + getNavn() + "\nDin alder: " + antAr() + "\nDitt arbeidsnummer: " + getArbtakernr() + "\nDitt ansettelsesår: " + getAnsettelsesar() + "\nAntall år jobbet: " + antArJobbet() + "\nDin månedslønn: " + getManedsLonn() + "\nDin skatteprosent: " + getSkatteProsent() + "\nDitt skattetrekk per måned: " + getSkatteTrekkMnd() + "\nDin bruttolønn i året: " + getBruttoLonn() + "\nTotalt skattetrekk i året: " + skatteTrekkAr();
		return utskrift;
	}
}