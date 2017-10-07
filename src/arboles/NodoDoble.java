/**
 * Esta clase implementa el Nodo Doble para la creación del arbol binario
 * 
 */
package arboles;

/**
 *
 * @author Felipe Cadavid & Carolina Diaz
 */
public class NodoDoble {
    
    private char dato;
    private NodoDoble ligaIzq;
    private NodoDoble ligaDer;

    public NodoDoble(char dato) {
        this.dato = dato;
        ligaIzq = ligaDer = null;
    }
       
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public NodoDoble getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoble ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoble getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDoble ligaDer) {
        this.ligaDer = ligaDer;
    }
    
    
    
    
}
