
package Controlador;

import Vista.SubMenuConsultas_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SubMenuConsultas_Control implements ActionListener {
    
    public SubMenuConsultas_Vista sub;
    
    public SubMenuConsultas_Control(SubMenuConsultas_Vista obj){
        sub = obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(sub.jbSalida)){
            sub.setVisible(false);
            sub.dispose();
            sub.mp.setVisible(true);
        }
        if(e.getSource().equals(sub.jbC_Id)){
            sub.id.setVisible(true);

        }
        if(e.getSource().equals(sub.jbC_est)){
            
        }
        if(e.getSource().equals(sub.jbV_Placa)){
            
        }
        if(e.getSource().equals(sub.jbV_Tipo)){
            
        }
    }
    
}
