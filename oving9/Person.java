class Person {
	private final Navn navn;
	private final int fAr;

	public Person(Navn navn, int fAr){
		String fornavn = navn.getFornavn();
		String etternavn = navn.getEtternavn();
		this.navn = new Navn(fornavn, etternavn);
		this.fAr = fAr;
	}

	public Navn getNavn(){
		return new Navn(navn.getFornavn(), navn.getEtternavn());
	}

	public String hentFornavn(){
		return navn.getFornavn();
	}

	public String hentEtternavn(){
		return navn.getEtternavn();
	}

	public int getAr(){
		return fAr;
	}

}

