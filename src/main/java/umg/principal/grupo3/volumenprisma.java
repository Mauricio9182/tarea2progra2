package umg.principal.grupo3;
import java.util.Scanner;

public class volumenprisma {
    public  void prisma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base del prisma: ");
        double longitudBase = scanner.nextDouble();
        System.out.print("Ingrese el ancho de la base del prisma: ");
        double anchoBase = scanner.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        double altura = scanner.nextDouble();

        double areaBase = longitudBase * anchoBase;

        double volumen = areaBase * altura;
        System.out.println("El volumen del prisma rectangular es: " + volumen);



    }
}
