
package Modelo;

import Entidades.Clientes_Entidad;
import Vista.InDClientes_Vista;


public class Clientes_Modelo {
    
    public InDClientes_Vista cl;

    public Clientes_Modelo(InDClientes_Vista obj) {
        cl = obj;
    }
    
    public void guardar(){
        String nom = cl.jtNombre.getText();
        String ape = cl.jtApellido.getText();
        String tel = cl.jtTelefono.getText();
        String ced = cl.jtCedula.getText();
        Clientes_Entidad entidad = new Clientes_Entidad(nom, ape, tel, ced);
        cl.mp.listaCliente.add(entidad);
    }
    
    
    
}
