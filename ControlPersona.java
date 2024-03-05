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
public class ControlPersona {
    /* Atributos */
    private int index = 0;  // Nos indica cuantas personas hay agregadas en la lista
    private int max = 10;   // Nos indica cual es el maximo de personas que pueden existir en la lista
    
    Persona[] listaPersonas = new Persona[max];
    
    /* Metodos */
    /**
     * Agregar a una persona a la lista
     * 
     * @param persona
     * @return 
     */
    public boolean agregarPersona(Persona persona) {
        if(index < max) {
            listaPersonas[index] = persona;
            index++;
            
            return true;
        }
        
        return false;
    }
    
    /**
     * Devuelve un string con la informacion de los atributos
     * de todas las personas que estan registradas o guardadas
     * en el arreglo
     * 
     * @return 
     */
    public String reporteGeneral() {
        String report = "";
        
        for(int i = 0; i < index; i++) {
            report += listaPersonas[i].toString() + "\n";
        }
        
        return report;
    }
    
    //----------- Metodos de eliminacion  
    
    /**
     * Eliminamos una persona de la lista y recorremos el resto
     * de personas para evitar que queden nulos ( o espacios ) 
     * al principio o en medio del arreglo
     * 
     * @param persona
     * @return 
     */
    public boolean eliminar(Persona persona) {
        for(int i = 0; i < index; i++) {
            if(persona.getNombre().equals(listaPersonas[i].getNombre())) {
                listaPersonas[i] = null;
                
                // recorrer el resto de elementos
                int j = i;
                for(; j < index; j++) {
                    if(j < max) {
                        listaPersonas[j] = listaPersonas[j+1];
                    }
                }
                listaPersonas[j] = null;
                index--;
                
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Eliminar a la persona de la lista por su
     * nombre
     */
    public boolean eliminar(String nombre) {
        for(int i = 0; i < index; i++) {
            if(nombre.equals(listaPersonas[i].getNombre())) {
                listaPersonas[i] = null;
                
                // recorrer el resto de elementos
                int j = i;
                for(; j < index; j++) {
                    if(j < max) {
                        listaPersonas[j] = listaPersonas[j+1];
                    }
                }
                listaPersonas[j] = null;
                index--;
                
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Eliminar a la persona mediante su id de la
     * lista
     */
    public boolean eliminar(int pointer) {
        if(pointer < index && pointer >= 0) {
            listaPersonas[pointer] = null;
            
            // recorrer el resto de elementos
            // para evitar nulos (o espacios)
            // en medio de la lista
            int j = pointer;
            for(; j < index; j++) {
                if(j < max) {
                    listaPersonas[j] = listaPersonas[j+1];
                }
            }
            listaPersonas[j] = null;
            index--;
                
            return true;
        }
        
        return false;
    }
    
    //----------- Diferentes metodos de busqueda espesifica
    /**
     * Obtenemos la informacion de una o mas personas
     * que tengan "x" nombre
     * 
     * @param nombre
     * @return 
     */
    public String buscarPorNombre(String nombre) {
        String report = "";
        
        for(int i = 0; i < index; i++) {
            if(nombre.equals(listaPersonas[i].getNombre())) {
                report += listaPersonas[i].toString() + "\n";
            }    
        }
        
        return report;
    }
    
    /**
     * Obtenemos la informacion de una o mas personas
     * que tengan "Y" apellido
     * 
     * @param apellido
     * @return 
     */
    public String buscarPorApellido(String apellido) {
        for(int i = 0; i < index; i++) {
            if(apellido.equals(listaPersonas[i].getApellido())) {
                return listaPersonas[i].toString();
            }    
        }
        
        return "";
    }
    
    /**
     * Obtenemos la informacion de una persona mediante
     * su posicion en la lista, si la posicion es mayor
     * al numero de personas o de elementos de la lista,
     * se devolvera un String vacio
     * 
     * @param pointer
     * @return 
     */
    public String buscarPorApuntador(int pointer) {
        if(pointer < index) {
            if(listaPersonas[pointer] != null) {
                return listaPersonas[pointer].toString();
            }
        }
        
        return "";
    }
}
