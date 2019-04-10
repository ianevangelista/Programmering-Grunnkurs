import static javax.swing.JOptionPane.*;
class merke{
		public static void main(String[] args) {
			
        System.out.println("Programmet sjekker hvilket merke som er billigst.");
        double merkeApris = 35.9;
        double merkeBpris = 39.5;
        int merkeAvekt = 450;
        int merkeBvekt = 500;
        double prisA = merkeAvekt/merkeApris;
        double prisB = merkeBvekt/merkeBpris;

        if((prisA-prisB)>0){
             System.out.println("Merket B er billigst.");
             System.out.println(+prisB);
        }
        else{
             System.out.println("Merket A er billigst.");
             System.out.println(+prisA);
        }


    }
}
