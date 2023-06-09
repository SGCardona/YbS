
package Controlador;

import Modelo.Conexion;
import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.Consul_Nombre;
import Vista.Consul_Tipo_Vehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Consul_Nombre_Control implements ActionListener {

    Consul_Nombre cd;
    public Consul_Nombre_Control(Consul_Nombre obj) {
       cd = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(cd.jtnom)){
              Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){ // si no hay error de conexion a la bd, entonces ...
            cd.tablaC.setVisible(false); // ocultar el JTable
            System.out.println(cd.mt.getRowCount());
            //int cf = mt.getRowCount();
            while(cd.mt.getRowCount() > 0) { // obtener cuantas filas tiene el JTable
                cd.mt.removeRow(0); // eliminar todas las filas del JTable para mostrar nuevos resultados
            }
            System.out.println(cd.mt.getRowCount());
            String registros[][] = con.consultaMatriz("clientes", "nombre = '" + cd.jtnom.getText() + "'");
            if (registros != null) {
                cd.tablaC.setVisible(true); // mostrar el JTable                        
                for (int f = 0; f < registros.length; f++) {
                    /*for (int c = 0; c < registros[0].length; c++) {
                        System.out.print(registros[f][c] + " ");
                    }*/
                    cd.mt.addRow(registros[f]); // adicionar la fila al JTable
                    //System.out.println();
                }
            }
            
            con.desconectar(); // cerrar la conexion con la bd
        } cd.jtnom.setText("");
        }
        
        if(e.getSource().equals(cd.jbConsultar)){
              Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){ // si no hay error de conexion a la bd, entonces ...
            cd.tablaC.setVisible(false); // ocultar el JTable
            System.out.println(cd.mt.getRowCount());
            //int cf = mt.getRowCount();
            while(cd.mt.getRowCount() > 0) { // obtener cuantas filas tiene el JTable
                cd.mt.removeRow(0); // eliminar todas las filas del JTable para mostrar nuevos resultados
            }
            System.out.println(cd.mt.getRowCount());
            String registros[][] = con.consultaMatriz("clientes", "nombre = '" + cd.jtnom.getText() + "'");
            if (registros != null) {
                cd.tablaC.setVisible(true); // mostrar el JTable                        
                for (int f = 0; f < registros.length; f++) {
                    /*for (int c = 0; c < registros[0].length; c++) {
                        System.out.print(registros[f][c] + " ");
                    }*/
                    cd.mt.addRow(registros[f]); // adicionar la fila al JTable
                    //System.out.println();
                }
            }
            
            con.desconectar(); // cerrar la conexion con la bd
        }cd.jtnom.setText("");
        }
        
    }
    
}
