package src;

import java.util.Scanner;

/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * Alumno: Diego Jesus Muñoz Andrade
 * Grupo: 2C
 * 
 * EQUIPO:
 *  -
 *  -
 * 
 * 29 DE FEBRERO DEL 2024
 * 
 */
public class TestAlumno {
    // Metodo main //
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        ControlAlumno control = new ControlAlumno();

        int opc = 0;

        String nombre;    // parametros para el alumno
        String apellido;
        char genero;
        String carrera;
        byte semestre;
        int promedio;

        // main loop
        do {
            // Menu principal
            menu();

            lines();
            System.out.print("Opcion: ");
            opc = in.nextInt();
            
            clear();

            switch(opc) {
                case 1:
                    // Agregar alumno
                    lines();
                    System.out.println("AGREGAR ALUMNO");
                    lines();

                    System.out.print("Nombre: ");       // pedir datos del alumno
                    nombre = in.next();
                    System.out.print("Apellido: ");
                    apellido = in.next();
                    System.out.print("Genero (m/f): ");
                    genero = in.next().charAt(0);
                    System.out.print("Carrera: ");
                    carrera = in.next();
                    System.out.print("Semestre: ");
                    semestre = in.nextByte();
                    System.out.print("Promedio: ");
                    promedio = in.nextInt();

                    lines();

                    // agregar alumno a la lista
                    Alumno al = new Alumno(nombre, apellido, genero, carrera, semestre, promedio);

                    if(control.altaAlumno(al) == true) {
                        System.out.println("Alumno agregado correctamente");
                        delay();
                        break;
                    }
                    System.out.println("No se pudo agregar el alumno");
                    delay(1500);
                    break;

                case 2:
                    // Reporte general de alumnos
                    lines();
                    System.out.println("REPORTE GENERAL DE ALUMNOS");
                    lines();

                    System.out.println(control.reporteGeneralAlumnos());
                    delay(3000);
                    break;

                case 3:
                    // Reporte de alumnos con promedio excelente
                    lines();
                    System.out.println("REPORTE DE ALUMNOS CON PROMEDIO EXCELENTE");
                    lines();

                    System.out.println(control.reporteAlumnosExcelentes());
                    delay(2000);
                    break;

                case 4:
                    // Reporte de alumnos con promedio regular
                    lines();
                    System.out.println("REPORTE DE ALUMNOS CON PROMEDIO REGULAR");
                    lines();

                    System.out.println(control.reporteAlumnosRegulares());
                    delay(2000);
                    break;

                case 5:
                    // Reporte de las alumnas
                    lines();
                    System.out.println("REPORTE DE LAS ALUMNAS");
                    lines();

                    System.out.println(control.reportePorAlumnas());
                    delay(2000);
                    break;
                case 6:
                    // Reporte de los alumnos
                    lines();
                    System.out.println("REPORTE DE LOS ALUMNOS");
                    lines();

                    System.out.println(control.reportePorAlumnos());
                    delay(2000);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    delay(400);
                    break;

                default:
                    System.out.println("Opcion invalida");
                    delay();
                    break;
            }

            clear();
        } while(opc != 7);
    }

    // Funciones //
    public static void lines() {
        System.out.println("--------------------------------------------------");
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menu() {
        lines();
        System.out.println("MENU PRINCIPAL");
        lines();
        System.out.println("1. Agregar alumno");
        System.out.println("2. Reporte general de alumnos");
        System.out.println("3. Reporte de alumnos con promedio excelente");
        System.out.println("4. Reporte de alumnos con promedio regular");
        System.out.println("5. Reporte de las alumnas");
        System.out.println("6. Reporte de los alumnos");
        System.out.println("7. Salir");
    }

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void delay() {
        delay(1000);
    }
}
