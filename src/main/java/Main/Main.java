package Main;

import Helper.MiHelper;

import java.util.Scanner;

/**
 * @author Yasar
 */
public class Main {
    public static void main(String... param) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        do {
            System.out.println("\nCarga y Consulta de Alumnos...");
            System.out.println("1. Cargar Alumnos");
            System.out.println("2. Consultar Alumnos");
            System.out.println("3. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Nombre:");
                    String nombre = leer.next().trim();
                    System.out.println("Ingrese el Grupo");
                    String grupo = leer.next().trim();
                    MiHelper.cargarAlumnos(nombre, grupo);
                    break;

                case 2:
                    MiHelper.consultarAlumnos();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);

    }

}