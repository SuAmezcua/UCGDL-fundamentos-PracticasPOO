package Uno;
import java.util.Scanner;

public class DiaDelAnio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 365: ");
        int diaDelAnio = entrada.nextInt();
        
        if (diaDelAnio < 1 || diaDelAnio > 365) {
            System.out.println("Entrada inválida. Por favor ingrese un número entre 1 y 365.");
        } else {
            int dia = 1;
            int mes = 1;
            while (diaDelAnio > 0) {
                int diasEnMes = getDiasEnMes(mes);
                if (diaDelAnio <= diasEnMes) {
                    String sufijoDia = getSufijoDia(diaDelAnio);
                    String nombreMes = getNombreMes(mes);
                    System.out.printf("%d%s día de %s\n", dia, sufijoDia, nombreMes);
                    break;
                } else {
                    diaDelAnio -= diasEnMes;
                    mes++;
                    dia = 1;
                }
            }
        }
    }
    
    private static int getDiasEnMes(int mes) {
        switch (mes) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    private static String getSufijoDia(int dia) {
        if (dia >= 11 && dia <= 13) {
            return "th";
        }
        switch (dia % 10) {
            case 1:
                return "primero";
            case 2:
                return "segundo";
            case 3:
                return "tercero";
            default:
                return "th";
        }
    }
    
    private static String getNombreMes(int mes) {
        switch (mes) {
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "noviembre";
            default:
                return "diciembre";
        }
    }
}
