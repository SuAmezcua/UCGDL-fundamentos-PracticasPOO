package Uno;
import java.util.Scanner;
public class AreasRectángulo {
	public static void main(String[] args) {
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese ancho del rectángulo");
		double a=sc.nextDouble();
		System.out.println("ingrese alto del rectángulo");
		double b=sc.nextDouble();
		area=a*b;
		System.out.println(area);
	}

}
