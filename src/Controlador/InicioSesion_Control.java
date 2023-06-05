
package Controlador;

import Modelo.InicioSesion_Modelo;
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
            InicioSesion_Modelo inm = new InicioSesion_Modelo(ini);
            boolean validar = inm.iniciarSesion();
            if(validar){
                MenuPrincipal_Vista mp = new MenuPrincipal_Vista(ini.vp);
                ini.setVisible(false);
            }
        }
        if(e.getSource().equals(ini.jbCancelar)){
            ini.setVisible(false);
            ini.dispose();
            ini.vp.setVisible(true);
        }
    }
    
}
