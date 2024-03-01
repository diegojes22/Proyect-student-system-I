package src;

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
public class ControlAlumno {
    /* Atributos */
    private int max = 10;
    private int index = 0;
    
    Alumno[] list = new Alumno[max]; // aqui se guardaran los alumnos
    
    /* Metodos */
    // Agregar un alumno a la lista
    public boolean altaAlumno(Alumno alumno) {
        if(index < max) {
            list[index] = alumno;
            index++;
            
            return true;
        }
        
        return false;
    }
    
    // Reporte general de los alumnos
    public String reporteGeneralAlumnos() {
        String text = "";
        
        for(int i = 0; i < index; i++) {
            text += list[i].toString() + "\n";
        }
        
        return text;
    }
    
    // Reporte de alumnos con promedio excelente
    public String reporteAlumnosExcelentes() {
        String text = "";
        
        for(int i = 0; i < index; i++) {
            if(list[i].getPromedio() > 90) {
                text += list[i].toString() + "\n";
            }
        }
        
        return text;
    }

    // Reporte de alumnos con promedio regular
    public String reporteAlumnosRegulares() {
        String text = "";
        
        for(int i = 0; i < index; i++) {
            if(list[i].getPromedio() >= 70 && list[i].getPromedio() <= 90) {
                text += list[i].toString() + "\n";
            }
        }
        
        return text;
    }

    // Reporte de alumnos reprobados
    public String reporteAlumnosReprobados() {
        String text = "";
        
        for(int i = 0; i < index; i++) {
            if(list[i].getPromedio() < 70) {
                text += list[i].toString() + "\n";
            }
        }
        
        return text;
    }

    // Reporte de las alumnas
    public String reportePorAlumnas() {
        String text = "";
        
        for(int i = 0; i < index; i++) {
            if(list[i].getGenero() == Alumno.FEMALE) {
                text += list[i].toString() + "\n";
            }
        }

        return text;
    }

    // Reporte de los alumnos
    public String reportePorAlumnos() {
        String text = "";
        
        for(int i = 0; i < index; i++) {
            if(list[i].getGenero() == Alumno.MALE) {
                text += list[i].toString() + "\n";
            }
        }

        return text;
    }
    
    // Busqueda de un alumno espesifico
    // Buscar solo por nombre
    public String buscarAlumno(String nombre) {
        for(int i = 0; i < index; i++) {
            if(nombre.equals( list[i].getNombre() )) {
                return list[i].toString() + "\n";
            }
        }
        
        return "";
    }
    
    // buscar por nombre y apellido
    public String buscarAlumno(String nombre, String apellido) {
        for(int i = 0; i < index; i++) {
            if(nombre.equals( list[i].getNombre() ) && apellido.equals(list[i].getApellido())) {
                return list[i].toString() + "\n";
            }
        }
        
        return "";
    }
}
