 
package Modelo;

import Entidades.Usuarios_Entidad;
import Vista.CrearUsuario_Vista;

public class Usuarios_Modelo implements DatosConexion{
    
    CrearUsuario_Vista cu;

    public Usuarios_Modelo(CrearUsuario_Vista cu) {
        this.cu = cu;
    }
    
    public void guardarUsuario(){
        /*String nom = cu.jtNombre.getText();
        char contra[] = cu.jpContraseña.getPassword();
        String passw = String.valueOf(contra);
        String correo = cu.jtCorreo.getText();
        String tel = cu.jtTelefono.getText();
        String rol = (String) cu.jcRol.getSelectedItem();*/
        
        cu.mp.listaUsuarios.add(cu.jtNombre.getText());
        char contra[] = cu.jpContraseña.getPassword();
        cu.mp.listaUsuarios.add(String.valueOf(contra));
        cu.mp.listaUsuarios.add(cu.jtCorreo.getText());
        cu.mp.listaUsuarios.add((String) cu.jcRol.getSelectedItem());
        cu.mp.listaUsuarios.add(cu.jtTelefono.getText());
        cu.mp.listaUsuarios.add("");
        
        
//        Usuarios_Entidad us = new Usuarios_Entidad(nom, passw, correo, rol, tel, "");
//        cu.mp.listaUsuarios.add(us);
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            error = con.insertar("usuarios",cu.mp.listaUsuarios);
        }
    }
    
}
