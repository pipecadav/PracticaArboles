
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
     * Imprime las hojas del arbol.
     * @param r Recibe un nodo como parametro.
     */
    public  void imprimirHojas(Nodo r){
        if(r == null){
            System.out.println("No existe el Arbol");
        }else if(r.getLiga() == null){
            System.out.println("Arbol sin hojas");
        }
        Nodo x = r.getLiga();
        Stack pila = new Stack();
        while(x != null){
            if(x.getSw() == 1){
                if(x.getLiga() != null){
                    pila.add(x);
                }
                x = x.getLiga();
                if(x.getSw() == 0){
                    System.out.println(x.getDato());
                }
            }else{
                System.out.println(x.getDato());
            }
            if(x.getLiga() != null){
                x = x.getLiga();
            }else{
                Nodo y = (Nodo) pila.pop();
                if(y != null){
                    x = y.getLiga();
                }else{
                    x = null;
                }
            }
        }
    }
    
    /**
     * Cuenta las hojas de un arbol n-ario
     * @param r Recibe un dato tipo Nodo
     * @return Devuelve la cantidad de hojas
     */
    public int contarHojasArbol(Nodo r){
        int hojas = 0;
        String respuesta;
        if(r == null){
            return 0;
        }else if(r.getLiga() == null){
            return 1;
        }
        Nodo p = r.getLiga();
        while(p != null){
            if(p.getSw() == 0){
                hojas++;
            }else{
                hojas = hojas + contarHojasArbol((Nodo) p.getlDato());
            }
            p = p.getLiga();
        }
        return hojas;
    }
    
     /**
     * Retorna la raiz del arbol N-ario
     * @return Tipo de dato Nodo
     */
    public Nodo getRoot() {
        return root;
    }

}
