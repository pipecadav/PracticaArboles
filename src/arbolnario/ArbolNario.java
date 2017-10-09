
package arbolnario;


import java.util.Stack;

/**
 * Clase que contiene las funciones de un arbol n-ario como lista generalizada 
 * Incluye las funciones de crear arbol,  e imprimir arbol. 
 * @author Felipe Cadavid y Carolina Diaz
 * @version 1.2
 * @since 07-10-2017
 */
public class ArbolNario {
    
    private Nodo root;
    private Nodo ult; 
    private Nodo x;
    
    /**
    * Permite crear una arbol N-ario a partir de una cadena tipo abre paréntesis,
    * átomos, comas y cierra paréntesis. 
    * @param pHilera Recibe un parametro tipo String
    */
    public void crearArbolNario(String pHilera){
        Stack pila = new Stack();
        if((pHilera.charAt(0) != '(') && (pHilera.charAt(1) == '(')){
            System.out.println("Inicio inválido de la hilera");
            }else{
            root = new Nodo(pHilera.charAt(1));
            ult = root;
            for(int i = 3; i < pHilera.length()-1; i++){
                char atom = pHilera.charAt(i);
                x = new Nodo(' ');
                ult.setLiga(x);
                ult = x;
                if(pHilera.charAt(i+1) == '('){
                    ult.setSw(1);
                    pila.add(ult);
                    x = new Nodo(atom);
                    ult.setlDato(x);
                    ult = x;
                    i = i+2;
                }else{
                    ult.setDato(atom);
                    if(pHilera.charAt(i+1) == ')'){
                        i++;
                        if(!pila.isEmpty()){
                        ult = (Nodo) pila.pop();
                        i++;
                        }
                        if(pHilera.charAt(i-1) == ','){
                        i++;
                        }
                    }else{
                        i = i+2;
                    }
                }
            }
        }  
    }
     /**
     * Retorna la raiz del arbol N-ario
     * @return Tipo de dato Nodo
     */
    public Nodo getRoot() {
        return root;
    }

}
