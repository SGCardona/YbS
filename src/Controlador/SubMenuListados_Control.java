
package Controlador;

import Vista.ListadoUsuarios_Vista;
import Vista.Listado_Vista;
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
            ListadoUsuarios_Vista lsu = new ListadoUsuarios_Vista(sub.mp.vp);
            sub.setVisible(false);
        }
        if(e.getSource().equals(sub.jblistaCV)){
            Listado_Vista ls = new Listado_Vista(sub);
            ls.tablaCV();
            ls.tablaCV.setVisible(true);
            //ls.tablaC.setVisible(false);
            //ls.tablaV.setVisible(false);
            sub.setVisible(false);
        }
        if(e.getSource().equals(sub.jblistaC)){
            Listado_Vista ls = new Listado_Vista(sub);
            ls.tablaC();
            //ls.tablaCV.setVisible(false);
            ls.tablaC.setVisible(true);
            //ls.tablaV.setVisible(false);
            sub.setVisible(false);
        }
        if(e.getSource().equals(sub.jblistaV)){
            Listado_Vista ls = new Listado_Vista(sub);
            ls.tablaV();
            //ls.tablaCV.setVisible(false);
            //ls.tablaC.setVisible(false);
            ls.tablaV.setVisible(true);
            sub.setVisible(false);
        }
        if(e.getSource().equals(sub.jbSalida)){
            sub.setVisible(false);
            sub.dispose();
            sub.mp.setVisible(true);
        }
    }
    
}
