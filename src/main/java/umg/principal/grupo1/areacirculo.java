package umg.principal.grupo1;
import java.util.Scanner;


public class areacirculo {
    public void calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * radio * radio;

        System.out.println("El área del círculo con radio " + radio + " es: " + area);


    }
}
