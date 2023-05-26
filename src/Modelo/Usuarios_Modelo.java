
package Modelo;

import Entidades.Usuarios_Entidad;
import Vista.CrearUsuario_Vista;

public class Usuarios_Modelo {
    
    CrearUsuario_Vista cu;

    public Usuarios_Modelo(CrearUsuario_Vista cu) {
        this.cu = cu;
    }
    
    public void guardarUsuario(){
        String nom = cu.jtNombre.getText();
        char contra[] = cu.jpContraseña.getPassword();
        String passw = String.valueOf(contra);
        String correo = cu.jtCorreo.getText();
        String tel = cu.jtTelefono.getText();
        String rol = (String) cu.jcRol.getSelectedItem();
        
        Usuarios_Entidad us = new Usuarios_Entidad(nom, passw, correo, rol, tel, "");
        cu.mp.listaUsuarios.add(us);
    }
    
}
