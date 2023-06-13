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
            System.out.println("3. Eliminar Alumno");
            System.out.println("4. Salir");

            try {
                opcion = leer.nextInt();
            }catch (Exception e){
                System.out.println("Opcion no valida");
                opcion = 0;
                leer.next();
                continue;
            }

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
                    System.out.println("Ingrese la ID del Alumno a Eliminar");
                    String idEliminar = leer.next().trim();
                    MiHelper.eliminarAlumno(idEliminar);
                    break;

                case 4:
                    System.out.println("Saliendo...");

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);

    }

}