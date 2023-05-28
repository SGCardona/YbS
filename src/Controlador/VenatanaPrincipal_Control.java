
package Controlador;

import Vista.CrearUsuario_Vista;
import Vista.InicioSesion_Vista;
import Vista.ListadoUsuarios_Vista;
import Vista.VentanaPrincipal_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VenatanaPrincipal_Control implements ActionListener{
    
    VentanaPrincipal_Vista mp;

    public VenatanaPrincipal_Control(VentanaPrincipal_Vista obj) {
        mp = obj;   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(mp.jbEntrada)){
            InicioSesion_Vista ini = new InicioSesion_Vista(mp);
            mp.setVisible(false);
        }
        if(e.getSource().equals(mp.jbCrear)){
            CrearUsuario_Vista cu = new CrearUsuario_Vista(mp);
            mp.setVisible(false);
        }
        if(e.getSource().equals(mp.jbSalida)){
//            ListadoUsuarios_Vista lsu = new ListadoUsuarios_Vista(mp);
            System.exit(0);
        }
      
    }
    
}
