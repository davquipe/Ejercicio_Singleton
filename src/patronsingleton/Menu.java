/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Menu {
    
    private static Menu instancia;
    
    private Menu(){}
    
    public static Menu getInstancia(){
        if (instancia == null) {
            instancia = new Menu();
            
        }
        return instancia;
    }
    
    public void Princiapal(){
        
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** Menu Principal ****"
            + "\n\n1.Sumar.\2.Restar.\n3.Salir"));
            
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2: 
                    restar();
                case 3: 
                    JOptionPane.showMessageDialog(null, "Fin _de la ejecucion ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion valida");
                    
                    
            }
        } while (opcion !=3);
    }

    private void sumar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "suamr: "+(numero1+numero2));
    }

    private void restar() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese Ingrese numero 2"));
        JOptionPane.showMessageDialog(null, "suamr: "+(numero1-numero2));
    }
    
}
