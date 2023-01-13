package EjemploClase;

public class Animal {
	String nombre;
	String raza;
	int edad;
	
	
	
	public Animal(String nombre, String raza, int edad) {
			this.nombre = nombre;
			this.raza = raza;
			this.edad = edad; 
	}


/*
	@Override
	public String toString() {
		return "nombre: "+nombre+"\nraza:"+raza+"\nedad: "+edad;
	}
*/
	
  void imprimir(){
	    System.out.println("nombre: "+ this.nombre);
		System.out.println("raza: "+this.raza);
		System.out.println("edAD: "+this.edad);
	
	//averiguar bien el uso del this

}
}//fin de la clase
