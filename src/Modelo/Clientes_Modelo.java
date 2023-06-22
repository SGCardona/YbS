
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
        cl.mp.vp.listaCliente.add(cl.inc.jtCedula.getText());
        cl.mp.vp.listaCliente.add(cl.inc.jtApellido.getText());
        cl.mp.vp.listaCliente.add(cl.inc.jtNombre.getText());
        cl.mp.vp.listaCliente.add(cl.inc.jtTelefono.getText());
        cl.mp.vp.listaCliente.add("1");//Estado 1 -> Adentro o 0 -> Afuera
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
        cl.mp.vp.listaVehiculo.add(cl.inc.jtCedula.getText());
        cl.mp.vp.listaVehiculo.add(cl.inv.jtPlaca.getText());
        cl.mp.vp.listaVehiculo.add((String) cl.inv.jcTipo.getSelectedItem());
        cl.mp.vp.listaVehiculo.add(cl.inv.jtModelo.getText());
        cl.mp.vp.listaVehiculo.add("1");//Estado 1 -> Adentro o 0 -> Afuera
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
        cl.mp.vp.listaAfiliado.add(cl.inv.jtPlaca.getText());
        Calendar calendario = cl.inv.JdEntrada.getCalendar(); // obtener la fecha seleccionada
        int dia_entrada = calendario.get(Calendar.DATE); // obtener el dia de entrada
        int mes_entrada = calendario.get(Calendar.MONTH) + 1; // obtener el mes de entrada
        int year_entrada = calendario.get(Calendar.YEAR); // obtener el year de entrada
        String hora = (String) cl.inv.jcHora.getSelectedItem();
        String minutos = (String) cl.inv.jcMinutos.getSelectedItem();
        String total = hora + ":" + minutos;
        cl.mp.vp.listaAfiliado.add(dia_entrada + ""); 
        cl.mp.vp.listaAfiliado.add(mes_entrada + ""); 
        cl.mp.vp.listaAfiliado.add(year_entrada + "");
        cl.mp.vp.listaAfiliado.add(total);
        cl.mp.vp.listaAfiliado.add("----"); 
        cl.mp.vp.listaAfiliado.add("----"); 
        cl.mp.vp.listaAfiliado.add("----");
        cl.mp.vp.listaAfiliado.add("----");
        cl.mp.vp.listaAfiliado.add("1");
        
        //------------- Conexion e ingreso de datos a la base ------------------//
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("afiliado",cl.mp.vp.listaAfiliado);
            con.desconectar();
        }
    }
    public void gSalida(){// Actualizar la salida de un vehiculo "afiliado"
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            int num = 1;
            Calendar calendario = cl.inv.jdSalida.getCalendar(); // obtener la fecha seleccionada
            int dia_salida = calendario.get(Calendar.DATE); // obtener el dia de entrada
            int mes_salida = calendario.get(Calendar.MONTH) + 1; // obtener el mes de entrada
            int year_salida = calendario.get(Calendar.YEAR); // obtener el year de entrada
            String hora = (String) cl.inv.jcHoraS.getSelectedItem();
            String minutos = (String) cl.inv.jcMinutoS.getSelectedItem();
            String total = hora + ":" + minutos;
            String cad = "UPDATE afiliado SET diaSalida = '" + dia_salida 
                        + "', mesSalida = '" + mes_salida 
                        + "', yearSalida = '" + year_salida 
                        + "', horaSalida = '" + total 
                        + "', estado = '0' WHERE placa = '" + cl.inv.jtPlaca.getText() + "' AND estado = '" + num + "'";

            con.actualizar(cad);
            con.desconectar();
        } 
    }
    public boolean validarS(){
        boolean validar = false;
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
                String registros[][] = con.consultaMatriz("SELECT placa, estado FROM afiliado");
                if(registros != null){
                    for(int f = 0; f < registros.length; f++) {
                        for(int c = 0; c < registros[f].length; c++) {
                            System.out.println(registros[f][c]+ "[" + f + "]" + "[" + c + "]");
                            if(registros[f][0].equals(cl.inv.jtPlaca.getText())){
                                if(registros[f][c].equals("1")){
                                    validar = true;
                                    System.out.println("Para salir");
                                    break;
                                }
                                else{
                                    if(f == (registros.length)){
                                        JOptionPane.showMessageDialog(null,"El vehiculo ya realizo la salida");
                                        break;
                                    }   
                                }
                            }else{
                                if(f == (registros.length)){
                                    JOptionPane.showMessageDialog(null, "La placa " + cl.inv.jtPlaca.getText() + " no se encuentra registrada");
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

