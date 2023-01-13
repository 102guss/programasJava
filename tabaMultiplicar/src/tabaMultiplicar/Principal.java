package tabaMultiplicar;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		 int i=0,nume,resultado=0,j;
		 
		 System.out.println("Igrese un ro: ");
		 nume = x.nextInt();
		
		 for (j = nume; j<=10; j++) {
			 System.out.println();
	
		 for(i=1; i<=10; i++) {
			 
			resultado = nume*i;
			System.out.println(nume+"X"+i+"="+resultado);
			 
	     }//end 1 for
		 nume++;
		 }// end 2 for
		 
		 System.out.println("fin del programa");
}//end the main
	
	
}// end the class
