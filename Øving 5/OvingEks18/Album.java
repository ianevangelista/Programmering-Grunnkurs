class Album {
  private String navn;
  private int antSpor;
  private Spor[] spilleliste;
  private final int MAKS_LENGDE = 60;

  public Album(String navn, Spor[] spilleliste){
    this.navn = navn;
    this.spilleliste = new Spor[spilleliste.length];
    for (int i = 0; i < spilleliste.length; i++) {
      this.spilleliste[i] = spilleliste[i];
    }
    antSpor = spilleliste.length;
  }

  public Album(String navn, int maksAntSpor){
    this.navn = navn;
    spilleliste = new Spor[maksAntSpor];
    antSpor = 0;
  }

  public double getSpilletid(){
    double spilletid = 0;
    for (int i = 0; i < antSpor; i++) {
      spilletid += spilleliste[i].getLengde();
    }
    return spilletid;
  }

  public boolean regNyttSpor(Spor nyttSpor){
    if(antSpor >= spilleliste.length){
      return false;
    }
    else{
      if(sjekkSpor(nyttSpor)){
        return false;
      }
      else if(getSpilletid() + nyttSpor.getLengde() < MAKS_LENGDE){
        return false;
      }
      else{
        spilleliste[antSpor] = new Spor(nyttSpor.getArtist(), nyttSpor.getTittel(), nyttSpor.getLengde());
        antSpor++;
        return true;
      }
    }
  }

  private boolean sjekkSpor(Spor t){
    for(int i=0; i < antSpor; i++){
      if (spilleliste[i].equals(t)) return true;
    } return false;
  }

  public Spor[] finnSporArtist(String artist){
    Spor[] kopi = new Spor[antSpor];
    int kopiTeller = 0;
    for (int i = 0; i < antSpor; i++) {
      if(spilleliste[i].getArtist().equals(artist)){
        kopi[kopiTeller] = spilleliste[i];
        kopiTeller++;
      }
    }
    if(kopiTeller==0)return null;
    else if(kopiTeller<antSpor){
      Spor[] tmp = new Spor[kopiTeller];
      for (int i = 0; i < kopiTeller; i++) {
        tmp[i] = kopi[i];
      }
      return tmp;
    }
    else{
      return kopi;
    }
  }
}
