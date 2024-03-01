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
public class Alumno {
    /* Atributos */
    private String nombre;
    private String apellido;
    private char genero;
    private String carrera;
    private byte semestre;
    private int promedio;
    
    // atributos de genero
    public final static char MALE = 'm';
    public final static char FEMALE = 'f';
    
    /* Metodos */
    // Metodo constructor
    public Alumno(String nombre, String apellido, char genero, String carrera, byte semestre, int promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }
    
    // Obtener atributos
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public char getGenero() { return genero; }
    public String getCarrera() { return carrera; }
    public byte getSemestre() { return semestre; }
    public int getPromedio() { return promedio; }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", carrera=" + carrera + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    // Restablecer atributos
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setGenero(char genero) { this.genero = genero; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public void setSemestre(byte semestre) { this.semestre = semestre; }
    public void setPromedio(int promedio) { this.promedio = promedio; }
    
}
