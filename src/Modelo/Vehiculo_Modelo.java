
package Modelo;

import Entidades.Vehiculo_Entidad;
import Vista.Clientes_Vista;

public class Vehiculo_Modelo {
    
    public Clientes_Vista clv;

    public Vehiculo_Modelo(Clientes_Vista obj) {
    
        clv = obj;
    
    }
    
    public void guardar(){
        
        String placa = clv.jtPlaca.getText();
        String modelo = clv.jtModelo.getText();
        String tipo = clv.jtTipo.getText();
        
        Vehiculo_Entidad entidad = new Vehiculo_Entidad(modelo, placa, tipo);
        clv.mp.listaVehiculo.add(entidad);
    } 
    
    
    
}
