package para;
import java.util.Scanner;
public class para {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		String d=" ";
		int c;
		for (c=0; !d.equals("fin");c++) {
			System.out.println("El programa finaliza hasta que se escriba la palabara fin...");
			System.out.println("Ingrese la palabra: ");
			d=Leer.next();
		}
		System.out.println("El número de palabras ingresadas es: "+c);
	}

}
