
package arbolnario;

/**
 * Esta clase implementa los Nodos que componen un arbol N-ario
 * @author Felipe Cadavid y Carolina Diaz
 * @version 1.0
 * @since 07-10-2017
 */
public class Nodo {
    
    private int sw;
    private char dato;
    private Nodo liga;
    private Nodo lDato;
    

    /**
     * Crea un nodo para una arbol n-ario 
     * @param dato Recibe el dato del nodo
     */
    public Nodo(char dato) {
        this.sw = 0;
        this.dato = dato;
    }
    
    /**
     * Devuelve 0 si el campo de dato contiene un char
     * Devuelve 1 si el campo de dato tiene hijos/subarbol
     * @return tipo de dato int
     */
    public int getSw() {
        return sw;
    }

    /**
     * Permite asignar 0 si el campo de dato contiene un char
     * Permite asignar 1 si el campo de dato tiene hijos/subarbol
     * @param sw Recibe un tipo de dato byte 0 o 1
     */
    public void setSw(int sw) {
        this.sw = sw;
    }

    /**
     * Devuelve el dato que está almacenado en el nodo
     * @return tipo de dato Char
     */
    public char getDato() {
        return dato;
    }

    /**
     * Permite asignar/modificar el dato del nodo
     * @param dato Recibe el átomo de la hilera
     */
    public void setDato(char dato) {
        this.dato = dato;
    }

    /**
     * Devuelve la liga del nodo
     * @return tio de dato Nodo
     */
    public Nodo getLiga() {
        return liga;
    }

    /**
     * Modifica y asigna la liga del nodo
     * @param liga Recibe 
     */
    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public Nodo getlDato() {
        return lDato;
    }

    public void setlDato(Nodo lDato) {
        this.lDato = lDato;
    }
    
    
    
    
}
