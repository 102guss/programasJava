package arregloscomun;

import java.util.Scanner;
public class ArreglosComun {

    public static void main(String[] args) {

        int array1[] = new int[5];
        int array2[] = new int[5];
        int C[] = new int[10];

        Scanner SC = new Scanner(System.in);
        //Rellenar el arreglo A.
        System.out.println("Ingresar dato a arreglo A");
        for (int i = 0; i < 5; i++) {

            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            array1[i] = SC.nextInt();
        }

        System.out.println("\n");

        System.out.println("Ingresar dato a arreglo B");
        for (int i = 0; i < 5; i++) {

            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            array2[i] = SC.nextInt();
        }
        
        
        System.out.println("\n");
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.println("Elemento común: " + array1[i]);
                }
            }
        }
        }//hasta aqui abarca el main//hasta aqui abarca el main
   
    }


