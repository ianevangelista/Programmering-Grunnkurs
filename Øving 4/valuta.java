class Valuta{
	private final String valutaNavn;
	private double kurs;

		public Valuta(String valutaNavn, double kurs){
		this.valutaNavn = valutaNavn;
		this.kurs = kurs;
	}

		public String getValuta(){
		return valutaNavn;
	}

		public double getKurs(){
		return kurs;
	}
}