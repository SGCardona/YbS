 
package Modelo;

import Vista.CrearUsuario_Vista;
import javax.swing.JOptionPane;

public class Usuarios_Modelo implements DatosConexion{
    
    CrearUsuario_Vista cu;

    public Usuarios_Modelo(CrearUsuario_Vista obj) {
        cu = obj;
    }
    public void guardarUsuario(){
        if(!validar()){
            cu.vp.listaUsuarios.add(cu.jtNombre.getText());
            char contra[] = cu.jpContraseña.getPassword();
            cu.vp.listaUsuarios.add(String.valueOf(contra));
            cu.vp.listaUsuarios.add(cu.jtCorreo.getText());
            cu.vp.listaUsuarios.add(cu.jtTelefono.getText());
            cu.vp.listaUsuarios.add((String) cu.jcRol.getSelectedItem());
            cu.vp.listaUsuarios.add("");
            Conexion con = new Conexion();
            boolean error = con.conectarMySQL(baseDatos, user, login, host);
            if(!error){
                error = con.insertar("usuarios",cu.vp.listaUsuarios);
                con.desconectar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
        }    
    }
    public boolean validar(){
        boolean validar = false;
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
                String registros[][] = con.consultaMatriz("usuarios","usuario = '" + cu.jtNombre.getText() + "'");
                if(registros != null){
                    validar = true;
                }   
            }
        con.desconectar();
        return validar;   
    }
    
    
    
}
