import static javax.swing.JOptionPane.*;
class Gange {
  public static void main(String[] args) {
    int sum = 0;
    String velgFra = showInputDialog("Velg gangetabell start: ");
    String velgTil = showInputDialog("Velg gangetabell slutt: ");
    int fra = Integer.parseInt(velgFra);
    int til = Integer.parseInt(velgTil);
    for (int i = fra; i <= til; i++) {
      for (int j = 1; j < 11; j++) {
        sum = i*j;
        System.out.println(i + " * " + j + " = " + sum);
      }
    }
  }
}
