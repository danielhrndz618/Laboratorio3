import java.util.Scanner;
public class Ejercicio8 {
     public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int a, b ,c,x1,x2;
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextInt();
         System.out.println("Ingrese el valor de b: ");
        b  = entrada.nextInt();
         System.out.println("Ingrese el valor de c: ");
        c = entrada.nextInt();

        System.out.println("Para la forma: ax^2 + bx + c = 0");

        double b2 = Math.pow(b, 2);
        double op1;
        double multi4ac,total, total2, multia;
        multi4ac = (4*a*c);
        op1 = b2-multi4ac;

        double resultado = Math.sqrt(op1);
         System.out.println("La raiz es: "+resultado);
        multia  = a*2;
        total = (-(b)+(resultado))/multia;


        System.out.println("El valor para X1 es:  "+  total);
        total2 = (-(b)-(resultado))/multia;
         System.out.println("El valor para X2 es:  "+  total2);
    }
}

