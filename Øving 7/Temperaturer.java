class Temperaturer {
	private int[][] temperatur;
	private int dag;
	private int time;
	private java.util.Random random = new java.util.Random();
	private int middelDag;
	private int middelTime;
	private int middelManed;
	private int antDogn;

	public Temperaturer(int dag, int time) {
		this.temperatur = new int[dag][time];
		this.dag = dag;
		this.time = time;
		setTemperatur();
	}

	public void setTemperatur(){
		int tall = 0;

		for(int i = 0; i < dag; i ++){

			for(int j = 0; j < time; j++){
			tall = random.nextInt(10);
			this.temperatur[i][j] = tall;
			System.out.print(temperatur[i][j] + " ");
			}
			System.out.println();
		}
		//System.out.println("Her er en test: "+temperatur[0][0] + "" +temperatur[0][1]+ ""+temperatur[0][2]);
	}

	public int[] getMiddelDag() {
		int totTemp = 0;
		middelDag = 0;
		int[] middelTempDag = new int[this.dag];

		for (int j = 0; j<this.dag; j++) {
			totTemp = 0;
			for (int i = 0; i < this.time; i++) {
				totTemp += temperatur[j][i];
			}
			middelDag = totTemp/this.time;
			middelTempDag[j]=middelDag;
		}

		return middelTempDag;
	}

	public int[] getMiddelTime() {
		int totTemp = 0;
		middelTime = 0;
		int[] middelTempTime = new int[this.time];

		for (int j = 0; j< this.time; j++) {
			totTemp=0;
			for (int i = 0; i < this.dag; i++) {
				totTemp += temperatur[i][j];
		}
		middelTime = totTemp/this.dag;
		middelTempTime[j]=middelTime;
			
		}

		return middelTempTime;
	}

	public int getMiddelManed() {
		int totTemp = 0;
		middelManed = 0;

		for (int i = 0; i < dag; i++) {
			for (int j = 0; j < time; j++) {
				totTemp += temperatur[i][j];
			}
		}
		middelManed = (totTemp/this.time)/this.dag;
		return middelManed;
	}


	public int[] antDognGruppe() {
		antDogn = 0;
		int[] dagNr = getMiddelDag();
		int[] gruppe = new int[5];
		int totTemp = 0;
		middelDag = 0;

		for (int i = 0; i < dag; i++) {
			if(dagNr[i]<-5){
				gruppe[0]++;
			}else if(dagNr[i] > - 5 && dagNr[i] < 0){
				gruppe[1]++;
			}
			else if(dagNr[i] > 0 && dagNr[i] < 5){
				gruppe[2]++;
			}
			else if(dagNr[i] > 0 && dagNr[i] < 5){
				gruppe[2]++;
				}
			else if(dagNr[i] > 5 && dagNr[i] < 10){
				gruppe[3]++;
				}
			else if(dagNr[i] > 10){
				gruppe[4]++;
			}

		}

		return gruppe;

	}
}