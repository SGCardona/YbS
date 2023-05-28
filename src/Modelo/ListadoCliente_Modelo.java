
package Modelo;

import Entidades.Clientes_Entidad;
import Entidades.Vehiculo_Entidad;
import Vista.Listado_Vista;
import java.util.Vector;

public class ListadoCliente_Modelo {
    Listado_Vista ls;

    public ListadoCliente_Modelo(Listado_Vista obj) {
       ls = obj; 
    }
    public void addRegistrosCV(){//Crear tabla con registros de cliente y vehiculo
        
        ls.mt.removeRow(0);
        
        //System.out.println("Personas");
        for (int i = 0; i < ls.sub.mp.vp.listadoC.size(); i++) {
            Clientes_Entidad obj = ls.sub.mp.vp.listadoC.get(i);
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
            
            
            for(int c = 0; c < ls.sub.mp.vp.listadoV.size(); c++){
                if(c == i){
                    Vehiculo_Entidad vh = ls.sub.mp.vp.listadoV.get(c);
                    datos.add(vh.getPlaca());
                    datos.add(vh.getModelo());
                    datos.add(vh.getTipo());
                }           
            } 
            ls.mt.addRow(datos);
        }
    }
    public void addRegistrosC(){ //Crear tabla con registros de Cliente
        //ls.mt.removeRow(0);
        //System.out.println("Personas");
        for (int i = 0; i < ls.sub.mp.vp.listadoC.size(); i++) {
            Clientes_Entidad obj = ls.sub.mp.vp.listadoC.get(i);
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
            ls.mt.addRow(datos);
        }
    }
    public void addRegistrosV(){ //Crear tabla con registros de vehiculo
        //ls.mt.removeRow(0);
        for(int c = 0; c < ls.sub.mp.vp.listadoV.size(); c++){
            Vehiculo_Entidad vh = ls.sub.mp.vp.listadoV.get(c);
            Vector<String> datos = new Vector<>();
            datos.add(vh.getPlaca());
            datos.add(vh.getModelo());
            datos.add(vh.getTipo());
            ls.mt.addRow(datos);
        }      
    }
}
