package figuras;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,m;
		Datos datos = new Datos();
		/*
		System.out.println("Esta figura imprimira un cuadrado ");
		x = datos.solicidarDatos();
		
		Cuadrado cuadrado = new Cuadrado();//constructor vació del cuadrdo
		cuadrado.imprime_cuadrado(x);
		System.out.println();
		System.out.println("Esta figura imprimira un marco cuadrado ");
		y = datos.solicidarDatos();
		MarcoC marcoC = new MarcoC();//creacion de objetoMarcoCuadrado
		marcoC.imprimeMarco(y);
		*/
		System.out.println("Esta figura imprimirá un marco cuadardo");
		System.out.println();
		z = datos.solicidarDatos();
		MarcoCuadrado2 marco2 = new MarcoCuadrado2();
		marco2.mostrar(z);
		
		System.out.println();
		System.out.println("esta figura será una semi pirámide");
		m = datos.solicidarDatos();
		SemiPiramide semiPiramide = new SemiPiramide(m);//utilizamos solamente el 
		System.out.println();
		System.out.println("esta figura será una pirámide");
		Piramide piramide = new Piramide(m);
		
	
	}

}
