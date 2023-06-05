
package Controlador;

import Vista.CrearUsuario_Vista;
import Vista.InicioSesion_Vista;
import Vista.VentanaPrincipal_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VenatanaPrincipal_Control implements ActionListener{
    
    VentanaPrincipal_Vista vp;

    public VenatanaPrincipal_Control(VentanaPrincipal_Vista obj) {
        vp = obj;   
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(vp.jbEntrada)){
            InicioSesion_Vista ini = new InicioSesion_Vista(vp);
            vp.setVisible(false);
        }
        if(e.getSource().equals(vp.jbCrear)){
            CrearUsuario_Vista cu = new CrearUsuario_Vista(vp);
            vp.setVisible(false);
        }
        if(e.getSource().equals(vp.jbSalida)){
            System.exit(0);
        }
      
    }
    
}
