import static javax.swing.JOptionPane.*;
class Gange{
			public static void main(String[] args) {

				String tallLest = showInputDialog("Skriv ønsket tall for tallets gangetabell: ");
				String tallLest2 = showInputDialog("Skriv ønsket tall: ");
				int gangeTall = Integer.parseInt(tallLest); 
				int gangeTall2 = Integer.parseInt(tallLest2);
				int sum = 0;

				while (gangeTall<=gangeTall2) {
					for(int tall=1; tall<=10; tall++){
						sum = gangeTall*tall;
						System.out.println(gangeTall + " * " + tall + " = " +sum);

				}
				gangeTall++;
			}
			
		}

}