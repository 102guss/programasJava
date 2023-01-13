package figuras;

public class Piramide {

	public Piramide(int numero) {
		int i,m,k;
		for(i=1; i<=numero;i++)
		{
			 for(m=1;m<=numero-i;m++)
			 System.out.print(" ");
			 for(k=1;k<=2*i-1;k++)
			 System.out.print("*");
			 System.out.println();
		}	
		
		
	
	}//fin del constructor
	

}
