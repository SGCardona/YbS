package Controlador;

import Modelo.Usuarios_Modelo;
import Vista.CrearUsuario_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearUsuario_Control implements ActionListener{

    public CrearUsuario_Vista cu;
    
    public CrearUsuario_Control(CrearUsuario_Vista obj) {
        cu = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(cu.jtVer)){
            if(cu.jtVer.getIcon().equals(cu.noVer)){
                cu.jtVer.setIcon(cu.ver);
                cu.jpContraseña.setEchoChar((char) 0);
            }else{
                cu.jtVer.setIcon(cu.noVer);
                cu.jpContraseña.setEchoChar('*');
            }cu.jpContraseña.requestFocus();    
        }
        
        if(e.getSource().equals(cu.jbGuardar)){
            Usuarios_Modelo us = new Usuarios_Modelo(cu);
            us.guardarUsuario();
            
            cu.jtNombre.setText("");
            cu.jpContraseña.setText("");
            cu.jtCorreo.setText("");
            cu.jtTelefono.setText("");
            cu.jcRol.setToolTipText(""); 
        }
        
        if(e.getSource().equals(cu.jbCancelar)){
            cu.setVisible(false);
            cu.dispose();
            cu.vp.setVisible(true);   
        }
        
    }
}


