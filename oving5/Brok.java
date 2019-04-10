class Brok{
	private int teller;
	private int nevner;

	public Brok(int teller, int nevner){
		this.teller = teller;

		if(nevner == 0){
			throw new IllegalArgumentException("Nevner kan aldri være 0");
		}else{
		this.nevner = nevner;
		}
	}

	public Brok(int teller){
		this.teller = teller;
		nevner = 1;
	}

	public int getTeller(){
		return teller;
	}

	public int getNevner(){
		return nevner;
	}

	public void add(Brok brok){
		if(this.nevner != brok.getNevner()){
			this.teller = this.teller * brok.getNevner() + brok.getTeller() * this.nevner;
			this.nevner *= brok.getNevner();
		}else{
		this.teller += brok.teller;
		}
	}

	public void minus(Brok brok){
		if(this.nevner != brok.getNevner()){
			this.teller = this.teller * brok.getNevner() - brok.getTeller() * this.nevner;
			this.nevner *= brok.getNevner();
		}else{
		this.teller -= brok.teller;
		}
	}

	public void multi(Brok brok){
		this.teller *= brok.teller;
		this.nevner *= brok.nevner;
	}

	public void div(Brok brok){
		this.teller *= brok.nevner;
		this.nevner *= brok.teller;
	}

	public String toString(){
		return "Du får brøken: " + this.teller + "/" +this.nevner;
	}
}