
package figuras;


public class MarcoC {
	
public void imprimeMarco(int numero){


		for (int j = 1; j <=numero; j++) {
			System.out.print(" *");//forma una linea de 5 columnas
		}
		
		
		
		for (int k = 1; k <=numero-2; k++) {// se va a repetir 3 veces en filas
		System.out.println();
		System.out.print(" *");
		for (int i = 1; i <=numero-2; i++) {//se repite 4 veces en columnas
			System.out.print("  ");
		}
		System.out.print(" *");
	
		}
		
		
		System.out.println();
		
		for (int j = 1; j <=numero; j++) {//linea de 5 columnas
			System.out.print(" *");
		}
}//fin del método



}// end class circulo
