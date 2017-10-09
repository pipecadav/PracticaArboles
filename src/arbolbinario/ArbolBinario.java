package arbolbinario;


import arbolnario.*;
import java.util.Stack;

/**
 * Clase que contiene las funciones que representan a un ArbolBinario Binario
 * ingresado como hilera de abre parentesis, atomos, comas y cierre parentesis
 * Incluye la función convertir arbol n-ario en árbol binario
 * Incluye los recorridos pre, in y pos-orden.
 * @author Felipe Cadavid y Carolina Diaz
 * @version 1.2
 * @since 07-10-2017
 */
public class ArbolBinario {
    
    private NodoDoble root;
    private NodoDoble ult;
    private NodoDoble x;
    String salida = " ";

    /**
    * Permite crear una arbol binario a partir de una cadena tipo abre paréntesis,
    * átomos, comas y cierra paréntesis. 
    * @param pHilera Recibe un parametro tipo String
    */
    public void crearArbolBinario(String pHilera){
        Stack pila = new Stack();
        if((pHilera.charAt(0) != '(') && (pHilera.charAt(1) == '(')){
            System.out.println("Inicio inválido de la hilera");
            }else{
            root = new NodoDoble(pHilera.charAt(1));
            ult = root;
            for(int i = 2; i < pHilera.length(); i++){
                char atom = pHilera.charAt(i);
            if((atom >= 'a') && (atom <= 'z')){
                    x = new NodoDoble(atom);
                    if(pHilera.charAt(i-1) == '('){
                        pila.add(ult);
                        ult.setLigaIzq(x);
                        ult = ult.getLigaIzq();
                    }else if(pHilera.charAt(i-1) == ','){
                        ult = (NodoDoble) pila.pop();
                        ult.setLigaDer(x);
                        ult = ult.getLigaDer();
                    } 
                }
            }
        }  
    }
    
    /**
     * Permite convertir un árbol n-ario en un árbol binario
     * @param n Recibe un Arbol N-ario
     */
    public void convertirBinArio(ArbolNario n){
        Nodo p = n.getRoot();
        Nodo q;
        x = new NodoDoble(p.getDato());
        root = ult = x;
        Stack pila = new Stack();
        p = p.getLiga();
        while(p != null){
            if(p.getSw() == 0){
                x = new NodoDoble(p.getDato());
            }else{
                q = (Nodo) p.getlDato();
                x = new NodoDoble(q.getDato());
                pila.add(x);
                pila.add(q.getLiga());
            }
            ult.setLigaIzq(x);
            ult = x;
            p = p.getLiga();
            while(p != null){
                if(p.getSw() == 0){
                    x = new NodoDoble(p.getDato());
                }else{
                    q = (Nodo) p.getlDato();
                    x = new NodoDoble (q.getDato());
                    pila.add(x);
                    pila.add(q.getLiga());
                }
                ult.setLigaDer(x);
                ult = x;
                p = p.getLiga();
            }
            if(!pila.isEmpty()){
                p = (Nodo) pila.pop();
                ult = (NodoDoble) pila.pop();
            }
        } 
    }
   
    /**
     * Recorre e imprime el dato de cada nodo del árbol en modo Inorden (I+D). 
     * @param r Recibe un parámetro raiz tipo NodoDoble
     * @return Devuelve una cadena del recorrido
     */
    public String inOrden(NodoDoble r){
                if(r != null){
                    inOrden(r.getLigaIzq());
                    salida = salida+", "+r.getDato();;
                    inOrden(r.getLigaDer());
                }
                return salida;
        }
        
    /**
     * Recorre e imprime el dato de cada nodo del árbol en modo Posorden (ID+).
     * @param r Recibe un parámetro raiz tipo NodoDoble
     * @return Devuelve una cadena del recorrido
     */
    public String posOrden(NodoDoble r){
                if(r != null){
                    posOrden(r.getLigaIzq());
                    posOrden(r.getLigaDer());
                    salida = salida+", "+r.getDato();;
                }
                return salida;
        }
        
    /**
     * Recorre e imprime el dato de cada nodo del árbol en modo Posorden (+ID).
     * @param r Recibe un parámetro raiz tipo NodoDoble
     * @return Devuelve una cadena del recorrido
     */
    public String preOrden(NodoDoble r){
                    
                    if(r != null){
                    salida = salida+", "+r.getDato();
                    preOrden(r.getLigaIzq());
                    preOrden(r.getLigaDer());
                }
                    return salida;
        }
    
     /**
     * Retorna la raiz del arbol binario
     * @return Dato de tipo NodoDoble
     */
    public NodoDoble getRoot() {
        return root;
    }
            
    
    
}
