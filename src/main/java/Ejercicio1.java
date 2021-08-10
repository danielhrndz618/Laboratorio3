
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int num1,num2,num3,suma;
        System.out.println("Ingrese el primer numero: ");
        Scanner a = new Scanner(System.in);
        num1 = a.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        Scanner b = new Scanner(System.in);
        num2 = b.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        Scanner c = new Scanner(System.in);
        num3 = c.nextInt();
        
        suma = num1+num2+num3;
        System.out.println("La suma total de las notas es: "+ suma); 
    }
}
