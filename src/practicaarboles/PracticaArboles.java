/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

import arbolb.ArbolBinario;

/**
 *
 * @author Felipe
 */
public class PracticaArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolBinario a = new ArbolBinario();
        
        a.build("(a(b(c,d),e(f,g)))");
    }
    
}
