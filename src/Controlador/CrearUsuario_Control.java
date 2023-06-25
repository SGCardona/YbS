package Controlador;

import Modelo.Usuarios_Modelo;
import Vista.CrearUsuario_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CrearUsuario_Control implements ActionListener{

    CrearUsuario_Vista cu;
    
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
            if(!us.guardarUsuario()){
                cu.jtNombre.setText("");
                cu.jpContraseña.setText("");
                cu.jtCorreo.setText("");
                cu.jtTelefono.setText("");
                cu.jcRol.setToolTipText("");
                String[] opciones = {"OK"};
                int eleccion = JOptionPane.showOptionDialog(null,
                    "Cuenta creada correctamente",
                    "Confirmacion",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
                if(eleccion == 0){
                    cu.setVisible(false);
                    cu.dispose();
                    cu.vp.setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la creacion de cuenta");
            }
        }
        if(e.getSource().equals(cu.jbCancelar)){
            int ele = JOptionPane.showConfirmDialog(null, "Desea regresar");
            if(ele == 0){
                cu.setVisible(false);
                cu.dispose();
                cu.vp.setVisible(true);
            }
        }  
    }
}


