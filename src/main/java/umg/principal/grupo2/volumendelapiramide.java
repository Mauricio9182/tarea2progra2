package umg.principal.grupo2;
import java.util.Scanner;

public class volumendelapiramide {
    public  void volumen( ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();


        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        double volumen = (base * base * altura) / 3;

        System.out.println("El volumen de la pirámide cuadrada es: " + volumen);


    }
}
