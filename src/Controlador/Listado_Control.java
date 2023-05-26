
package Controlador;

import Vista.Listado_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Listado_Control implements ActionListener{
    
    Listado_Vista ls;

    public Listado_Control(Listado_Vista obj) {
        ls = obj;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(ls.jbVolver)){
            ls.setVisible(false);
            ls.dispose();
            ls.mp.setVisible(true);
        }
    }
    
}
