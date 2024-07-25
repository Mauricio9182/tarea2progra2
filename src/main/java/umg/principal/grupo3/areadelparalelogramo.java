package umg.principal.grupo3;
import java.util.Scanner;

public class areadelparalelogramo { public  void areaparalelo() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("ingrese la base del paralelogramo");
    double base = scanner.nextDouble();
    System.out.print("Ingrese la altura del paralelogramo: ");
    double altura = scanner.nextDouble();


    double area = base * altura;


    System.out.println("El área del paralelogramo es: " + area);


}
}
