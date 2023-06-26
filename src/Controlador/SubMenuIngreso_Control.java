
package Controlador;

import Vista.IngresoDatos_Vista;
import Vista.SubMenuIngreso_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SubMenuIngreso_Control implements ActionListener{
    
    public SubMenuIngreso_Vista ing;

    public SubMenuIngreso_Control(SubMenuIngreso_Vista ing) {
        this.ing = ing;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ing.jbAfiliados)){
            IngresoDatos_Vista ingv = new IngresoDatos_Vista(ing);
            ing.setVisible(false);
        }
        if(e.getSource().equals(ing.jbSalir)){
            ing.setVisible(false);
            ing.dispose();
            ing.mp.setVisible(true);
        }
    }
    
    
}
