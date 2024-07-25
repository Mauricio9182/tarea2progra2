package umg.principal.grupo2;
import java.util.Scanner;

public class areapiramide {
    public  void piramide (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");

        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;


        System.out.println("El área de la pirámide cuadrada es: " + area);

    }

}
