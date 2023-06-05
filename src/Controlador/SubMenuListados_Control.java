
package Controlador;

import Vista.SubMenuListados_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubMenuListados_Control implements ActionListener{
    
    public SubMenuListados_Vista sub;

    public SubMenuListados_Control(SubMenuListados_Vista sub) {
        this.sub = sub;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(sub.jblistaU)){
            sub.jpU.setVisible(true);
            sub.jpC.setVisible(false);
            sub.jpV.setVisible(false);
            sub.jpCV.setVisible(false);
            
        }
        if(e.getSource().equals(sub.jblistaCV)){
            sub.jpU.setVisible(false);
            sub.jpC.setVisible(false);
            sub.jpV.setVisible(false);
            sub.jpCV.setVisible(true);
        }
        if(e.getSource().equals(sub.jblistaC)){
            sub.jpU.setVisible(false);
            sub.jpC.setVisible(true);
            sub.jpV.setVisible(false);
            sub.jpCV.setVisible(false);
        }
        if(e.getSource().equals(sub.jblistaV)){
            sub.jpU.setVisible(false);
            sub.jpC.setVisible(false);
            sub.jpV.setVisible(true);
            sub.jpCV.setVisible(false);
        }
        if(e.getSource().equals(sub.jbSalida)){
            sub.setVisible(false);
            sub.dispose();
            sub.mp.setVisible(true);
        }
    }
    
}
