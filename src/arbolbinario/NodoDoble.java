package arbolbinario;

/**
 * Esta clase implementa los Nodos que componen un arbol binario
 * @author Felipe Cadavid y Carolina Diaz
 * @version 1.0
 * @since 07-10-2017
 */
public class NodoDoble {
    
    private char dato;
    private NodoDoble ligaIzq;
    private NodoDoble ligaDer;

    /**
     * Permite crear un Nodo con doble Liga.
     * @param dato Recibe un dato como parametro que es almacenado en el nodo
     */
    public NodoDoble(char dato) {
        this.dato = dato;
        ligaIzq = ligaDer = null;
    }
    
    /**
     * Devuelve el dato de un Nodo
     * @return Dato de tipo char
     */
    public char getDato() {
        return dato;
    }
    
    /**
     * Modifica el dato de un Nodo
     * @param dato Recibe el átomo de la hilera
     */
    public void setDato(char dato) {
        this.dato = dato;
    }
    
    /**
     * Recupera la liga izquierda del Nodo
     * @return Dato de tipo NodoDoble
     */
    public NodoDoble getLigaIzq() {
        return ligaIzq;
    }

    /**
     * Modifica y asigna la liga izquierda del nodo
     * @param ligaIzq Recibe un parametro tipo NodoDoble
     */
    public void setLigaIzq(NodoDoble ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    /**
     * Recupera la liga derecha del Nodo
     * @return Dato de tipo NodoDoble
     */
    public NodoDoble getLigaDer() {
        return ligaDer;
    }

    /**
     * Modifica y asigna la liga derecha del nodo
     * @param ligaDer Recibe un parametro NodoDoble
     */
    public void setLigaDer(NodoDoble ligaDer) {
        this.ligaDer = ligaDer;
    }
    
}
