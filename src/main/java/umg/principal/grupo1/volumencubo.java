package umg.principal.grupo1;
import java.util.Scanner;

public class volumencubo {
    public void calcularVolumen() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la arista del cubo: ");
        double arista = scanner.nextDouble();

        // Calcular el volumen del cubo
        double volumen = Math.pow(arista, 3);

        System.out.println("El volumen del cubo con arista de longitud " + arista + " es: " + volumen);


    }
}
