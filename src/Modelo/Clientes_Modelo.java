
package Modelo;

import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.IngresoVehiculo_Vista;


public class Clientes_Modelo {
    
    public IngresoVehiculo_Vista cl;
//    public InDCliente_Vista icv;

    public Clientes_Modelo(IngresoVehiculo_Vista obj) {
        cl = obj;
    }
    public void guardar(){
        cl.mp.vp.listaClienteVehiculo.add(cl.ind.jtCedula.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.ind.jtApellido.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.ind.jtNombre.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.ind.jtTelefono.getText());
        cl.mp.vp.listaClienteVehiculo.add((String) cl.indv.jcTipo.getSelectedItem());
        cl.mp.vp.listaClienteVehiculo.add(cl.indv.jtPlaca.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.indv.jtModelo.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.indv.jtHoraEntrada.getText());
        cl.mp.vp.listaClienteVehiculo.add(cl.indv.jtHoraSalida.getText());
        
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("clientes",cl.mp.vp.listaClienteVehiculo);
            con.desconectar();
        }
    }
    
    
    
}
