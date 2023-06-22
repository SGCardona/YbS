
package Modelo;

import Vista.JPTablaClientes;
import Vista.JPTablaClientes_Afiliados;
import Vista.JPTablaUsuarios;
import Vista.JPTablaVehiculos;

public class ListadoCliente_Modelo implements DatosConexion{

    public JPTablaUsuarios jpu;
    public JPTablaClientes jpc;
    public JPTablaVehiculos jpv;
    public JPTablaClientes_Afiliados jpca;

    public ListadoCliente_Modelo(JPTablaUsuarios obj) {
        jpu = obj;
    }
    public ListadoCliente_Modelo(JPTablaClientes obj2) {
        jpc = obj2;
    }
    public ListadoCliente_Modelo(JPTablaVehiculos obj3) {
        jpv = obj3;
    }
    public ListadoCliente_Modelo(JPTablaClientes_Afiliados obj4) { 
       jpca = obj4; 
    }
    public void addRegistrosC(){//Crear tabla con registros de cliente
        jpc.mt.removeRow(0);
            Conexion con = new Conexion();
            boolean error = con.conectarMySQL(baseDatos, user, login, host);
            if(!error){
                String registros[][] = con.consultaMatriz("SELECT * FROM cliente");
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
                String registros[][] = con.consultaMatriz("SELECT * FROM vehiculo");
                if(registros != null){
                    for(int f = 0; f < registros.length; f++){
                        jpv.mt.addRow(registros[f]);
                    }
                }   
            }
            con.desconectar();
    }
    public void addRegistrosA(){ //Crear tabla con registros de clientes afiliados
        jpca.mt.removeRow(0);
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            String registros[][] = con.consultaMatriz("SELECT * FROM afiliado");
            if(registros != null){
                for(int f = 0; f < registros.length; f++){
                    jpca.mt.addRow(registros[f]);
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
