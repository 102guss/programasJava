package ejemploObjeto;

import java.util.Scanner;

public class claseScanner {
	

	
	
public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	int edad;
	char sexo;
	String nombre;
	float sueldo;
	
	System.out.println("Ingesa tu nombre");
	nombre
	= 
	x.nextLine();
	System.out.println("ingresa tu ead");
	edad = x.nextInt();
	System.out.println("Ingresa tu sexo");
	sexo = x.next().charAt(0);
	System.out.println("Ingesa tu sueldo");
	sueldo = x.nextFloat();
	
	
	System.out.println("Tu nombre es: "+nombre);
	System.out.println("tu edad es: "+edad);
	System.out.println("tu sexo es: "+sexo);
	System.out.println("tu sueldo es: "+sueldo);
	
}// end the class main
	

}//fin clase Scanner
