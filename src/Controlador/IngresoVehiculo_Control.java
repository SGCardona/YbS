
package Controlador;

import Modelo.Clientes_Modelo;
import Vista.IngresoVehiculo_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IngresoVehiculo_Control  implements ActionListener{
    
    public IngresoVehiculo_Vista cl;

    public IngresoVehiculo_Control(IngresoVehiculo_Vista obj) {
        cl = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(cl.jbGuardar)){
            Clientes_Modelo cliente = new Clientes_Modelo(cl);
            cliente.gCliente();
            cliente.gVehiculo();
            cliente.gAfiliado();
            cl.ind.jtApellido.setText("");
            cl.ind.jtNombre.setText("");
            cl.ind.jtCedula.setText("");
            cl.ind.jtTelefono.setText("");
            cl.indv.jtModelo.setText("");
            cl.indv.jtPlaca.setText("");
            cl.indv.jcTipo.setSelectedIndex(-1);
        }
        if(e.getSource().equals(cl.jbVolver)){
            cl.setVisible(false);
            cl.dispose();
            cl.mp.setVisible(true);//me envia al inicio de todo para ingresar mi usuario
        }
        if(e.getSource().equals(cl.jbEntrada)){
            cl.ind.setVisible(true);
            cl.indv.setVisible(true);
        }
        if(e.getSource().equals(cl.jbSalida)){
            cl.ind.setVisible(false);
            cl.indv.setVisible(true);
            cl.indv.jtPlaca.setText("");
            cl.indv.jtModelo.setText("");
            cl.indv.jcTipo.setSelectedIndex(-1); 
        }  
    }
}
