/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

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
