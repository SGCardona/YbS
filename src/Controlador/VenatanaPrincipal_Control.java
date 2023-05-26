
package Controlador;

import Vista.Clientes_Vista;
import Vista.CrearUsuario_Vista;
import Vista.ListadoUsuarios_Vista;
import Vista.Listado_Vista;
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
            //System.out.println("Click");
            /*Clientes_Vista cl = new Clientes_Vista(mp);
            mp.setVisible(false);*/
        }
        
        if(e.getSource().equals(mp.jbCrear)){
            CrearUsuario_Vista cu = new CrearUsuario_Vista(mp);
            mp.setVisible(false);
            
        }
        
        if(e.getSource().equals(mp.jbListar)){
            /*Listado_Vista ls = new Listado_Vista(mp);
            mp.setVisible(false);  */
            ListadoUsuarios_Vista lsu = new ListadoUsuarios_Vista(mp);
            
        }
      
    }
    
}
