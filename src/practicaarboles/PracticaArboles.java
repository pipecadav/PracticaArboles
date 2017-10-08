/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

import arbolbinario.ArbolBinario;
import arbolnario.ArbolNario;

/**
 *
 * @author Felipe
 */
public class PracticaArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ArbolBinario a = new ArbolBinario();
        //a.crearArbolBinario("(a(b(c,d(e,f)),g(h,i(j,k))))");
        //a.inOrden(a.getRoot());
        //System.out.println(" - ");
        //a.posOrden(a.getRoot());
        //System.out.println(" - ");
        //a.preOrden(a.getRoot());
        //System.out.println(" - ");
        
        ArbolNario b = new ArbolNario();
        
        b.crearArbolNario("(a(b(c,d,e),f(g,h,i(j))))");
        
    }
    
}
