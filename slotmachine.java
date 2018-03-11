
public class slotmachine 
{
	public static void main(String args[]) 
	
	{ int simb1= 0;
	  int simb2= 0;
	  int simb3= 0;
	  int cont= 0;
	  int punti= 0;
	  int puntiTot= 0;
	  final int TRISDIV= 0;
	  final int DOBSIM= 2;
	  final int TRIS= 5;
	  final int TRIS6= 10;
	  final int MIN= 1;
	  final int MAX= 6;
	  final int MAXGIO= 20;
	  
	  do
	  
	 { simb1= (int)(Math.random()* MAX)+MIN;
	  simb2= (int)(Math.random()* MAX)+MIN;
	  simb3= (int)(Math.random()* MAX)+MIN;
	  
	  if (simb1==simb2)
	 {if (simb2==simb3)
	  {if (simb1==6)
	   {punti=10;
	   System.out.print("Il valore della casella 1 è: ");
	   System.out.println(simb1);
	   System.out.print("Il valore della casella 2 è: ");
	   System.out.println(simb2);
	   System.out.print("Il valore della casella 3 è: ");
	   System.out.println(simb3);
	   System.out.print("Congratulazioni,hai ottenuto: ");
	   System.out.println(TRIS6);
	   }
		  
	  } 
     
	  
	  else
	  {punti=5;
	   System.out.print("Il valore della casella 1 è: ");
	   System.out.println(simb1);
	   System.out.print("Il valore della casella 2 è: ");
	   System.out.println(simb2);
	   System.out.print("Il valore della casella 3 è: ");
	   System.out.println(simb3);
	   System.out.print("Congratulazioni,hai ottenuto: ");
	   System.out.println(TRIS);
	   }
	 }
	  else
	  {punti=2;
	   System.out.print("Il valore della casella 1 è: ");
	   System.out.println(simb1);
	   System.out.print("Il valore della casella 2 è: ");
	   System.out.println(simb2);
	   System.out.print("Il valore della casella 3 è: ");
	   System.out.println(simb3);
	   System.out.print("Congratulazioni,hai ottenuto: ");
	   System.out.println(DOBSIM);
	   }
	  
	  if(simb1==simb3)
	   {punti=2;
	   System.out.print("Il valore della casella 1 è: ");
	   System.out.println(simb1);
	   System.out.print("Il valore della casella 2 è: ");
	   System.out.println(simb2);
	   System.out.print("Il valore della casella 3 è: ");
	   System.out.println(simb3);
	   System.out.print("Congratulazioni,hai ottenuto: ");
	   System.out.println(DOBSIM);
	   }  
	  else
	  {if (simb2==simb3)
	     {punti=2;
	     System.out.print("Il valore della casella 1 è: ");
		 System.out.println(simb1);
		 System.out.print("Il valore della casella 2 è: ");
		 System.out.println(simb2);
		 System.out.print("Il valore della casella 3 è: ");
		 System.out.println(simb3);
		 System.out.print("Congratulazioni,hai ottenuto: ");
		 System.out.println(DOBSIM);
		 } 
	  else
	     {punti=0;
	     System.out.print("Il valore della casella 1 è: ");
		 System.out.println(simb1);
		 System.out.print("Il valore della casella 2 è: ");
		 System.out.println(simb2);
		 System.out.print("Il valore della casella 3 è: ");
		 System.out.println(simb3);
		 System.out.print("Congratulazioni,hai ottenuto: ");
		 System.out.println(TRISDIV);
		 }
		  
	  } 
		  
		cont = cont+1;
		puntiTot=puntiTot+punti;
		System.out.print("Punti: ");
		System.out.println(punti);
		System.out.print("Punti Totali: ");
		System.out.println(puntiTot);
		System.out.print("Numero giro: ");
		System.out.println(cont);
		
		
				
		
		

	
	 
	 }
	 
	  while (cont<MAXGIO) ;
	  
	 


	}










}
