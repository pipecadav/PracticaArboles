/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;


import arboles.NodoDoble;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Felipe Cadavid & Carolina Diaz
 */
public class Arbol {
    
    private NodoDoble raiz;
    private NodoDoble ult;
    private NodoDoble x;
    private String hilera;
    

    public void arbolBinario(String pHilera){
        Stack <NodoDoble> pila = new Stack();
        if((pHilera.charAt(0) != '(') && (pHilera.charAt(1) != '(')){
            System.out.println("Inicio inválido de la hilera");
            }else{
            char atomo = ' ';
            raiz = new NodoDoble(pHilera.charAt(1));
            ult = x = raiz;
            for(int i = 2; i < pHilera.length(); i++){
                atomo = pHilera.charAt(i);
                if(atomo == '('){
                     pila.add(ult);
                     ult.setDato(pHilera.charAt(i-1));
                     x.setDato(pHilera.charAt(i+1));
                     ult.setLigaIzq(x);
                     ult = x;
                 
                }else if(atomo == ','){
                    x.setDato(pHilera.charAt(i+1));
                    ult.setLigaDer(x);
                
                }else if(atomo == ')'){
                    if(!pila.isEmpty()){
                    pila.pop();
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
                    posOrden(r.getLigaDer());
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
