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
}

class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("Ole", 1980);
    Person p2 = new Person("Kari", 1984);
  }
}
