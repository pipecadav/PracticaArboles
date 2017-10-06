/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb;


import arbolb.NodoDoble;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Felipe Cadavid & Carolina Diaz
 */
public class ArbolBinario {
    
    private NodoDoble root, leftChild, rightChild, parent;
    private char dato;
    

    public void build(String theLine){
        Stack <NodoDoble> p = new Stack();
        NodoDoble r;
        for(int i=0; i <= theLine.length(); i++){
            
            if(theLine.charAt(i) >= 'a'){
                if(theLine.charAt(i) <= 'z'){
                    root = new NodoDoble (theLine.charAt(i));
                    p.push(root);
                    
                }
            }else if(theLine.charAt(i) == '('){
                    p.push(root);
                    r = root;
                    root.setLigaIzq(r);
                    
                
            }else if(theLine.charAt(i) == ','){
                    root = p.pop();
                    root.setLigaDer(rightChild);

            }else if(theLine.charAt(i) == ')'){
                    root = p.pop();
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
