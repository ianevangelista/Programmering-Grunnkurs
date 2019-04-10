import java.util.Random;
class MinRandom {
	Random tilfeldig = new Random();
	private int tilfeldigHel;
	private double tilfeldigDes;
	private int helOvre;
	private int helNedre;
	private double desOvre;
	private double desNedre;

	public MinRandom(int helNedre, int helOvre){
		this.helNedre = helNedre;
		this.helOvre = helOvre;
		this.tilfeldigHel = tilfeldigHel;
	}
	public MinRandom(double desNedre, double desOvre){
		this.desNedre = desNedre;
		this.desOvre = desOvre;
		this.tilfeldigDes = tilfeldigDes;
	}

	public int getHelNedre(){
		return helNedre;
	}

	public int getHelOvre(){
		return helOvre;
	}

	public double getDesNedre(){
		return desNedre;
	}

	public double getDesOvre(){
		return desOvre;
	}

	public int nesteHeltall(int helNedre, int helOvre){
		this.tilfeldigHel = tilfeldigHel;
		if (helNedre >= helOvre) {
			throw new IllegalArgumentException("Øvre grense må være større enn nedre grense");
		}
		else{
		int tilfeldigHel = tilfeldig.nextInt((helOvre-helNedre)+1)+helNedre; 
		return tilfeldigHel;
		}
	}

	public double nesteDesimaltall(double desNedre, double desOvre){
		this.tilfeldigDes = tilfeldigDes;
		if (desNedre >= desOvre) {
			throw new IllegalArgumentException("Øvre grense må være større enn nedre grense");
		}
		else{
		double tilfeldigDes = desNedre + (desOvre - desNedre) * tilfeldig.nextDouble(); 
		return tilfeldigDes;
		}
	}

	public String toStringHel(){
		return "Nedre grense heltall: " + helNedre + "\nØvre grense heltall: " + helOvre + "\nDitt tilfeldige heltall: ";
	}

	public String toStringDes(){
		return "Nedre grense desimtaltall: " + desNedre + "\nØvre grense desimtaltall: " + desOvre + "\nDitt tilfeldige desimtaltall: ";
	}

}