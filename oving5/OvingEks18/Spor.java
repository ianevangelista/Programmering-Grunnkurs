class Spor {
  private String tittel;
  private String artist;
  private double lengde;

  public Spor(String tittel, String artist, double lengde){
    this.tittel = tittel;
    this.artist = artist;
    this.lengde = lengde;
  }

  public String getTittel(){
    return tittel;
  }
  public void setTittel(String nyTittel){
    this.tittel = nyTittel;
  }
  public String getArtist(){
    return artist;
  }
  public void setArtist(String nyArtist){
    this.artist = nyArtist;
  }
  public double getLengde(){
    return lengde;
  }
  public void setLengde(double nyLengde){
    this.lengde = nyLengde;
  }

  public boolean equals(Object obj){
    if(obj instanceof Spor){
      Spor t = (Spor) obj;
      if(t == this)return true;
      else if(this.tittel.equals(t.getTittel())&& this.artist.equals(t.getArtist()))return true;
      }
      return false;
  }

  public String toString(){
    return tittel + " " + artist + " " + lengde;
  }
}
