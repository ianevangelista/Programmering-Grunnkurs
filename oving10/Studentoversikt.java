import static javax.swing.JOptionPane.*; 
class StudentOversikt {
	private static final String[] VALG = {"Registrer student", "Øk antall oppgaver godkjent", "Antall godkjent", "Vis alle"};
	private static final int REG = 0;
	private static final int ENDRE = 1;
	private static final int GODKJENT = 2;
	private static final int VIS = 3;
	
	public static void main(String[] args) {

		Student[] studenter = new Student[0];
		Oppgaveoversikt oversikt = new Oppgaveoversikt(studenter, 0);
		Boolean ok1 = oversikt.regNyStudent("Ian", 9);
		Boolean ok2 = oversikt.regNyStudent("Nikolai", 3);
		Boolean ok3 = oversikt.regNyStudent("Kasper", 5);
		Boolean ok4 = oversikt.regNyStudent("Zaim", 13);
		
		while(true){
			int inputValg = showOptionDialog(null, "Velg ønsket operasjon", "Endre data", 0, PLAIN_MESSAGE, null, VALG, VALG[0]);
			String resultat = "";
			if(inputValg < 0)break;
			switch(inputValg){
				case REG:
					String navn = showInputDialog("Skriv inn navn:");
					String oppgaver = showInputDialog("Skriv inn antall oppgaver godkjent:");
					int oppgaverLest = Integer.parseInt(oppgaver);
					Boolean okStudent = oversikt.regNyStudent(navn, oppgaverLest);
					resultat = oversikt.toStringStudent();
					showMessageDialog(null, resultat);
					break;
				case ENDRE:
					String velgStud = showInputDialog("Velg student ved indeks:");
					int velgStudLest = Integer.parseInt(velgStud);
					String nyGodkjent = showInputDialog("Øk antall godkjente oppgaver:");
					int nyGodkjentLest = Integer.parseInt(nyGodkjent);
					oversikt.nyAntOppg(velgStudLest, nyGodkjentLest);
					resultat = oversikt.toStringStudent();
					showMessageDialog(null, resultat);
					break;
				case GODKJENT:
					String velgStudent = showInputDialog("Velg student ved indeks for å sjekke antall oppgaver godkjent:");
					int velgStudentLest = Integer.parseInt(velgStudent);
					resultat = "Antall godkjente er: " + oversikt.antOppg(velgStudentLest);
					showMessageDialog(null, resultat);
				case VIS:
					resultat = oversikt.toStringStudent();
					showMessageDialog(null, resultat);
				default:
					break;
			}
		}
	}
}