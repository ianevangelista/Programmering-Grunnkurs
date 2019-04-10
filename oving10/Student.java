class Student {
	private final String navn;
	private int antOppg;

	public Student(String navn, int antOppg){
		if(navn == null || antOppg <= 0){
			throw new IllegalArgumentException("Navn må oppgis og økning av oppgaver må være høyere enn 0");
		}
		this.navn = navn;
		this.antOppg = antOppg;
	}

	public String getNavn(){
		return navn;
	}

	public int getAntOppg(){
		return antOppg;
	}

	public void okAntOppg(int okning){
		this.antOppg += okning;
	}

	public String toString(){
		return "Navn: " + navn + "\nAntall oppgaver godkjent: " + antOppg;
	}
}