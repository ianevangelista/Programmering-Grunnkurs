// klasse som regner om timer, minutter og sekunder til totalt antall sekunder
import static javax.swing.JOptionPane.*;
class fraSek{
		public static void main(String[] args) {
			String sekundInput = showInputDialog("Antall sekunder: ");
			int totSek = Integer.parseInt(sekundInput);
			int time = (totSek/60)/60;
			totSek = totSek - time*60*60;
			int minutt = totSek/60;
			totSek = totSek - minutt*60;
			int sekund = (totSek%60)%60;
			showMessageDialog(null, "Timer: " + time + " minutter: "+ minutt + " sekunder: " + sekund);
		}
	}