import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double comi;
        int canticarro;
        double tmontocarro;
        double saldototal;
        double porcentaje;
        
        System.out.println("Ingrese la cantidad de carros vendidos: ");
        canticarro = entrada.nextInt();
        System.out.println("Ingrese El monto total de carros vendido: ");
        tmontocarro = entrada.nextDouble();
        
        comi= 150 * canticarro;
        porcentaje = (tmontocarro * 5)/100;
        saldototal = 1000 + comi +porcentaje;
        
        System.out.println("El salario total mensual es: "+saldototal);
    }
}
