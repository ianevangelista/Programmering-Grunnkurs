import static javax.swing.JOptionPane.*;
	class Primtall{
			public static void main(String[] args) {
				
				while(true){
					
					String tallLest = showInputDialog("Skriv inn ønsket tall: ");
					int tall = Integer.parseInt(tallLest);
					int i = 0, m = 0, markering = 0;
					m = tall/2;

					if(tall==0 || tall==1){
						 System.out.println(tall+" er ikke et primtall");
						 markering = 1;
					} 
					else{ 
						for(i=2;i<=m;i++){
							if(tall%i==0){
								System.out.println(tall+" er ikke et primtall");	
								markering = 1;
								break;
							}
						}

					if(markering==0){
						System.out.println(tall+" er et primtall");

					}
			}
		}	

	}
}
		
			



		



