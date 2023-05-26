
package Modelo;

import Entidades.Clientes_Entidad;
import Entidades.Vehiculo_Entidad;
import Vista.Listado_Vista;
import java.util.Vector;

public class Listado_Modelo {
    Listado_Vista ls;

    public Listado_Modelo(Listado_Vista obj) {
       ls = obj; 
    }
    
    public void addRegistros(){
        
        ls.mt.removeRow(0);
        
        //System.out.println("Personas");
        for (int i = 0; i < ls.mp.listaCliente.size(); i++) {
            Clientes_Entidad obj = ls.mp.listaCliente.get(i);
            /*Object datos[] = new Object[4];
            datos[0] = obj.getApellido();
            datos[1] = obj.getNombre();
            datos[2] = obj.getTel();
            datos[3] = obj.getCed();*/
            Vector<String> datos = new Vector<>();
            datos.add(obj.getApellido());
            datos.add(obj.getNombre());
            datos.add(obj.getTel());
            datos.add(obj.getCed());
            
            
            for(int c = 0; c < ls.mp.listaVehiculo.size(); c++){
                if(c == i){
                    Vehiculo_Entidad vh = ls.mp.listaVehiculo.get(c);
                    datos.add(vh.getPlaca());
                    datos.add(vh.getModelo());
                    datos.add(vh.getTipo());
                }           
            } 
            ls.mt.addRow(datos);
        }
    }    
}
