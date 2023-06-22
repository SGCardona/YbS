
package Controlador;

import Modelo.Clientes_Modelo;
import Vista.IngresoDatos_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IngresoDatos_Control  implements ActionListener{
    
    public IngresoDatos_Vista cl;

    public IngresoDatos_Control(IngresoDatos_Vista obj) {
        cl = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(cl.jbGuardar)){
            Clientes_Modelo cliente = new Clientes_Modelo(cl);
            cliente.gCliente();
            cliente.gVehiculo();
            cliente.gAfiliado();
            cl.inc.jtApellido.setText("");
            cl.inc.jtNombre.setText("");
            cl.inc.jtCedula.setText("");
            cl.inc.jtTelefono.setText("");
            cl.inv.jtModelo.setText("");
            cl.inv.jtPlaca.setText("");
            cl.inv.jcTipo.setSelectedIndex(-1);
        }
        if(e.getSource().equals(cl.jbVolver)){
            cl.setVisible(false);
            cl.dispose();
            cl.mp.setVisible(true);
        }
        if(e.getSource().equals(cl.jbEntrada)){
            cl.inc.setVisible(true);
            cl.inv.setVisible(true);
        }
        if(e.getSource().equals(cl.jbSalida)){
            cl.inc.setVisible(false);
            cl.inv.setVisible(true);
            cl.inv.setSize(500, 500);
            cl.inv.jtModelo.setVisible(false);
            cl.inv.jlModelo.setVisible(false);
            cl.inv.jcTipo.setVisible(false);
            cl.inv.jlTipo.setVisible(false);
            cl.jbGuardar.setVisible(false);
            cl.jbconsulta.setVisible(true);
            cl.inv.JdEntrada.setVisible(false);
            cl.inv.jdSalida.setVisible(false);
            cl.inv.jcHora.setVisible(false);
            cl.inv.jcMinutos.setVisible(false);
            cl.inv.jcHoraS.setVisible(false);
            cl.inv.jcMinutoS.setVisible(false);
            cl.inv.jlFecha.setVisible(false);
            cl.inv.jlHora.setVisible(false);
            cl.inv.jl.setVisible(false);
            cl.inv.jtPlaca.setText("");
        }
        if(e.getSource().equals(cl.jbconsulta)){
            Clientes_Modelo cli = new Clientes_Modelo(cl);
            if(cli.validarS()){
                cl.inv.jlFecha.setVisible(true);
                cl.inv.jdSalida.setVisible(true);
                cl.inv.jlHora.setVisible(true);
                cl.inv.jcHoraS.setVisible(true);
                cl.inv.jl.setVisible(true);
                cl.inv.jcMinutoS.setVisible(true);
                
            }
        }     
    }
}
