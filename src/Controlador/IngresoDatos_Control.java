
package Controlador;

import Modelo.Clientes_Modelo;
import Vista.IngresoDatos_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class IngresoDatos_Control  implements ActionListener{
    
    public IngresoDatos_Vista cl;

    public IngresoDatos_Control(IngresoDatos_Vista obj) {
        cl = obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(cl.jbAfiliar)){
            cl.inv.jtPlaca.setText("");
            cl.inv.jtModelo.setText("");
            cl.inv.jcTipo.setSelectedItem(null);
            cl.inv.jcHora.setSelectedItem(null);
            cl.inv.jcMinutos.setSelectedItem(null);
            cl.inc.jtCedula.setText("");
            cl.inc.jtNombre.setText("");
            cl.inc.jtApellido.setText("");
            cl.inc.jtTelefono.setText("");
            
            cl.inv.setVisible(true);
            cl.inc.setVisible(true);
            cl.inc.setLocation(300, 270);
            cl.inv.setLocation(300, 50);
            cl.inv.jtModelo.setEditable(true);
            cl.inv.jcTipo.setEnabled(true);
            cl.inc.jtNombre.setEditable(true);
            cl.inc.jtApellido.setEditable(true);
            cl.inc.jtTelefono.setEditable(true);
            cl.inc.jtCedula.setEditable(true);
            cl.jbConsulta.setVisible(false);
            cl.jbGuardar.setVisible(true);
            cl.num = 1;
        }
        if(e.getSource().equals(cl.jbAnadir)){
            cl.num = 2;
            cl.inv.jtPlaca.setText("");
            cl.inv.jtModelo.setText("");
            cl.inv.jcTipo.setSelectedItem(null);
            cl.inv.jcHora.setSelectedItem(null);
            cl.inv.jcMinutos.setSelectedItem(null);
            cl.inc.jtCedula.setText("");
            cl.inc.jtNombre.setText("");
            cl.inc.jtApellido.setText("");
            cl.inc.jtTelefono.setText("");
            
            cl.jbConsulta.setVisible(true);
            cl.jbGuardar.setVisible(false);
            cl.inv.setVisible(false);
            cl.inc.setVisible(true);
            cl.inc.setLocation(300, 50);
            cl.inc.jtNombre.setEditable(false);
            cl.inc.jtApellido.setEditable(false);
            cl.inc.jtTelefono.setEditable(false);
        }
        if(e.getSource().equals(cl.jbIngreso)){
            cl.jbConsulta.setVisible(true);
            cl.jbGuardar.setVisible(false);
            cl.inv.setVisible(true);
            cl.inc.setVisible(false);
            cl.inc.setLocation(300, 270);
            cl.inv.setLocation(300, 50);
            cl.num = 7;
            cl.inv.jtPlaca.setText("");
            cl.inv.jtModelo.setText("");
            cl.inv.jcTipo.setSelectedItem(null);
            cl.inv.jcHora.setSelectedItem(null);
            cl.inv.jcMinutos.setSelectedItem(null);
            
            cl.inv.jtModelo.setEditable(false);
            cl.inv.jcTipo.setEnabled(false);
        }
        if(e.getSource().equals(cl.jbSalidaV)){
            cl.inv.jtPlaca.setText("");
            cl.inv.jtModelo.setText("");
            cl.inv.jcTipo.setSelectedItem(null);
            cl.inv.jcHora.setSelectedItem(null);
            cl.inv.jcMinutos.setSelectedItem(null);
            cl.inc.jtCedula.setText("");
            cl.inc.jtNombre.setText("");
            cl.inc.jtApellido.setText("");
            cl.inc.jtTelefono.setText("");
            
            cl.jbConsulta.setVisible(true);
            cl.jbGuardar.setVisible(false);
            cl.inv.setVisible(true);
            cl.inc.setVisible(false);
            cl.inc.jtNombre.setEditable(false);
            cl.inc.jtApellido.setEditable(false);
            cl.inc.jtTelefono.setEditable(false);
            cl.inc.jtCedula.setEditable(false);
            cl.inv.jtModelo.setEditable(false);
            cl.inv.jcTipo.setEnabled(false);
            cl.num = 6;
        }
        if(e.getSource().equals(cl.jbConsulta)){
            Clientes_Modelo clm = new Clientes_Modelo(cl);
            switch (cl.num) {
                case 2: String nom = clm.filtrar("cliente", "nombre", "cedula = '" + cl.inc.jtCedula.getText() + "'");
                        String ape = clm.filtrar("cliente", "apellido", "cedula = '" + cl.inc.jtCedula.getText() + "'");
                        String tel = clm.filtrar("cliente", "telefono", "cedula = '" + cl.inc.jtCedula.getText() + "'");
                        if("".equals(nom)){
                            JOptionPane.showMessageDialog(null, "El numero de ID " + cl.inc.jtCedula.getText() + " no se encuntra registrado " );
                        } else {
                            cl.inv.setVisible(true);
                            cl.jbGuardar.setVisible(true);
                            cl.inc.jtNombre.setText(nom);
                            cl.inc.jtApellido.setText(ape);
                            cl.inc.jtTelefono.setText(tel);
                            cl.inv.setLocation(300, 270);
                            cl.num = 2;
                        }
                    break;//fin case 2
                    
                case 6: String modelo = clm.filtrar("vehiculo","modelo" , "placa = '"+ cl.inv.jtPlaca.getText() +"'");
                        String vehiculo = clm.filtrar("vehiculo","vehiculo" , "placa = '"+ cl.inv.jtPlaca.getText() +"'");
                        String cedula = clm.filtrar("vehiculo", "cedula", "placa = '" + cl.inv.jtPlaca.getText() + "'");
                        String nombre = clm.filtrar("cliente", "nombre", "cedula = '" + cedula + "'");
                        String apellido = clm.filtrar("cliente", "apellido", "cedula = '" + cedula + "'");
                        String cel = clm.filtrar("cliente", "telefono", "cedula = '" + cedula + "'"); 
                        if("".equals(cedula)){
                            JOptionPane.showMessageDialog(null, "La placa "+ cl.inv.jtPlaca.getText() + " no se encuentra registrada", "Error", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            if(clm.validarS("afiliado")){
                                cl.num = 4;
                                cl.inc.setVisible(true);
                                cl.jbGuardar.setVisible(true);
                                cl.inc.jtNombre.setText(nombre);
                                cl.inc.jtApellido.setText(apellido);
                                cl.inc.jtTelefono.setText(cel);
                                cl.inc.jtCedula.setText(cedula);
                                cl.inv.jtModelo.setText(modelo);
                                if (vehiculo.equals("AUTOMOVIL")) {
                                    cl.inv.jcTipo.setSelectedItem("AUTOMOVIL");
                                } else{
                                    cl.inv.jcTipo.setSelectedItem("MOTOCICLETA");
                                }
                            }else{
                                cl.inv.jtPlaca.setText("");
                                JOptionPane.showMessageDialog(null, "El vehiculo con placa "+ cl.inv.jtPlaca.getText() + " ya realizo la salida", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    break;//fin case 6
                    
                    case 7: String mod = clm.filtrar("vehiculo","modelo" , "placa = '"+ cl.inv.jtPlaca.getText() +"'");
                            String veh = clm.filtrar("vehiculo","vehiculo" , "placa = '"+ cl.inv.jtPlaca.getText() +"'");
                            if(!clm.validarS("afiliado")){
                                cl.num = 3;
                                cl.jbGuardar.setVisible(true);
                                cl.inv.jtModelo.setText(mod);
                                if (veh.equals("AUTOMOVIL")) {
                                    cl.inv.jcTipo.setSelectedItem("AUTOMOVIL");
                                } else{
                                    cl.inv.jcTipo.setSelectedItem("MOTOCICLETA");
                                }
                            }else{
                                cl.inv.jtPlaca.setText("");
                                JOptionPane.showMessageDialog(null, "El vehiculo con placa "+ cl.inv.jtPlaca.getText() + " aun no realizo la salida", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                            }
                    break;//fin case 7
            } 
        }
        if(e.getSource().equals(cl.jbGuardar)){
            Clientes_Modelo clm = new Clientes_Modelo(cl);
            switch (cl.num) {
                case 1:if(clm.espacioB()){
                        if(clm.gCliente()){
                            if(clm.gVehiculo()){
                                clm.gAfiliado();
                                int num = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro vehiculo?", "Confirmacion",JOptionPane.YES_NO_OPTION);
                                if(num == 0){
                                    cl.inv.jtPlaca.setText("");
                                    cl.inv.jtModelo.setText("");
                                    cl.inv.jcTipo.setSelectedItem(null);
                                    cl.inv.jcHora.setSelectedItem(null);
                                    cl.inv.jcMinutos.setSelectedItem(null);
                                    cl.num = 5;
                                }
                                if(num == 1){
                                    JOptionPane.showMessageDialog(null, "Vehiculo ingresado correctamente");
                                    cl.inv.jtPlaca.setText("");
                                    cl.inv.jtModelo.setText("");
                                    cl.inv.jcTipo.setSelectedItem(null);
                                    cl.inv.jcHora.setSelectedItem(null);
                                    cl.inv.jcMinutos.setSelectedItem(null);
                                    cl.inc.jtCedula.setText("");
                                    cl.inc.jtNombre.setText("");
                                    cl.inc.jtApellido.setText("");
                                    cl.inc.jtTelefono.setText("");
                                } 
                            }
                        }
                    }
                         
                break;//fin case 1
                
                case 2: if(clm.gVehiculo())clm.gAfiliado();
                break;//fin case 2
                
                case 3:clm.gAfiliado();
                       cl.inv.jtPlaca.setText("");
                       cl.inv.jtModelo.setText("");
                       cl.inv.jcTipo.setSelectedItem(null);
                       cl.inv.jcHora.setSelectedItem(null);
                       cl.inv.jcMinutos.setSelectedItem(null);
                break;//fin case 3
                
                case 4: clm.gSalida("afiliado");
                        cl.inv.jtPlaca.setText("");
                        cl.inv.jtModelo.setText("");
                        cl.inv.jcTipo.setSelectedItem(null);
                        cl.inv.jcHora.setSelectedItem(null);
                        cl.inv.jcMinutos.setSelectedItem(null);
                        cl.inc.jtCedula.setText("");
                        cl.inc.jtNombre.setText("");
                        cl.inc.jtApellido.setText("");
                        cl.inc.jtTelefono.setText("");
                break;//fin case 4
                
                case 5:if(clm.gVehiculo())JOptionPane.showMessageDialog(null, "Vehiculos Ingresados Correctamente");; 
                break;//fin case 5
            }
        }
        if(e.getSource().equals(cl.jbSalida)){
            cl.setVisible(false);
            cl.dispose();
            cl.ing.setVisible(true);
        }
    }
}
