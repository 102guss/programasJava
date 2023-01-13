package figuras;

import java.util.Scanner;

public class Datos {


	public int solicidarDatos() {
		
		int n;
		
		Scanner x = new Scanner(System.in);
		System.out.println("ingrese el numerito de lineas de la figura: ");
		n = x.nextInt();
		
		return n;
	}
	
	
}//fin de la clase
