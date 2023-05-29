
package Controlador;

import Vista.IngresoVehiculo_Vista;
import Vista.MenuPrincipal_Vista;
import Vista.SubMenuConsultas_Vista;
import Vista.SubMenuListados_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal_Control implements ActionListener{

    public MenuPrincipal_Vista mp;

    public MenuPrincipal_Control(MenuPrincipal_Vista mp) {
        this.mp = mp;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(mp.jbDatos)){
            IngresoVehiculo_Vista ini = new IngresoVehiculo_Vista(mp.vp);
            mp.setVisible(false);
        }
        if(e.getSource().equals(mp.jbListados)){
            SubMenuListados_Vista sub = new SubMenuListados_Vista(mp);
            mp.setVisible(false);   
        }
        if(e.getSource().equals(mp.jbConsulta)){
            SubMenuConsultas_Vista subC = new SubMenuConsultas_Vista(mp);
            mp.setVisible(false);
        }
    }
    
}
