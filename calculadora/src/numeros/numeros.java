package numeros;

import java.util.Scanner;

public class numeros {
	
	//public String sel = null;

	public static void main(String[] args) {//inicio metodo main
		
		 Scanner ir = new Scanner(System.in);
		 
		 float a = 0; // o puede ser "double"
		 float b = 0;
		 //char opcion;
		 int opcion2;
	
		System.out.println("Selecciona una opcion: ");
		System.out.println("1- suma");
		System.out.println("2- resta");
		System.out.println("3- multiplicacion");
		System.out.println("4- divicion");
		
		//opcion = ir.next().charAt(0);
		opcion2 = ir.nextInt();
		
		switch (opcion2) {
		case 1:
			System.out.println("Usted a escogido la suma");
			System.out.println("Ingresa el prier numero: ");
			a = ir.nextFloat();
			
			System.out.println("Selecciona el seguno umero: ");
			b = ir.nextFloat();

			System.out.println("La suma es: "+(a+b));
			
			break;
			
		case 2:
			System.out.println("Usted escogio la resta");
			System.out.println("Ingresa el prier numero: ");
			a = ir.nextFloat();
			
			System.out.println("Selecciona el seguno umero: ");
			b = ir.nextFloat();
			
			System.out.println("La resta es: "+ (a-b));
			
			break;
			
		case 3:	
			System.out.println("Usted ha escogido multiplicacion");
			System.out.println("Ingresa el prier numero: ");
			a = ir.nextFloat();
			
			System.out.println("Selecciona el seguno umero: ");
			b = ir.nextFloat();
			
			System.out.println("La multiplicacion es: "+(a*b));
		
			
			break;
			
		case 4:
			System.out.println("Usted ha escogido la division");
			System.out.println("Ingresa el prier numero: ");
			a = ir.nextFloat();
			
			System.out.println("Selecciona el seguno umero: ");
			b = ir.nextFloat();
			
			if ( b != 0) {
			
			System.out.println("La division es: "+(a/b));
			}
			
			else {
			System.out.println("No se puede dividir entre cero");
			}
			
			break;

		default: System.out.println("opcion no valida");
			break;
		}
	

	}// fin clase main

	

}// fin clase numeros


