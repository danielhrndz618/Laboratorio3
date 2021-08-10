import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        float rodrigo;
        float andrea;
        float esteban;
        
        System.out.println("Ingrese los dolares que tiene rodrigo: ");
        rodrigo = entrada.nextFloat();
        
        andrea = rodrigo/2;
        esteban=(rodrigo + andrea)/2;
        
        System.out.println("Rodrigo tiene" +rodrigo +"dolares");
        System.out.println("Andrea tiene" +andrea +"dolares");
        System.out.println("Esteban tiene" +esteban + "dolares");    
    }
}
