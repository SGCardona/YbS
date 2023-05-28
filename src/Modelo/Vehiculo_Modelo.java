
package Modelo;

import Entidades.Vehiculo_Entidad;
import Vista.InDClientes_Vista;

public class Vehiculo_Modelo implements DatosConexion{
    
    public InDClientes_Vista clv;

    public Vehiculo_Modelo(InDClientes_Vista obj) {
        clv = obj;
    }
    
    public void guardar(){  
        String placa = clv.jtPlaca.getText();
        String modelo = clv.jtModelo.getText();
        String tipo = clv.jtTipo.getText();
        Vehiculo_Entidad entidad = new Vehiculo_Entidad(modelo, placa, tipo,"","");
        clv.mp.listadoV.add(entidad);
        
        clv.mp.listaVehiculo.add(clv.jtPlaca.getText());
        clv.mp.listaVehiculo.add(clv.jtModelo.getText());
        clv.mp.listaVehiculo.add(clv.jtTipo.getText());
        clv.mp.listaVehiculo.add("1");
        clv.mp.listaVehiculo.add("2");
        Conexion con = new Conexion();
        boolean error = con.conectarMySQL(baseDatos, user, login, host);
        if(!error){
            con.insertar("vehiculos",clv.mp.listaVehiculo);
            con.desconectar();
        }
    } 
    
    
    
}
