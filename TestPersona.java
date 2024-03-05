package Unidad2.Practica2;

import java.util.Scanner;

/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * Alumno: Diego Jesus Muñoz Andrade
 * Grupo: 2C
 * 
 * EQUIPO:
 *  - Diego Jesus Munoz Andrade
 *  - 
 *  - 
 * 
 * MENCION HONORIFICA:
 *  - Juan Luis Zalazar
 * 
 * 5 DE MARZO DEL 2024
 * 
 */
public class TestPersona {
    // Funciones //
    public static void lines() {
        System.out.println("------------------------------------------------------------");
    }
    
    // Metodo main //
    public static void main(String[] args) {
        /* Variables */
        ControlPersona control = new ControlPersona();
        Scanner in = new Scanner(System.in);
        
        // Las siguientes variables son para inicializar
        // el objeto y para agregarlo a la lista
        // Muchas variables
        String nombre;
        String apellido;
        int edad;
        char genero;
        String direccion;
        String email;
        String fechaNacimiento;
        
        CFecha fecha = new CFecha();
        
        int opc = 0;
        
        /* MainLoop */
        do {
            // Menu principal
            lines();
            System.out.println("[1] Agregar una persona a la lista");
            System.out.println("[2] Obtener informacion de todas las personas");
            System.out.println("[3] Buscar una persona");
            System.out.println("[4] Eliminar una persona de la lista");
            System.out.println("[5] Salir");
            
            System.out.print("Opcion C:>");
            opc = in.nextInt();
            lines();
            
            // Evaluar la opcion
            switch(opc) {
                // Agregar una persona a la lista
                case 1:
                    System.out.println("AGREGAR PERSONA \n");
                    System.out.print("Ingrese el nombre: "); nombre = in.next();
                    System.out.print("Ingrese el apellido: "); apellido = in.next();
                    System.out.print("Ingrese la edad: "); edad = in.nextInt();
                    System.out.print("Ingrese el genero <m: masculino | f: femenino>: "); genero = in.next().charAt(0);
                    System.out.print("Ingrese la direccion: "); direccion = in.next();
                    System.out.print("Ingrese el e-mail: "); email = in.next();
                    System.out.print("Ingrese la fecha de nacimiento: ");
                    
                    do{
                        int d, m, a;
                        
                        System.out.print("\nIngrese el dia: ");
                        d = in.nextInt();
                        System.out.print("\nIngrese el mes: ");
                        m = in.nextInt();
                        System.out.print("\nIngrese el a;#o: ");
                        a = in.nextInt();
                        
                        fecha.asignarFecha(d, m, a);
                        
                    }while(fecha.fechaCorrecta());
                    
                    // Inizializar objeto y agregarlo a la lista
                    Persona persona = new Persona(nombre, apellido, edad, genero, direccion, email, fecha.obtenerFecha());
                    
                    control.agregarPersona(persona);
                    
                    break;
                    
                    
                // Obtener toda la informacion
                case 2:
                    System.out.println("REPORTE GENERAL");
                    System.out.println(control.reporteGeneral());
                    
                    break;
                    
                // Buscar personas
                case 3:
                    System.out.println("BUSQUEDA");
                    System.out.print("Ingrese el nombre de la persona a buscar: ");
                    nombre = in.next();
                    
                    System.out.println(control.buscarPorNombre(nombre));
                    
                    break;
                    
                // Eliminar a una persona
                case 4:
                    System.out.println("ELIMINAR PERSONA");
                    System.out.print("Ingrese el nombre de la persona a eliminar: ");
                    nombre = in.next();
                    
                    if(control.eliminar(nombre)) {
                        System.out.println(nombre+" ha sido eliminado de la lista.");
                    }else {
                        System.out.println(nombre+" no ha podido ser eliminado de la lista. Intentre de nuevo por favor.");
                    }
                    
                    break;
                    
                // Salida
                case 5:
                    System.out.println("Adios ;)");
                    break;
                    
                default:
                    System.out.println("Error: la opcion no esta disponible o no se ha encontrado");
                    break;
            }
        }while(opc != 5);
    }
}