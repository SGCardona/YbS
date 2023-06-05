
package Vista;

import Controlador.IngresoVehiculo_Control;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class JPIngCliente_Vista extends JPanel{
    
    public JTextField jtNombre, jtApellido, jtTelefono, jtCedula;
    public JLabel jlNombre, jlApellido, jlTelefono, jlCedula;
    public IngresoVehiculo_Vista ivc;
    
    
    //public IngresoVehiculo_Control ivc;
    
    public JPIngCliente_Vista(IngresoVehiculo_Vista obj){
        ivc = obj;
        setBounds(40, 270, 510, 210);
        setOpaque(false);
        TitledBorder border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Datos del cliente");
        border.setTitleColor(Color.WHITE);
        setBorder(border);
        setLayout(null);
        crearGUI();
        setVisible(false);
    }

    private void crearGUI() {
        nombre();
        apellido();
        telefono();
        cedula();
    }
    
    public void nombre(){
        jlNombre = new JLabel("Nombre");
        jlNombre.setBounds(80, 5, 200, 50);
        jlNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlNombre.setForeground(Color.WHITE);
        add(jlNombre);
        
        jtNombre = new JTextField();
        jtNombre.setBounds(280, 15, 170, 30);
        add(jtNombre);
    }
    
    public void apellido(){
        jlApellido = new JLabel("Apellido");
        jlApellido.setBounds(80, 55, 200, 50);
        jlApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlApellido.setForeground(Color.WHITE);
        add(jlApellido);
        
        jtApellido = new JTextField();
        jtApellido.setBounds(280, 65, 170, 30);
        add(jtApellido);
    }
    
    public void telefono(){
        jlTelefono = new JLabel("Telefono");
        jlTelefono.setBounds(80, 115, 200, 30);
        jlTelefono.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTelefono.setForeground(Color.WHITE);
        add(jlTelefono);
        
        jtTelefono = new JTextField();
        jtTelefono.setBounds(280, 115, 170, 30);
        add(jtTelefono);
        
    }
    
    public void cedula(){
        jlCedula = new JLabel("Cedula");
        jlCedula.setBounds(80, 165, 200, 30);
        jlCedula.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlCedula.setForeground(Color.WHITE);
        add(jlCedula);
        
        jtCedula = new JTextField();
        jtCedula.setBounds(280, 165, 170, 30);
        add(jtCedula);
    }
}
