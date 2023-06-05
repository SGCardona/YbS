
package Modelo;

import Entidades.Usuarios_Entidad;
import Vista.ListadoUsuarios_Vista;
import java.util.Vector;

public class ListadoUsuarios_Modelo {
    
    public ListadoUsuarios_Vista lsv;

    public ListadoUsuarios_Modelo(ListadoUsuarios_Vista lsv) {
        this.lsv = lsv;
    }
    
    public void addRegistros(){
        
        lsv.mt.removeRow(0);
        
        //System.out.println("Personas");
        for (int i = 0; i < lsv.mp.listadoU.size(); i++) {
            Usuarios_Entidad obj = lsv.mp.listadoU.get(i);
            /*Object datos[] = new Object[4];
            datos[0] = obj.getApellido();
            datos[1] = obj.getNombre();
            datos[2] = obj.getTel();
            datos[3] = obj.getCed();*/
            Vector<String> datos = new Vector<>();
            datos.add(obj.getNombre());
            datos.add(obj.getContraseña());
            datos.add(obj.getCorreo());
            datos.add(obj.getTelefono()); 
            datos.add(obj.getRol()); 
            lsv.mt.addRow(datos);
        }
    } 
    
}
