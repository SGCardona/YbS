
package Controlador;

import Modelo.Clientes_Modelo;
import Modelo.Vehiculo_Modelo;
import Vista.InDClientes_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InDClientes_Control  implements ActionListener{
    
    public InDClientes_Vista cl;

    public InDClientes_Control(InDClientes_Vista cl) {
        this.cl = cl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(cl.jbGuardar)){
            Clientes_Modelo cliente = new Clientes_Modelo(cl);
            cliente.guardar();
            Vehiculo_Modelo vehiculo = new Vehiculo_Modelo(cl);
            vehiculo.guardar();
            cl.jtApellido.setText("");
            cl.jtNombre.setText("");
            cl.jtCedula.setText("");
            cl.jtModelo.setText("");
            cl.jtPlaca.setText("");
            cl.jtTelefono.setText("");
            cl.jtTipo.setText("");
        }
        if(e.getSource().equals(cl.jbVolver)){
            cl.setVisible(false);
            cl.dispose();
            cl.mp.setVisible(true);
        }
        
    }
    
    

    
    
    
    
}
