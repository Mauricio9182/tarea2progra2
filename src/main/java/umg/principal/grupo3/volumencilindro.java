package umg.principal.grupo3;
import java.util.Scanner;

public class volumencilindro {
    public  void cilindro() {
        Scanner scanner = new Scanner(System.in);

        final double PI = Math.PI;

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = PI * Math.pow(radio, 3) * altura;

        System.out.println("El volumen del cilindro es: " + volumen);


    }
}
