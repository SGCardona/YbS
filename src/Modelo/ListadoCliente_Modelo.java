
package Modelo;

import Entidades.Clientes_Entidad;
import Entidades.Usuarios_Entidad;
import Entidades.Vehiculo_Entidad;
import Vista.Consul_Cliente_X_ID;
import Vista.JPClientes;
import Vista.JPClientes_Vehiculos;
import Vista.JPUsuarios;
import Vista.JPVehiculos;
import Vista.Listado_Vista;
import Vista.MenuPrincipal_Vista;
import Vista.SubMenuListados_Vista;
import java.util.Vector;

public class ListadoCliente_Modelo implements DatosConexion{

//    public Listado_Vista ls;
//    public MenuPrincipal_Vista mp;
    public Consul_Cliente_X_ID id;
    public JPUsuarios jpu;
    public JPClientes jpc;
    public JPVehiculos jpv;
    public JPClientes_Vehiculos jpcv;

    public ListadoCliente_Modelo(JPUsuarios obj) {
        jpu = obj;
    }
    public ListadoCliente_Modelo(JPClientes obj2) {
        jpc = obj2;
    }
    public ListadoCliente_Modelo(JPVehiculos obj3) {
        jpv = obj3;
    }
    public ListadoCliente_Modelo(JPClientes_Vehiculos obj4) { 
       jpcv = obj4; 
    }
    public void addRegistrosCV(){//Crear tabla con registros de cliente y vehiculo
        jpcv.mt.removeRow(0);
        //System.out.println("Personas");
        /*for (int i = 0; i < jpcv.sub.mp.vp.listadoC.size(); i++) {
            Clientes_Entidad obj = jpcv.sub.mp.vp.listadoC.get(i);
            /*Object datos[] = new Object[4];
            datos[0] = obj.getApellido();
            datos[1] = obj.getNombre();
            datos[2] = obj.getTel();
            datos[3] = obj.getCed();*/
            /*Vector<String> datos = new Vector<>();
            datos.add(obj.getApellido());
            datos.add(obj.getNombre());
            datos.add(obj.getTel());
            datos.add(obj.getCed());*/
            
            
            /*for(int c = 0; c < ls.sub.mp.vp.listadoV.size(); c++){
                if(c == i){
                    Vehiculo_Entidad vh = ls.sub.mp.vp.listadoV.get(c);
                    datos.add(vh.getPlaca());
                    datos.add(vh.getModelo());
                    datos.add(vh.getTipo());
                }           
            }*/ 
            //jpcv.mt.addRow(datos);
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
        //System.out.println("Personas");
        /*for (int i = 0; i < jpc.sub.mp.vp.listadoC.size(); i++) {
            Clientes_Entidad obj = jpc.sub.mp.vp.listadoC.get(i);
            /*Object datos[] = new Object[4];
            datos[0] = obj.getApellido();
            datos[1] = obj.getNombre();
            datos[2] = obj.getTel();
            datos[3] = obj.getCed();*/
            /*Vector<String> datos = new Vector<>();
            datos.add(obj.getApellido());
            datos.add(obj.getNombre());
            datos.add(obj.getTel());
            datos.add(obj.getCed());
            jpc.mt.addRow(datos);
        }*/
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
        /*for(int c = 0; c < jpv.sub.mp.vp.listadoV.size(); c++){
            Vehiculo_Entidad vh = jpv.sub.mp.vp.listadoV.get(c);
            Vector<String> datos = new Vector<>();
            datos.add(vh.getPlaca());
            datos.add(vh.getModelo());
            datos.add(vh.getTipo());
            jpv.mt.addRow(datos);
        }*/
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            String registros[][] = con.consultaMatriz("SELECT vehiculo, placa, modelo, entrada, salida FROM clientes");
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
        //System.out.println("Personas");
        /*for (int i = 0; i < jpu.sub.mp.vp.listadoU.size(); i++) {
            Usuarios_Entidad obj = jpu.sub.mp.vp.listadoU.get(i);
            /*Object datos[] = new Object[4];
            datos[0] = obj.getApellido();
            datos[1] = obj.getNombre();
            datos[2] = obj.getTel();
            datos[3] = obj.getCed();*/
            /*Vector<String> datos = new Vector<>();
            datos.add(obj.getNombre());
            datos.add(obj.getContraseña());
            datos.add(obj.getCorreo());
            datos.add(obj.getTelefono()); 
            datos.add(obj.getRol()); 
            jpu.mt.addRow(datos);
        }*/
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
