// klasse som gjør om tommer til centimeter
import static javax.swing.JOptionPane.*;
class tommerCentimeter{
		public static void main(String[] args) {
			String tommerInput = showInputDialog("Antall tommer: ");
			double tommer = Double.parseDouble(tommerInput);
			double centimeter = tommer*2.54;
			System.out.println(tommer + " tommer er " + centimeter + " cm");
		}
	}
