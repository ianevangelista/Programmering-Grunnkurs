import java.io.*;
import java.util.*;
class NyKontoVedlikehold {
	public static void main(String[] args) {
		String transaksjonFil = "transaksjon.txt";
		String saldo = "saldoNy.txt";
		double tall = 0;
		double sum = 0;
		String saldoLest = "";
		double gammelSaldo = 0;
		double nySaldo = 0;
		String linje = "";

		try{
		FileReader leseforbTilFilNy = new FileReader(saldo);
		BufferedReader leserNy = new BufferedReader(leseforbTilFilNy);
		saldoLest = leserNy.readLine();
		gammelSaldo = Double.parseDouble(saldoLest);
		leserNy.close();
		System.out.println(gammelSaldo);

		FileReader leseforbTilFil = new FileReader(transaksjonFil);
		BufferedReader leser = new BufferedReader(leseforbTilFil);
		linje = leser.readLine();
		while(linje != null) {
			String ord[] = linje.split(" ");
			tall = Double.parseDouble(ord[1]);
			if(ord[0].equals("U")){
				tall = -Double.parseDouble(ord[1]);
			}
			else if(ord[0].equals("I")){
				tall = Double.parseDouble(ord[1]);
			}
			System.out.println(linje);
			sum += tall;
			linje = leser.readLine();
		}
		leser.close();
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
	}catch(Exception e){
		System.out.println("Her kom det en feil " + e.getMessage());
	}
	}
}
