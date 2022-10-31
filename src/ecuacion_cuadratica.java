import java.util.Scanner;

public class ecuacion_cuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer coeficiente: ");
        double a = teclado.nextDouble();
        System.out.println("Escribe el segundo coeficiente");
        double b = teclado.nextDouble();
        System.out.println("Escribe el tercer coeficiente");
        double c = teclado.nextDouble();
        double x;
        double x1 = 0;
        double x2 = 0;
        x = (Math.pow(b,2))-4*a*c;
        if (x<0) { //Usamos el comando if por si el resultado de x es menor a 0, así no nos da error.
            System.out.println("No es válido");
        }
        else {
            x1 = (-b+Math.sqrt(x))/(2*a);
            x2 = (-b-Math.sqrt(x))/(2*a);
        }
        System.out.println("Valor de x1 es igual a: " + x1);
        System.out.println("Valor de x2 es igual a: " + x2);
    }
}
