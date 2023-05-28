
package Controlador;

import Vista.InDClientes_Vista;
import Vista.MenuPrincipal_Vista;
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
            InDClientes_Vista ini = new InDClientes_Vista(mp.vp);
            mp.setVisible(false);
        }
    }
    
}
