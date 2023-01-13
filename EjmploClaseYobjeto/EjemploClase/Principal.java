package EjemploClase;

public class Principal {
	
	public static void main(String[] args) {
		
	Animal animal1 = new Animal("scarpy", "coquer", 45);
	Animal animal2 = new Animal("capuchino", "electrico", 3);
	
	/*
	Animal animal2;
	
	animal2 = new Animal("capuchino", "electrico", 48);
	*/
	
	/*
	
	System.out.println("nombre: "+ animal1.nombre);
	System.out.println("raza: "+animal1.raza);
	System.out.println("edAD: "+animal1.edad);
	System.out.println();	
	System.out.println("nombre: "+ animal2.nombre);
	System.out.println("raza: "+animal2.raza);
	System.out.println("edAD: "+animal2.edad);
	*/
	
	//ahora usaremos el método to 

	/*
	System.out.println(animal1);
	System.out.println();
	//creando un segundo objeto
	Animal animal2 = new Animal("capuchino", "electrico", 3);
	System.out.println(animal2);
	
	*/
	
	//con el método tostring es más facil imprimir caractaeristicas sin tanto desmadre
	//de mandar llmar atribuhto por atributo del constructor
	
	//mandando llamar el método q hemos creado (nuestro propio método para imprimir
	animal1.imprimir();
	System.out.println();
	animal2.imprimir();
	
	//nota!! repasar los tipos de métodos en java
	
		
	}// end method ;


}//fin class principal

