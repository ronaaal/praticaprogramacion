import java.util.Scanner;

public class valor_hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el primer cateto");
        double cateto1 = teclado.nextDouble();
        System.out.println("Escriba el segundo cateto");
        double cateto2 = teclado.nextDouble();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
