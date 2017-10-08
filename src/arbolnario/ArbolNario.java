
package arbolnario;


import java.util.Stack;

/**
 * Clase que contiene las funciones de un arbol n-ario como lista generalizada 
 * Incluye las funciones de crear arbol,  e imprimir arbol. 
 * @author Felipe Cadavid & Carolina Diaz
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
            root = new Nodo(0, pHilera.charAt(1));
            ult = root;
            for(int i = 2; i < pHilera.length(); i++){
                char atom = pHilera.charAt(i);
                if(atom == '('){
                    x = new Nodo(1,' ');
                    ult.setLiga(x);
                    ult = ult.getLiga();
                }
                switch(atom){
                    
                        
                    case '(':
                        ult.setSw(1);
                        pila.add(ult);  
                        break;
                    case ',':
                        i++;
                        break;
                        
                    case ')':
                        if(!pila.isEmpty()){
                        ult = (Nodo) pila.pop();
                        }
                        break;
                        
                    default:
                        x = new Nodo(0, atom);
                        ult.setLiga(x);
                        ult = ult.getLiga();
                        //ult.setlDato(x);
                        //ult = ult.getLiga();
                        break;
                    
                }
            
            }
        }  
    }

}
