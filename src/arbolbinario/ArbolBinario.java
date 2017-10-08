package arbolbinario;


import java.util.Stack;

/**
 * Clase que contiene las funciones que representan a un ArbolBinario Binario
 * ingresado como hilera de abre parentesis, atomos, comas y cierre parentesis
 * Incluye la función convertir arbol n-ario en árbol binario
 * Incluye los recorridos pre, in y pos-orden.
 * @author Felipe Cadavid & Carolina Diaz
 * @version 1.2
 * @since 07-10-2017
 */
public class ArbolBinario {
    
    private NodoDoble root;
    private NodoDoble ult;
    private NodoDoble x;

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
     * 
     */
    public void convertirBinArio(){
        
        
    }
   
    /**
     * Recorre e imprime el dato de cada nodo del árbol en modo Inorden (I+D). 
     * @param r Recibe un parámetro raiz tipo NodoDoble
     */
    public void inOrden(NodoDoble r){
                if(r != null){
                    inOrden(r.getLigaIzq());
                    System.out.print(r.getDato()+", ");
                    inOrden(r.getLigaDer());
                }
        }
        
    /**
     * Recorre e imprime el dato de cada nodo del árbol en modo Posorden (ID+).
     * @param r Recibe un parámetro raiz tipo NodoDoble
     */
    public void posOrden(NodoDoble r){
                if(r != null){
                    posOrden(r.getLigaIzq());
                    posOrden(r.getLigaDer());
                    System.out.print(r.getDato()+", ");
                }
        }
        
    /**
     * Recorre e imprime el dato de cada nodo del árbol en modo Posorden (+ID).
     * @param r Recibe un parámetro raiz tipo NodoDoble
     */
    public void preOrden(NodoDoble r){
                if(r != null){
                    System.out.print(r.getDato()+", ");
                    preOrden(r.getLigaIzq());
                    preOrden(r.getLigaDer());
                }
        }
    
     /**
     * Retorna la raiz del arbol binario
     * @return 
     */
    public NodoDoble getRoot() {
        return root;
    }
            
    
    
}
