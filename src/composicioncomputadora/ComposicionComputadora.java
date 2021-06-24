/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncomputadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author EDUARDO
 */
public class ComposicionComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc = new Computadora("HP", "All in one", new CPU("HP", "All in one", 800), new Monitor("HP", "All in one", 15), new Mouse("Logitech", "G203", "Alámbrico"), new Teclado("HP", "All in one", 100, 0));        
        
        System.out.println(pc.getMarca() + " " + pc.getModelo());
        System.out.println(pc.getCpu());
        System.out.println(pc.getMonitor());
        System.out.println(pc.getMouse());
        System.out.println(pc.getTeclado());
        
        
        
    }
    
}
