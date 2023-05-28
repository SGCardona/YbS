
package Modelo;

import Entidades.Vehiculo_Entidad;
import Vista.InDClientes_Vista;

public class Vehiculo_Modelo {
    
    public InDClientes_Vista clv;

    public Vehiculo_Modelo(InDClientes_Vista obj) {
    
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
