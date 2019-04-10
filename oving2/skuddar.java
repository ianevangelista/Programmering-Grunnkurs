import static javax.swing.JOptionPane.*;
class skuddar{
		public static void main(String[] args) {
			

        System.out.println("Programmet sjekker om valgte år er et skuddår.");
        String arLest = showInputDialog("Velg år: ");   
        int ar = Integer.parseInt(arLest);


        boolean skuddar = ((ar % 4 == 0) && (ar % 100 != 0) || (ar % 400 == 0));

        if (skuddar)
        {
            showMessageDialog(null, ar + " er et skuddår.");
        } else
            showMessageDialog(null, ar + " er ikke et skuddår.");
    }
}
