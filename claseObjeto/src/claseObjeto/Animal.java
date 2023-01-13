package claseObjeto;

public class Animal {
	
	String nombre;
	int peso;
	String raza;
	
	public Animal(String nombre, int peso, String raza) {
		this.nombre = nombre; //se le pone el "this" pa no confundirse y hacer referencia a los atributos de la clase 
		this.peso = peso;
		this.raza = raza;
		
		
	}// end constructor
	

public static void main(String[] args) {
	
	Animal animal1 = new Animal("pelusa",22,"maltes");
	System.out.println("Los datos del primer animal son: "+"\nnombre: "+animal1.nombre+"\npeso: "+animal1.peso+"\nraza: "+animal1.raza);
	
	//creando otro objeto
	Animal animal2;
	animal2 = new Animal("Scrapi",3,"coquer");
	System.out.println("\nLos datos del primer animal son: "+"\nnombre: "+animal2.nombre+"\npeso: "+animal2.peso+"\nraza: "+animal2.raza);
	
	
	
}//end the method main	
	//el siguiente ejemplo será lo mismo pero importando la clase por separado
    // veremos el uso del método this
	

}// end class animal
