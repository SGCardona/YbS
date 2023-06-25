
package Modelo;

import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.IngresoDatos_Vista;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Clientes_Modelo {
    
    public IngresoDatos_Vista cl;

    public Clientes_Modelo(IngresoDatos_Vista obj) {
        cl = obj;
    }
    public void gCliente(){//Guardar datos de cliente en la base de datos
        //-------------------- Extraccion datos de cliente ------------------------//
        cl.ing.mp.vp.listaCliente.add(cl.inc.jtCedula.getText());
        cl.ing.mp.vp.listaCliente.add(cl.inc.jtApellido.getText());
        cl.ing.mp.vp.listaCliente.add(cl.inc.jtNombre.getText());
        cl.ing.mp.vp.listaCliente.add(cl.inc.jtTelefono.getText());
        cl.ing.mp.vp.listaCliente.add("1");//Estado 1 -> Adentro o 0 -> Afuera
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("cliente",cl.ing.mp.vp.listaCliente);
            con.desconectar();
        }
    }
    public void gVehiculo(){//Guardar datos del vehiculo en la base de datos
        //-------------------- Extraccion datos de vehiculo -----------------------//
        cl.ing.mp.vp.listaVehiculo.add(cl.inc.jtCedula.getText());
        cl.ing.mp.vp.listaVehiculo.add(cl.inv.jtPlaca.getText());
        cl.ing.mp.vp.listaVehiculo.add((String) cl.inv.jcTipo.getSelectedItem());
        cl.ing.mp.vp.listaVehiculo.add(cl.inv.jtModelo.getText());
        cl.ing.mp.vp.listaVehiculo.add("1");//Estado 1 -> Adentro o 0 -> Afuera
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("vehiculo",cl.ing.mp.vp.listaVehiculo);
            con.desconectar();
        }
    }
    public void gAfiliado(){//Guardar datos de vehiculos afiliados
        //-------------------- Extraccion datos de vehiculo -----------------------//
        cl.ing.mp.vp.listaAfiliado.add(cl.inv.jtPlaca.getText());
        Calendar calendario = cl.inv.JdFecha.getCalendar(); // obtener la fecha seleccionada
        int dia_entrada = calendario.get(Calendar.DATE); // obtener el dia de entrada
        int mes_entrada = calendario.get(Calendar.MONTH) + 1; // obtener el mes de entrada
        int year_entrada = calendario.get(Calendar.YEAR); // obtener el year de entrada
        String hora = (String) cl.inv.jcHora.getSelectedItem();
        String minutos = (String) cl.inv.jcMinutos.getSelectedItem();
        String total = hora + ":" + minutos;
        cl.ing.mp.vp.listaAfiliado.add(dia_entrada + ""); 
        cl.ing.mp.vp.listaAfiliado.add(mes_entrada + ""); 
        cl.ing.mp.vp.listaAfiliado.add(year_entrada + "");
        cl.ing.mp.vp.listaAfiliado.add(total);
        cl.ing.mp.vp.listaAfiliado.add("0"); 
        cl.ing.mp.vp.listaAfiliado.add("0"); 
        cl.ing.mp.vp.listaAfiliado.add("0");
        cl.ing.mp.vp.listaAfiliado.add("00:00");
        cl.ing.mp.vp.listaAfiliado.add("1");
        
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("afiliado",cl.ing.mp.vp.listaAfiliado);
            con.desconectar();
        }
    }
    public void gSalida(String tabla){// Actualizar la salida de un vehiculo 
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            int num = 1;
            Calendar calendario = cl.inv.JdFecha.getCalendar(); // obtener la fecha seleccionada
            int dia_salida = calendario.get(Calendar.DATE); // obtener el dia de entrada
            int mes_salida = calendario.get(Calendar.MONTH) + 1; // obtener el mes de entrada
            int year_salida = calendario.get(Calendar.YEAR); // obtener el year de entrada
            String hora = (String) cl.inv.jcHora.getSelectedItem();
            String minutos = (String) cl.inv.jcMinutos.getSelectedItem();
            String total = hora + ":" + minutos;
            String cad = "UPDATE "+ tabla +" SET diaSalida = '" + dia_salida 
                        + "', mesSalida = '" + mes_salida 
                        + "', yearSalida = '" + year_salida 
                        + "', horaSalida = '" + total 
                        + "', estado = '0' WHERE placa = '" + cl.inv.jtPlaca.getText() + "' AND estado = '" + num + "'";

            con.actualizar(cad);
            JOptionPane.showMessageDialog(null, "Salida Registrada");
            con.desconectar();
        } 
    }
    public boolean validarS(String tabla){
        boolean validar = false;
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            String registros[][] = con.consultaMatriz("SELECT placa, estado FROM "+ tabla +"");
            if(registros != null){
                for(int f = 0; f < registros.length; f++) {
                    for(int c = 0; c < registros[f].length; c++) {
                        if(registros[f][0].equals(cl.inv.jtPlaca.getText())){
                            if(registros[f][c].equals("1")){
                                validar = true;
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
    public String filtrar(String tabla, String campos, String condicion){
        String cedula = "";
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
                String registros[][] = con.consultaMatriz("SELECT "+ campos +" FROM "+ tabla +" WHERE " + condicion);
                if(registros != null){
                    for(int f = 0; f < registros.length; f++) {
                        for(int c = 0; c < registros[f].length; c++) {
                            cedula = registros[0][0];
                        }
                    }
                }
            }
        con.desconectar();
        return cedula;
    }
    
    public static void main(String[] args) {
        Clientes_Modelo cl = new Clientes_Modelo(null);
        String ced = cl.filtrar("vehiculo","cedula, placa","placa = 'MJL60C'");
        System.out.println(ced);
        String nom = cl.filtrar("cliente", "nombre", "cedula = '" + ced + "'");
        System.out.println(nom);
    }
}

