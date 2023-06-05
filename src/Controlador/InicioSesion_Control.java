
package Controlador;

import Vista.InicioSesion_Vista;
import Vista.MenuPrincipal_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesion_Control implements ActionListener{
    
    public InicioSesion_Vista ini;

    public InicioSesion_Control(InicioSesion_Vista ini) {
        this.ini = ini;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ini.jbIniciar)){
            MenuPrincipal_Vista mp = new MenuPrincipal_Vista(ini.vp);
            ini.setVisible(false);
        }
    }
    
}
