
package Modelo;

import Entidades.Clientes_Entidad;
import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.InDClientes_Vista;


public class Clientes_Modelo {
    
    public InDClientes_Vista cl;

    public Clientes_Modelo(InDClientes_Vista obj) {
        cl = obj;
    }
    
    public void guardar(){
        /*String nom = cl.jtNombre.getText();
        String ape = cl.jtApellido.getText();
        String tel = cl.jtTelefono.getText();
        String ced = cl.jtCedula.getText();
        Clientes_Entidad entidad = new Clientes_Entidad(nom, ape, tel, ced);
        cl.mp.listadoC.add(entidad);*/
        
        cl.mp.vp.listaClienteVehiculo.add(cl.jtCedula.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtApellido.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtNombre.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtTelefono.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtTipo.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtPlaca.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtModelo.getText());
        cl.mp.vp.listaClienteVehiculo.add("Ent");
        cl.mp.vp.listaClienteVehiculo.add("Out");
        
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("clientes",cl.mp.vp.listaClienteVehiculo);
            con.desconectar();
        }
    }
    
    
    
}
