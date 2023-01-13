package basura;

import java.util.Scanner;

public class principal {
	
public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	
	System.out.println("programa que imprime datos del usuario mediate em létodo Scanner");
	String nombre;
	int edad;
	char sexo;
	double sueldo;
	
	System.out.println("Introduce tu nombre: ");
	nombre = x.nextLine();
	System.out.println("Introduce tu edad: ");
	edad = x.nextInt();
	System.out.println("Introduce tu sexo: ");
	sexo = x.next().charAt(0);
	System.out.println("Introduce tu sueldo: ");
	sueldo = x.nextDouble();
	
	//show dates 
	System.out.println("tu nombre es: "+nombre);
	System.out.println("tu edad es: "+edad);
	System.out.println("tu sexo es: "+sexo);
	System.out.println("tu sueldo es: "+sueldo);
	
}//end of the method main;


}//end of the class

