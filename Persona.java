package Unidad2.Practica2;

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
 * 4 DE MARZO DEL 2024
 * 
 */
public class Persona {
    /* Atributos */
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String direccion;
    private String email;
    private String fechaNacimiento;
    
    /**
     * Los siguientes atributos de tipo STATIC se utilizan mas
     * que nada para definir el genero de una persona, esto
     * esta pensado para utilizarse principalmente a la hora de
     * crear objetos y realizar comparaciones...
     */
    public static final char MALE = 'm';    // Hombre
    public static final char FEMALE = 'f';  // Mujer
    
    /* Metodos */
    // Metodo Constructor
    public Persona(String nombre, String apellido, int edad, char genero, String direccion, String email, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Restablecer el valor de los atributos
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) { this.apellido = apellido;}
    public void setEdad(int edad) { this.edad = edad; }
    public void setGenero(char genero) { this.genero = genero; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setEmail(String email) { this.email = email; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getNombre() { return nombre; }

    // Obtener el valor de los atributos atributos
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public char getGenero() { return genero; }
    public String getDireccion() { return direccion; }
    public String getEmail() { return email; }
    public String getFechaNacimiento() { return fechaNacimiento; }

    // Obtener atributos de en formato de texto
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", direccion=" + direccion + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
