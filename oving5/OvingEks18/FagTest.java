class Fag {
  private String fagkode;
  private String fagnavn;
  private int antStud = 0;

  public Fag(String fagkode, String fagnavn){
    if(fagkode == null|| fagkode.trim().equals("") || fagnavn == null||fagnavn.trim().equals("")){
      throw new IllegalArgumentException("Du må oppgi fagkode og fagnavn");
    }
    this.fagkode = fagkode;
    this.fagnavn = fagnavn;
  }

  public String getNavn(){
    return fagnavn;
  }

  public String getKode(){
    return fagkode;
  }

  public int getAntStud(){
    return antStud;
  }

  public void setAntStud(int nyAnt){
    if(nyAnt < 0) throw new IllegalArgumentException("Kan ikke være mindre enn 0");
    antStud = nyAnt;
  }
}

class Fagkatalog{
  private Fag[] fag;
  private int antFag = 0;

  public Fagkatalog(Fag[] fag){
    this.fag = new Fag[fag.length];
    for (int i = 0; i < fag.length; i++) {
      this.fag[i] = fag[i];
    }
    this.antFag = fag.length;
  }

  public int totStud(){
    int sum = 0;
    if(antFag < 1)return sum;
    for (int i = 0; i < antFag; i++) {
      sum += fag[i].getAntStud();
    }
    return sum;
  }

  public void utvidTabell(){
    Fag[] kopiTab = new Fag[fag.length + 1];
    for (int i = 0; i < fag.length; i++) {
      kopiTab[i] = fag[i];
    }
    fag = kopiTab;
  }

  public boolean regFag(Fag nyttFag){
    if(antFag == fag.length){
      utvidTabell();
    }
    if(!(nyttFag instanceof Fag))return false;
    //Fag regFag = (Fag) nyttFag;
    for (int i = 0; i < antFag; i++) {
      if(fag[i].getNavn().equals(nyttFag.getNavn()) || fag[i].getKode().equals(nyttFag.getKode()))return false;
    }
    fag[antFag] = nyttFag;
    antFag++;
    return true;
  }

  public int maksStud(){
    if(antFag > 0){
      int maks = fag[0].getAntStud();
      for (int i = 1; i < antFag; i++) {
        if(maks < fag[i].getAntStud())maks = fag[i].getAntStud();
      }
      return maks;
    }
    return 0;
  }

  public Fag[] antMaksStud(){
    int maks = maksStud();
    Fag[] fagMaks = new Fag[antFag];
    int antFagMaks = 0;
    for (int i = 0; i < antFag; i++) {
      if(fag[i].getAntStud() == maks){
        fagMaks[antFagMaks] = fag[i];
        antFagMaks++;
      }
    }
    Fag[] kopi = new Fag[antFagMaks];
    for (int i = 0; i < antFagMaks; i++) {
      kopi[i] = fagMaks[i];
    }
    return kopi;
  }
}

class FagTest {
  public static void main(String[] args) {

    Fag[] fag = new Fag[0];
    Fagkatalog fagkatalog = new Fagkatalog(fag);

    Fag norsk = new Fag("001", "Norsk");
    Fag engelsk = new Fag("002", "Engelsk");
    Fag spansk = new Fag("003", "Spansk");
    Fag svensk = new Fag("004", "Svensk");
    norsk.setAntStud(10);
    engelsk.setAntStud(30);
    spansk.setAntStud(30);
    svensk.setAntStud(50);

    boolean ok1 = fagkatalog.regFag(norsk);
    boolean ok2 = fagkatalog.regFag(engelsk);
    boolean ok3 = fagkatalog.regFag(spansk);
    boolean ok4 = fagkatalog.regFag(svensk);

    if(ok1) System.out.println("Registrert");
    if(!ok1) System.out.println("NOPPP");

    System.out.println(fag.length);
  }
}
