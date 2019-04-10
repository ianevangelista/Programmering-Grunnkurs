import java.io.*;
import java.util.*;
class KontoVedlikehold {
	public static void main(String[] args) throws IOException {
		String transaksjonFil = "transaksjon.txt";
		String saldoFil = "saldo.txt";
		double tall = 0;
		double sum = 0;
		String saldoLest = "";
		double gammelSaldo = 0;
		double nySaldo = 0;
		String linje[] = new String[4];

		FileReader leseforbTilFilNy = new FileReader(saldoFil);
		BufferedReader leserNy = new BufferedReader(leseforbTilFilNy);
		saldoLest = leserNy.readLine();
		gammelSaldo = Double.parseDouble(saldoLest);
		leserNy.close();

		FileReader leseforbTilFil = new FileReader(transaksjonFil);
		BufferedReader leser = new BufferedReader(leseforbTilFil);
		for (int i = 0; i < linje.length; i++) {
			linje[i] = leser.readLine();
		}
		leser.close();
		String ord1[] = linje[0].split(" ");
		String ord2[] = linje[1].split(" ");
		String ord3[] = linje[2].split(" ");
		String ord4[] = linje[3].split(" ");

		if(ord1[0].equals("U")){
			tall = Double.parseDouble(ord1[1]);
			sum -= tall;
		}
		else if(ord1[0].equals("I")){
			tall = Double.parseDouble(ord1[1]);
			sum += tall;
		}

		if(ord2[0].equals("U")){
			tall = Double.parseDouble(ord2[1]);
			sum -= tall;
		}
		else if(ord2[0].equals("I")){
			tall = Double.parseDouble(ord2[1]);
			sum += tall;
		}

		if(ord3[0].equals("U")){
			tall = Double.parseDouble(ord3[1]);
			sum -= tall;
		}
		else if(ord3[0].equals("I")){
			tall = Double.parseDouble(ord3[1]);
			sum += tall;
		}

		if(ord4[0].equals("U")){
			tall = Double.parseDouble(ord4[1]);
			sum -= tall;
		}
		else if(ord4[0].equals("I")){
			tall = Double.parseDouble(ord4[1]);
			sum += tall;
		}
		nySaldo = sum + gammelSaldo;

		FileWriter skriveforbTilFil = new FileWriter(saldoFil, false);
		PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveforbTilFil));
		if(nySaldo < 0){
			System.out.println("Negativ saldo");
			skriver.println(gammelSaldo);
		}else{
			skriver.println(nySaldo);
		}
		skriver.close();
		System.out.println("Sum ført inn eller tatt ut: " + sum + "kr");
		System.out.println("Nåværende saldo: " + nySaldo + "kr");
	}
}