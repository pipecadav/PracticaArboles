/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Felipe Cadavid & Carolina Diaz
 * @param <E>
 */
public class Arbol {
    
    private NodoDoble raiz, hijoIzq, hijoDer;
    private char dato;
    
    /**
     *
     * @param dato
     */
    public Arbol(char dato){
        raiz = new NodoDoble(dato); 

    }
    
    /**
     *
     */
    public void ingresar(String hilera){
        
        //( - > tiene hijos
        //, - > es hermano
        // ) Se devuelve
        
        // (a(b,c),c(d,e),f)

        
        for(int i=2; i<hilera.length(); i++){
            switch(hilera.charAt(i)){
                case '(':
                    raiz = new NodoDoble(hilera.charAt(i-1));
                    hijoIzq.setDato(hilera.charAt(i+1));
                    if(hilera.charAt(i+2) == ','){
                        hijoDer.setDato(hilera.charAt(i+3));
                    }else if(hilera.charAt(i+2) == '('){
                        raiz = hijoDer;
                        
                    }
                    break;
                case ',':
                    
                    
                    
            }
        
        
            
        }
    }
    
        public void recorrido1() {
        Queue<NodoDoble> queue = new LinkedList<>();
        System.out.println("Comienzo recorrido1");
        if (raiz != null) {
            queue.add(raiz);
            NodoDoble p;
            while (!queue.isEmpty()) {
               p = queue.poll();
                System.out.println(p.getDato()+" ,");
                if (p.getLigaIzq() != null) {
                    queue.add(p.getLigaIzq());
                }
                if(p.getLigaDer() != null) {
                    queue.add(p.getLigaDer());
                }
            }
        }
    }
    
    /**
     *
     */
    public void recorrido2() {
        Stack<NodoDoble> stac = new Stack<>();
        
        System.out.println("Comienzo recorrido2");
        if (raiz != null) {
            stac.add(raiz);
            NodoDoble p;
            while (!stac.isEmpty()) {
                p = stac.pop();
                System.out.println(p.getDato()+" ,");
                if (p.getLigaIzq() != null){
                    stac.add(p.getLigaIzq());
                }
                if(p.getLigaDer() != null) {
                    stac.add(p.getLigaDer());
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
                    System.out.println(r.getDato());
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
                    posOrden(r.getLigaIzq());
                    System.out.println(r.getDato());
                }
        }
        
    /**
     *
     * @param r
     */
    public void preOrden(NodoDoble r){
                if(r != null){
                    System.out.println(r.getDato());
                    preOrden(r.getLigaIzq());
                    preOrden(r.getLigaDer());
                }
        }
            
    
    
}
