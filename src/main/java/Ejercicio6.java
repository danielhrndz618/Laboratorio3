import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int a,b;
        
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextInt();
        
        double a1 = Math.pow(a,2);
        double b1 = Math.pow(b,2);
        System.out.println(a1 + "+" +("2("+"("+a+")"+"("+b+")"+")")+"+"+b1);
        double suma;
        suma = a1+(2*a*b)+b1;
        System.out.println("El total es de :" +suma);
    }
    


}
