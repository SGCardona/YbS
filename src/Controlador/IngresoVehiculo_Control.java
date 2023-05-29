
package Controlador;

import Modelo.Clientes_Modelo;
import Modelo.Vehiculo_Modelo;
import Vista.IngresoVehiculo_Vista;
import Vista.MenuPrincipal_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IngresoVehiculo_Control  implements ActionListener{
    
    public IngresoVehiculo_Vista cl;
    public MenuPrincipal_Vista mpv;
    

    public IngresoVehiculo_Control(IngresoVehiculo_Vista cl) {
        this.cl = cl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(cl.jbGuardar)){
            Clientes_Modelo cliente = new Clientes_Modelo(cl);
            cliente.guardar();
            Vehiculo_Modelo vehiculo = new Vehiculo_Modelo(cl);
            vehiculo.guardar();
            //cl.jpDatosCliente.jtApellido.setText("");
            
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
            //mpv.ivv.setVisible(true); no funciono, cierra la app
            //mpv.setVisible(true); no funciono, cierra la app
            //no encuentro un boton que llame directamente al menupricipal vista
            cl.mp.setVisible(true);//me envia al inicio de todo para ingresar mi usuario
        }
        if(e.getSource().equals(cl.jbEntrada)){
            cl.ind.setVisible(true);
            cl.indv.setVisible(true);
            cl.indv.jlHoraEntrada.setVisible(true);
            cl.indv.jtHoraEntrada.setVisible(true);
            cl.indv.jlHoraSalida.setVisible(false);
            cl.indv.jtHoraSalida.setVisible(false);
            /*cl.dispose();
            cl.mp.setVisible(true);*/
        }
        if(e.getSource().equals(cl.jbSalida)){
            cl.ind.setVisible(false);
            cl.indv.setVisible(true);
            cl.indv.jtPlaca.setText("");
            cl.indv.jtModelo.setText("");
            cl.indv.jcTipo.setSelectedIndex(0);
            cl.indv.jlHoraEntrada.setVisible(false);
            cl.indv.jtHoraEntrada.setVisible(false);
            cl.indv.jlHoraSalida.setVisible(true);
            cl.indv.jtHoraSalida.setVisible(true);
            
        }
        
    }
    
}
