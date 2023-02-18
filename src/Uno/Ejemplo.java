/**

/**
 * @author lissu
 * 
 */
package Uno;

import java.util.*;

public class Ejemplo {
	
	/**
	 * @param args
	 */
	
	void mientras () { //inicio
		int i=1;
		while (i<=90) { //inicio de la estructura mientras
			System.out.println("valores de i "+i);
			i=i/5-i*i*(i/i+2);
		} //fin del mientras
		System.out.println("Nuevos Valores de i: "+i);
	} //fin

	void si() {
		//int a=1, b=2, c=3;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame un valor del 1 al 7");
		int lee = leer.nextInt();
		
		if (lee==1) {
			System.out.println("Domingo");
		}
		else if (lee==2) {
			System.out.println("Lunes");
		}
		else if (lee==3) {
			System.out.println("Martes");
		}
		else if (lee>3&&lee<8){
			System.out.println("otro dia de la semana");
		}
		else {
			System.out.println("No existe");
		}
		leer.close(); //cerrar mi funcion
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejemplo a = new Ejemplo ();
		a.mientras();
		a.si();

	}

}
