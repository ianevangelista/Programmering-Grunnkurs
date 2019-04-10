import static javax.swing.JOptionPane.*;
class ProsjektKlasse {
  private final String tittel;
  private final String navn;
  private int budsjett;

  public ProsjektKlasse(String tittel, String navn, int budsjett){
    this.tittel = tittel;
    this.navn = navn;
    this.budsjett = budsjett;
  }

  public String getTittel(){
    return tittel;
  }

  public String getNavn(){
    return navn;
  }

  public int getBudsjett(){
    return budsjett;
  }

  public boolean utforTransaksjon(double belop){
    if(belop > budsjett) return false;
    else{
      budsjett-=belop;
    }
    return true;
  }

  public String toString(){
    String info = "Tittel: " + tittel + "\nAnsvarlig: " + navn + "\nGjenstående budjett: " + budsjett;
    return info;
  }
}
class Prosjekt {
  public static void main(String[] args) {
    ProsjektKlasse prosjekt = new ProsjektKlasse("LEGO", "Ian", 5000);
    String tallLest = "";
    int belop = 0;
    while(tallLest!=null){
      tallLest = showInputDialog("Velg beløp: ");
      belop = Integer.parseInt(tallLest);
      prosjekt.utforTransaksjon(belop);
      showMessageDialog(null, prosjekt.toString());
    }
  }
}
