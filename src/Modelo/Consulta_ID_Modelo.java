
package Modelo;
import Entidades.Clientes_Entidad;
import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.SubMenuConsultas_Vista;

public class Consulta_ID_Modelo {
    
    
     public void evento_jbConsultar(){ // Ventas x cliente     
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){ // si no hay error de conexion a la bd, entonces ...
            //jsTabla.setVisible(false); // ocultar el JTable
           // System.out.println(mt.getRowCount());
            //int cf = mt.getRowCount();
           // while(mt.getRowCount() > 0) { // obtener cuantas filas tiene el JTable
                //mt.removeRow(0); // eliminar todas las filas del JTable para mostrar nuevos resultados
            }
           // System.out.println(mt.getRowCount());
            //String registros[][] = con.consultaMatriz("ventas", "num_id = '" + jtNumID.getText() + "'");
            //if (registros != null) {
                //jsTabla.setVisible(true); // mostrar el JTable                        
                //for (int f = 0; f < registros.length; f++) {
                    /*for (int c = 0; c < registros[0].length; c++) {
                        System.out.print(registros[f][c] + " ");
                    }*/
                    //mt.addRow(registros[f]); // adicionar la fila al JTable
                    //System.out.println();
                }
            }
            
           // con.desconectar(); // cerrar la conexion con la bd
      //  } // fin if(!error)

