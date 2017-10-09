/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Cadavid  Carolina Diaz
 */
public class Grafico extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        // Contar la cantidad de nodos
        // Contar la altura
        // El nivel 
        g.drawOval(512, 5, 50, 50);
        g.drawLine(10, 10, 10, 10);
        g.drawOval(256, 200, 40, 40);
        
        
    

    }
    
  
    
    
}
