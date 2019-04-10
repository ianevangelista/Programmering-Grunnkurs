import java.util.Random;
	class TerningKast {
 	public static void main(String[] args) {
 		int oyne1 = 0;
 		int oyne2 = 0;
 		int runde = 0;

 		Terning spillerA = new Terning("SpillerA", 0, 0, " har fått 100 poeng eller mer");
    	Terning spillerB = new Terning("SpillerB", 0, 0, " har fått 100 poeng eller mer");

    	int sumA = spillerA.getTot();
    	int sumB = spillerB.getTot();

    	while(sumA<101 || sumB<101){

    		oyne1 = spillerA.kastTerningen();
    		oyne2 = spillerB.kastTerningen();
            if(oyne1 == 1){
                sumA = 0;
            }else{
                sumA += oyne1;
            }
            if(oyne2 == 1){
                sumB = 0;
            }else{
                sumB += oyne2;
            }
    		runde++;
    		System.out.println("Runde: "+runde+"\n"+spillerA.getSpiller()+" fikk "+oyne1+" og har " +sumA+" poeng\n"+spillerB.getSpiller()+" fikk "+oyne2+" og har " +sumB+ " poeng\n");
            
            if(sumA >= 100){
                System.out.println("Runde: "+runde+"\n"+spillerA.getSpiller()+spillerA.erFerdig());
                break;

            }
            else if(sumB >= 100){
                System.out.println("Runde: "+runde+"\n"+spillerB.getSpiller()+spillerB.erFerdig());
                break;
            }

    	}


 	}
}