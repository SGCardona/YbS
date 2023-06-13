
package Modelo;

import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.IngresoVehiculo_Vista;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Clientes_Modelo {
    
    public IngresoVehiculo_Vista cl;
//    public JPIngCliente_Vista icv;

    public Clientes_Modelo(IngresoVehiculo_Vista obj) {
        cl = obj;
    }
    public void gCliente(){//Guardar datos de cliente en la base de datos
        //-------------------- Extraccion datos de cliente ------------------------//
        cl.mp.vp.listaCliente.add(cl.ind.jtCedula.getText());
        cl.mp.vp.listaCliente.add(cl.ind.jtApellido.getText());
        cl.mp.vp.listaCliente.add(cl.ind.jtNombre.getText());
        cl.mp.vp.listaCliente.add(cl.ind.jtTelefono.getText());
        cl.mp.vp.listaCliente.add("");//Estado
        /*Date date = cl.indv.JdEntrada.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(date);
        String hora = (String) cl.indv.jcHora.getSelectedItem();
        String minutos = (String) cl.indv.jcMinutos.getSelectedItem();
        String total = hora + ":" + minutos;
        cl.mp.vp.listaVehiculo.add(fecha);
        cl.mp.vp.listaVehiculo.add(total);*/
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("cliente",cl.mp.vp.listaCliente);
            con.desconectar();
        }
    }
    public void gVehiculo(){//Guardar datos del vehiculo en la base de datos
        //-------------------- Extraccion datos de vehiculo -----------------------//
        cl.mp.vp.listaVehiculo.add(cl.ind.jtCedula.getText());
        cl.mp.vp.listaVehiculo.add(cl.indv.jtPlaca.getText());
        cl.mp.vp.listaVehiculo.add((String) cl.indv.jcTipo.getSelectedItem());
        cl.mp.vp.listaVehiculo.add(cl.indv.jtModelo.getText());
        cl.mp.vp.listaVehiculo.add("");//Estado
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("vehiculo",cl.mp.vp.listaVehiculo);
            con.desconectar();
        }
    }
    public void gAfiliado(){//Guardar datos de vehiculos afiliados
        //-------------------- Extraccion datos de vehiculo -----------------------//
        cl.mp.vp.listaAfiliado.add(cl.indv.jtPlaca.getText());
        Calendar calendario = cl.indv.JdEntrada.getCalendar(); // obtener la fecha seleccionada
        int dia_entrada = calendario.get(Calendar.DATE); // obtener el dia de entrada
        int mes_entrada = calendario.get(Calendar.MONTH) + 1; // obtener el mes de entrada
        int year_entrada = calendario.get(Calendar.YEAR); // obtener el year de entrada
        String hora = (String) cl.indv.jcHora.getSelectedItem();
        String minutos = (String) cl.indv.jcMinutos.getSelectedItem();
        String total = hora + ":" + minutos;
        cl.mp.vp.listaAfiliado.add(dia_entrada + ""); 
        cl.mp.vp.listaAfiliado.add(mes_entrada + ""); 
        cl.mp.vp.listaAfiliado.add(year_entrada + "");
        cl.mp.vp.listaAfiliado.add(total);
        cl.mp.vp.listaAfiliado.add("----"); 
        cl.mp.vp.listaAfiliado.add("----"); 
        cl.mp.vp.listaAfiliado.add("----");
        cl.mp.vp.listaAfiliado.add("----");
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("afiliado",cl.mp.vp.listaAfiliado);
            con.desconectar();
        }
    }
    public void gSalida(){
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            Calendar calendario = cl.indv.jdSalida.getCalendar(); // obtener la fecha seleccionada
            int dia_salida = calendario.get(Calendar.DATE); // obtener el dia de entrada
            int mes_salida = calendario.get(Calendar.MONTH) + 1; // obtener el mes de entrada
            int year_salida = calendario.get(Calendar.YEAR); // obtener el year de entrada
            String hora = (String) cl.indv.jcHora.getSelectedItem();
            String minutos = (String) cl.indv.jcMinutos.getSelectedItem();
            String total = hora + ":" + minutos;
            /*con.actualizar("UPDATE afiliado SET dia_salida = "+ dia_salida 
                    + ", mes_salida = "+ mes_salida 
                    + ", year_salida = "+ year_salida 
                    + ", hora_salida = "+ total 
                    + " WHERE placa = '" + cl.indv.jtPlaca.getText() + "'");*/
            con.actualizar
            con.desconectar();
        } 
    }
}
