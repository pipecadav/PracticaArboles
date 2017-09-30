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
    
    private NodoDoble root;
    private char dato;
    
    /**
     *
     * @param dato
     */
    //public Arbol(char dato){
    //    root = new NodoDoble(dato); 

    //}
    
    /**
     *
     */
    public void ingresar(String expression){
        Stack <NodoDoble> st = new Stack<>();
        NodoDoble aux = root;
        if(expression.charAt(0) != '('){
            System.out.println("Inicio ilegal de la hilera");
        }else{
            for(int i=2; i<=expression.length(); i++){
                switch(expression.charAt(i)){
                    case '(':
                        if(root != null){
                        root = new NodoDoble(expression.charAt(i-1));
                        root.setLigaIzq(aux);
                        aux.setDato(expression.charAt(i+1));
                        st.add(root);
                        }
                        break;
                    case ',':
                        if(root != null){
                        root.setLigaDer(aux);
                        aux.setDato(expression.charAt(i+1));
                        st.add(root);
                        }
                        break;
                    case ')':
                        root = st.pop();

                        break;

                }
            }   
        }
    }
    
        public void recorrido1() {
        Queue<NodoDoble> queue = new LinkedList<>();
        System.out.println("Comienzo recorrido1");
        if (root != null) {
            queue.add(root);
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
        if (root != null) {
            stac.add(root);
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
