/**
 * 
 */
package Uno;

/**
 * @author lissu
 *
 */
import java.util.*;

public class Primerprograma { //Mi clase "primer programa" es publico

	/**
	 * @param args
	 */
	public static void main(String[] args) { //programa principal,
		// es el que hace que funcione mi programa
	System.out.println("Hola Mundo"); //función para imprimir
	Scanner leer = new Scanner (System.in); //función para leer
	int n; // tipo de dato entero
		n = leer.nextInt(); //lee mi tioo de dato
		for(int i=0; i<=n; i++) { //bucle inicia en 0 hasta n
			double r;
			r = Math.exp(Math.log(2)*i);
			System.out.println("%0.f"+r);
	
		}
		
	}

}
