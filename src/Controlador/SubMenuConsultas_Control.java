
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
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.id.setVisible(true);

        }
        if(e.getSource().equals(sub.jbC_est)){
            sub.id.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbV_Placa)){
            sub.id.setVisible(false);
            sub.vehi.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(true);
        }
        if(e.getSource().equals(sub.jbV_Tipo)){
            sub.id.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbnom)){
            sub.id.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.nom.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbmodelo)){
            sub.id.setVisible(false);
            sub.nom.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.model.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbentrada)){
            sub.id.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.ent.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbsalidav)){
            sub.id.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ape.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbape)){
            sub.id.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.tel.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.ape.setVisible(true);
            
        }
        if(e.getSource().equals(sub.jbtelefono)){
            sub.id.setVisible(false);
            sub.nom.setVisible(false);
            sub.model.setVisible(false);
            sub.ent.setVisible(false);
            sub.sal.setVisible(false);
            sub.ape.setVisible(false);
            sub.estado.setVisible(false);
            sub.placa.setVisible(false);
            sub.vehi.setVisible(false);
            sub.tel.setVisible(true);
            
        }
    }
    
}
