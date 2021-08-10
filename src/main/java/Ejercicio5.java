import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double parti;
        double primerpar;
        double segundoparc;
        double examfinal;
        double total;
        System.out.println("Ingresa la calificación de participación sobre 10 puntos: ");
        parti= entrada.nextDouble();
        System.out.println("Ingresa la calificación de Primer Parcial sobre 25 puntos: ");
        primerpar= entrada.nextDouble();
        System.out.println("Ingresa la calificación de Segundo Parcial sobre 25 puntos: ");
        segundoparc= entrada.nextDouble();
        System.out.println("Ingresa la calificacion de Examen Final sobre 40 puntos: ");
        examfinal= entrada.nextDouble();
        
        total=parti + primerpar + segundoparc + examfinal;
        
        System.out.println("Ingrese la nota final sobre 100 puntos: " +total);
    }    
}
