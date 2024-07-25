package umg.principal;
import  java.util.Scanner;
import umg.principal.grupo1.areacirculo;
import umg.principal.grupo1.circunferenciacirculo;
import umg.principal.grupo1.volumencubo;
import umg.principal.grupo2.areapiramide;
import umg.principal.grupo2.areatriangulo;
import umg.principal.grupo2.volumendelapiramide;
import umg.principal.grupo3.areadelparalelogramo;
import umg.principal.grupo3.volumencilindro;
import umg.principal.grupo3.volumenprisma;

public class Main {
    public static void main(String[] args) {
        areacirculo areaCirculo = new areacirculo();
        circunferenciacirculo circuferenciaCirculo = new circunferenciacirculo();
        volumencubo volumenCubo = new volumencubo();
        areapiramide Area = new areapiramide();
        areatriangulo Base = new areatriangulo();
        volumendelapiramide Como = new volumendelapiramide();
        areadelparalelogramo para = new areadelparalelogramo();
        volumencilindro cili= new volumencilindro();
        volumenprisma pris = new volumenprisma();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenu();


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1: Calcular área de un círculo.");
                    areaCirculo.calcularAreaCirculo();

                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2: Calcular circunferencia de un círculo.");
                    circuferenciaCirculo.calcularCircunferencia();

                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3: Calcular volumen de un cubo.");
                    volumenCubo.calcularVolumen();

                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción 4: Calcular el area de una piramide cuadrada.");
                    Area.piramide();
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción 5:Calcular area de un triangulo .");
                    Base.triangulo();
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opción 6:Calcular volumen de una piramide cuadrada .");
                    Como.volumen();
                    break;
                case 7:
                    System.out.println("Ha seleccionado la opción 7:Calcular area de un paralelogramo .");
                    para.areaparalelo();
                    break;
                case 8:
                    System.out.println("Ha seleccionado la opción 8:Calcular volumen de un cilindro .");
                    cili.cilindro();
                    break;
                case 9:
                    System.out.println("Ha seleccionado la opción 9:Calcular volumeNde un prisma .");
                    pris.prisma();
                    break;

                default:
                    System.out.println("Opción no válida. Por favor ingrese un número del 1 al 9.");
            }

            if (opcion != 0) {
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
        } while(opcion !=0);

        scanner.close();
        System.out.println("Fin del programa ");




    }





    private static void mostrarMenu() {
        System.out.println("Hola este es mi menu ");
        System.out.println("Seleccione una opción del 0 al 9:");
        System.out.println("1. Calcular área de un círculo");
        System.out.println("2. Calcular circunferencia de un círculo");
        System.out.println("3. Calcular volumen de un cubo");
        System.out.println("4. Calcular area de una piramide cuadrada.");
        System.out.println("5. Calcular area de un triangulo.");
        System.out.println("6. Calcular volumen de una piramide cuadrada.");
        System.out.println("7. Calcular area de un paralelogramo.");
        System.out.println("8. Calcular volumen de un cilindro.");
        System.out.println("9. Calcular volumen de un prisma");
        System.out.println("0. Salir del programa, adios");
        System.out.print("Ingrese su opción: ");
    }



}
