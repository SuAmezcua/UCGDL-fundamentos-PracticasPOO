package Uno;
import java.util.Scanner;

public class PracticaDos {
	    public static void main(String[] args) {
	        double base = entradaBase();
	        double altura = entradaAltura();
	        double area = calcularArea(base, altura);
	        double perimetro = calcularPerimetro(base, altura);
	        salida(area, perimetro);
	    }

	    public static double entradaBase() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese la base del rectángulo:");
	        double base = sc.nextDouble();
	        return base;
	    }

	    public static double entradaAltura() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese la altura del rectángulo:");
	        double altura = sc.nextDouble();
	        return altura;
	    }

	    public static double calcularArea(double base, double altura) {
	        double area = base * altura;
	        return area;
	    }

	    public static double calcularPerimetro(double base, double altura) {
	        double perimetro = 2 * (base + altura);
	        return perimetro;
	    }

	    public static void salida(double area, double perimetro) {
	        System.out.println("El área del rectángulo es: " + area);
	        System.out.println("El perímetro del rectángulo es: " + perimetro);
	    }
	}

