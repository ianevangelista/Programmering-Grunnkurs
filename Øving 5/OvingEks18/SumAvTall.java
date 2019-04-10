class SumAvTall {
  public static void main(String[] args) {
    for (int linjeteller = 0; linjeteller < 10; linjeteller++) {
      int sum = 0;
      for (int tall = 1; tall <= linjeteller; tall++) {
        sum += tall;
        System.out.print(tall + " ");
      } // for tall System.out.println("Summen blir: " + sum);
    } // for linjeteller
  } // main
}
