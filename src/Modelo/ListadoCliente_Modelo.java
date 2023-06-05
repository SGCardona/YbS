
package Modelo;

import Vista.Consul_Cliente_X_ID;
import Vista.JPTablaClientes;
import Vista.JPTablaClientes_Vehiculos;
import Vista.JPTablaUsuarios;
import Vista.JPTablaVehiculos;

public class ListadoCliente_Modelo implements DatosConexion{

//    public Listado_Vista ls;
//    public MenuPrincipal_Vista mp;
//    public Consul_Cliente_X_ID id;
    public JPTablaUsuarios jpu;
    public JPTablaClientes jpc;
    public JPTablaVehiculos jpv;
    public JPTablaClientes_Vehiculos jpcv;

    public ListadoCliente_Modelo(JPTablaUsuarios obj) {
        jpu = obj;
    }
    public ListadoCliente_Modelo(JPTablaClientes obj2) {
        jpc = obj2;
    }
    public ListadoCliente_Modelo(JPTablaVehiculos obj3) {
        jpv = obj3;
    }
    public ListadoCliente_Modelo(JPTablaClientes_Vehiculos obj4) { 
       jpcv = obj4; 
    }
    public void addRegistrosCV(){//Crear tabla con registros de cliente y vehiculo
        jpcv.mt.removeRow(0);
            Conexion con = new Conexion();
            boolean error = con.conectarMySQL(baseDatos, user, login, host);
            if(!error){
                String registros[][] = con.consultaMatriz("SELECT * FROM clientes");
                if(registros != null){
                    for(int f = 0; f < registros.length; f++){
                        jpcv.mt.addRow(registros[f]);
                    }
                }    
            }
            con.desconectar();
    }
    public void addRegistrosC(){ //Crear tabla con registros de Cliente
        jpc.mt.removeRow(0);
            Conexion con = new Conexion();
            boolean error = con.conectarMySQL(baseDatos, user, login, host);
            if(!error){
                String registros[][] = con.consultaMatriz("SELECT cedula, apellido, nombre, telefono FROM clientes");
                if(registros != null){
                    for(int f = 0; f < registros.length; f++){
                        jpc.mt.addRow(registros[f]);
                    }
                }   
            }
            con.desconectar();
    }
    public void addRegistrosV(){ //Crear tabla con registros de vehiculo
        jpv.mt.removeRow(0);
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            String registros[][] = con.consultaMatriz("SELECT vehiculo, placa, modelo, fecha_entrada, hora_entrada FROM clientes");
            if(registros != null){
                for(int f = 0; f < registros.length; f++){
                    jpv.mt.addRow(registros[f]);
                }
            }   
        }
        con.desconectar();
    }
    public void addRegistrosU(){ // Crear tabla con registros de Usuario
        jpu.mt.removeRow(0);
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            String registros[][] = con.consultaMatriz("SELECT * FROM usuarios");
            if(registros != null){
                for(int f = 0; f < registros.length; f++){
                    jpu.mt.addRow(registros[f]);
                }
            }   
        }
        con.desconectar();
    } 
}
