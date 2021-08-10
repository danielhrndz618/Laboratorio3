import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int horas,dias,dias2,semanas,hora;
        System.out.println("Ingrese el numero de horas: ");
        horas = entrada.nextInt();
        
        dias = horas/24;
        semanas = dias/7;
        dias2 = (dias - (semanas*7));
        hora = horas - (((semanas * 7)*24)+ (dias2 * 24));
        
        System.out.println("Hay "+semanas+ " Semanas con " +dias2+ " Dias y " +hora+ " Horas.");    
    }
}
