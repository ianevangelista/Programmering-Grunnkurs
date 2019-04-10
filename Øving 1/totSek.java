// klasse som regner om timer, minutter og sekunder til totalt antall sekunder
import static javax.swing.JOptionPane.*;
class tid{
		public static void main(String[] args) {
			String timeInput = showInputDialog("Antall timer: ");
			String minuttInput = showInputDialog("Antall minutter: ");
			String sekundInput = showInputDialog("Antall sekunder: ");
			int time = Integer.parseInt(timeInput);
			int minutt = Integer.parseInt(minuttInput);
			int sekund = Integer.parseInt(sekundInput);
			int totSek = (time*60*60)+(minutt*60)+sekund;
			showMessageDialog(null, "Det er totalt " + totSek+ " sekunder");
		}
	}