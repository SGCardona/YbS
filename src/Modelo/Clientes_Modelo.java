
package Modelo;

import Entidades.Clientes_Entidad;
import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.InDCliente_Vista;
import Vista.IngresoVehiculo_Vista;


public class Clientes_Modelo {
    
    public IngresoVehiculo_Vista cl;
//    public InDCliente_Vista icv;

    public Clientes_Modelo(IngresoVehiculo_Vista obj) {
        cl = obj;
    }
    
    public void guardar(){
<<<<<<< HEAD
        /*String nom = cl.jtNombre.getText();
        String ape = cl.jtApellido.getText();
        String tel = cl.jtTelefono.getText();
        String ced = cl.jtCedula.getText();
=======
        
        String nom = cl.ind.jtNombre.getText();
        String ape = cl.ind.jtApellido.getText();
        String tel = cl.ind.jtTelefono.getText();
        String ced = cl.ind.jtCedula.getText();
>>>>>>> 43370af1ed333848a2cd467a23dae116e59addca
        Clientes_Entidad entidad = new Clientes_Entidad(nom, ape, tel, ced);
        cl.mp.listadoC.add(entidad);*/
        
<<<<<<< HEAD
        cl.mp.vp.listaClienteVehiculo.add(cl.jtCedula.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtApellido.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtNombre.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtTelefono.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtTipo.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtPlaca.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.jtModelo.getText());
        cl.mp.vp.listaClienteVehiculo.add("Ent");
        cl.mp.vp.listaClienteVehiculo.add("Out");
=======
        cl.mp.listaCliente.add(cl.ind.jtNombre.getText());
        cl.mp.listaCliente.add(cl.ind.jtApellido.getText());
        cl.mp.listaCliente.add(cl.ind.jtTelefono.getText());
        cl.mp.listaCliente.add(cl.ind.jtCedula.getText());
        cl.mp.listaCliente.add("1");
>>>>>>> 43370af1ed333848a2cd467a23dae116e59addca
        
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("clientes",cl.mp.vp.listaClienteVehiculo);
            con.desconectar();
        }
    }
    
    
    
}
