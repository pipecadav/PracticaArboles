/**
 * Este clase contiene las funciones que representan a un Arbol Binario
 * Incluye la función convertir arbol n-ario en árbol binario
 * Incluye los recorridos pre, in y pos-orden.
 */
package arbolbinario;


import java.util.Stack;

/**
 *
 * @author Felipe Cadavid & Carolina Diaz
 */
public class Arbol {
    
    private NodoDoble root;
    private NodoDoble ult;
    private NodoDoble x;


    public void createBinaryTree(String pHilera){
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
     *
     * @param r
     */
    public void inOrden(NodoDoble r){
                if(r != null){
                    inOrden(r.getLigaIzq());
                    System.out.print(r.getDato()+", ");
                    inOrden(r.getLigaDer());
                }
        }
        
    /**
     *
     * @param r
     */
    public void posOrden(NodoDoble r){
                if(r != null){
                    posOrden(r.getLigaIzq());
                    posOrden(r.getLigaDer());
                    System.out.print(r.getDato()+", ");
                }
        }
        
    /**
     *
     * @param r
     */
    public void preOrden(NodoDoble r){
                if(r != null){
                    System.out.print(r.getDato()+", ");
                    preOrden(r.getLigaIzq());
                    preOrden(r.getLigaDer());
                }
        }

    public NodoDoble getRoot() {
        return root;
    }
            
    
    
}
