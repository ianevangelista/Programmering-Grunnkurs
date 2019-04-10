class Test {
  public static void main(String[] args) {

    int[] tabell = {9,8,7,6,5,4,3,2,1};

    for (int start = 0; start < tabell.length; start++) {
      int hittilMinst = start;
      for (int i = start + 1; i < tabell.length; i++) {
        if (tabell[i] < tabell[hittilMinst]) hittilMinst = i;
      }
      int hjelp = tabell[hittilMinst];
      tabell[hittilMinst] = tabell[start];
      tabell[start] = hjelp;
    }

    for (int i = 0; i < tabell.length; i++) {
      System.out.println(tabell[i]);
    }
  }
}
