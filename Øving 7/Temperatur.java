class Temperatur {
	private int[][] temperatur;
	private int dag;
	private int time;

	public Temperatur(int dag, int time) {
		this.temperatur = new int[dag][time];
		setTemperatur();
	}

	public void setTemperatur(){
		java.util.Random random = new java.util.Random();

		int tall = 0;
		for(int i = 0; i < dag; i++){	
			for (int j = 0; j < time; j++) {
				tall = random.nextInt(50)-25;
				this.temperatur[i][j] = tall;
				System.out.println(this.temperatur[i][j]);
				System.out.println("FUNK!!!");
			}
		}
	}
}