import java.util.Scanner;

public class area_circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el área de una circunferencia");
        System.out.println("Escriba el valor del radio del círculo");
        double radio = teclado.nextDouble();
        double pi = 3.1416;
        double area = pi * ( radio * radio );
        System.out.println("El área de la circunferencia es: " + area);
    }
}
