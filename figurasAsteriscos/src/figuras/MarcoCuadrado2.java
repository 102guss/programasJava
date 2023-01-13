package figuras;

public class MarcoCuadrado2 {
	
	public void mostrar(int n){
		for (int j = 1; j <=n ; j++) {
			
			for (int i = 1; i <=n; i++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print(" *");
					
				}
				else {
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
		
	}//fin del metodo
	
	
}//fin de clase
