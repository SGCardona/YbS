
package Modelo;

import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.InicioSesion_Vista;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class InicioSesion_Modelo implements DatosConexion{
    
    public InicioSesion_Vista ini;

    public InicioSesion_Modelo(InicioSesion_Vista obj) {
        ini = obj;
    }
    //SELECT * FROM " + tabla + " WHERE " + campo + " = '" + valor + "'"
    public boolean iniciarSesion(){
        boolean validar = false;
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            char[] pass = ini.jpPass.getPassword();
                String registros[][] = con.consultaMatriz("SELECT * FROM usuarios");
                if(registros != null){
                    for (int f = 0; f < registros.length; f++) {
                        for (int c = 0; c < registros[f].length; c++) {
                            //System.out.println(registros[f][c]+ "[" + f + "]" + "[" + c + "]");
                            if(registros[f][0].equals(ini.jtUsuario.getText())){
                                if(registros[f][c].equals(String.valueOf(pass))){
                                    validar = true;
                                    break;
                                }
                                else{
                                    if(f == registros.length){
                                        JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                                        break;
                                    }
                                }
                            }else{
                                if(f == registros.length){
                                    JOptionPane.showMessageDialog(null, "El nombre de usuario" + ini.jtUsuario.getText() + " no se encuentra registrado");
                                    break;
                                } 
                            }
                        }
                    }
                }
            }
        con.desconectar();
        return validar;
    }
}
