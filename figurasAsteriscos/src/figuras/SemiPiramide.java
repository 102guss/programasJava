package figuras;

public class SemiPiramide {

	public SemiPiramide(int numero) {
		int i,j;
		
		for(j=0;j<numero;j++)
		{

			for(i=0; i<=j;i++)
			{
			
				System.out.print("*");
				
			}
		 	System.out.println();
		}
	}
	

}
