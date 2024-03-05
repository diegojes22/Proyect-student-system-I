package Unidad2.Practica2;

/**
 * INSTITUTO TECNOLOGICO DE LA PIEDAD
 * Alumno: Diego Jesus Muñoz Andrade
 * Grupo: 2C
 * 
 * 5 DE MARZO DEL 2024
 * 
 * Actividad:
 * Practica sobre el modificador de acceso
 * protegido objetos para la unidad 2.
 */
public class CFecha {
    /* Atributos */
    private int dia, mes, año;
    
    /* Metodos */
    protected boolean bisiesto() {
        return ( ((año % 4) == 0) && ((año %100) != 0) || ((año % 400) == 0) );
    }
    
    public void asignarFecha(int dd, int mm, int aaaa) {
        dia = dd;
        mes = mm;
        año = aaaa;
    }
    
    public void obtenerFecha(int[] fecha) {
        fecha[0] = dia;
        fecha[1] = mes;
        fecha[2] = año;
    }
    
    public String obtenerFecha() {
        return dia + "/" + mes + "/" + año;
    }
    
    public boolean fechaCorrecta() {
        boolean dia_correcto = false, mes_correcto = false, año_correcto = false;
        
        año_correcto = ( año >= 2000 && año <= 2024 ); // Nota: el intervalo original es de 2000 a 2005
        
        mes_correcto = (mes >= 1 && mes <= 12);
        
        switch(mes) {
            // Febrero
            case 2:
                if(bisiesto()) dia_correcto = (dia >= 1 && dia <= 29);
                else dia_correcto = (dia >= 1 && dia <= 28);
                break;
            
            // Meses con 3 dias
            case 4: case 6: case 9: case 11:
                dia_correcto = ( dia >= 1 && dia <= 30);
                break;
                
            case 1: case 3: case 5: case 7: case 8: case 12:
                dia_correcto = ( dia >= 1 && dia <= 31);
                break;
        }
        
        return dia_correcto && mes_correcto && año_correcto;
    }
    
    public static void vizualizarFecha(CFecha f) {
        int[] array = new int[3];
        f.obtenerFecha(array);
        
        System.out.println(array[0]+"/"+array[1]+"/"+array[2]);
    }
}

