class Person {
  private final String navn;
  private final int ar;

  public Person(String navn, int ar){
    this.navn = navn;
    this.ar = ar;
  }

  public String getNavn(){
    return navn;
  }
  public int getAr(){
    return ar;
  }

  public boolean equalsAr(Object obj){
    if(!(obj instanceof Person))return false;
    Person person = (Person) obj;//caster
    if(this.ar==person.getAr())return true;
    else return false;
  }

  public int compareToAlder(Person pers2){
    int tall1 = getAr();
    int tall2 = pers2.getAr();
    if(tall1 > tall2)return -1;
    else if(tall1==tall2)return 0;
    else return 1;
  }
}

class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("Ole", 1980);
    Person p2 = new Person("Kari", 1984);

    boolean likeGamle = p1.equalsAr(p2);
    if(likeGamle) System.out.println("Like gamle");
    else System.out.println("Ikke like gamle");

    int resultat = p1.compareToAlder(p2);
    if(resultat < 0)System.out.println("p2 er eldst");
    else if(resultat > 0)System.out.println("p1 er eldst");
    else System.out.println("Begge er like gamle");

  }
}
