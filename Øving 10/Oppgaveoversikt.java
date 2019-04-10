class Oppgaveoversikt {
	private Student[] studenter;
	private int antStud = 0;

	public Oppgaveoversikt(Student[] studenter, int antStud){
		this.antStud = antStud;
		this.studenter = studenter;
	}

	public int getAntStud(){
		return antStud;
	}

	public int antOppg(int velgStud){
		return studenter[velgStud].getAntOppg();
	}

	public Boolean regNyStudent(String navn, int antOppg){
		if(navn == null || antOppg <= 0){
			throw new IllegalArgumentException("Navn må oppgis og økning av oppgaver må være høyere enn 0");
		}
		if(antStud == studenter.length){
			utvidTabell();
		}
		Student nyStudent = new Student(navn, antOppg);
		studenter[antStud] = nyStudent;
		antStud++;
		return true; 
	}

	public Boolean nyAntOppg(int velgStud, int antOkning){
		Student studentValgt = studenter[velgStud];
		if(antOkning > 0){
			studentValgt.okAntOppg(antOkning);
			return true;
		}else{
			return false;
		}
	}

	private void utvidTabell() {
		Student[] nyTab = new Student[studenter.length + 1];
		for(int i = 0; i < studenter.length; i++){
			nyTab[i] = studenter[i];
		}
		studenter = nyTab;
	}

	public String toStringStudent(){
		String utskrift = "";
		for (int i = 0; i < studenter.length; i++) {
			utskrift += studenter[i].toString() + "\n";
		}
		return utskrift;
	}
}