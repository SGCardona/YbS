
package Vista;

import Controlador.Clientes_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Clientes_Vista extends JFrame{
    
    public JTextField jtNombre, jtApellido, jtTelefono, jtCedula, jtPlaca, jtModelo, jtTipo;
    public JLabel jlNombre, jlApellido, jlTelefono, jlCedula, jlPlaca, jlModelo, jlTipo;
    public JButton jbGuardar, jbVolver;
    public VentanaPrincipal_Vista mp;

    public Clientes_Vista(VentanaPrincipal_Vista obj) {
        super("Clientes");
        mp = obj;
        
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(null);
        GUI();
        setVisible(true);
    }
    
    public void GUI(){
        
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        
        nombre();
        apellido();
        telefono();
        cedula();
        placa();
        modelo();
        tipo();
        Guardar();
        
    }
    
    public void Guardar(){
        Clientes_Control ctrl = new Clientes_Control(this);
        
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(100, 500, 200, 30);
        jbGuardar.addActionListener(ctrl);
        add(jbGuardar);
        
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(310, 500, 200, 30);
        jbVolver.addActionListener(ctrl);
        add(jbVolver);
        
    }
    
    public void nombre(){
        jlNombre = new JLabel("Nombre");
        jlNombre.setBounds(100, 40, 200, 50);
        jlNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlNombre.setForeground(Color.WHITE);
        add(jlNombre);
        
        jtNombre = new JTextField();
        jtNombre.setBounds(300, 50, 170, 30);
        add(jtNombre);
    }
    
    public void apellido(){
        jlApellido = new JLabel("Apellido");
        jlApellido.setBounds(100, 90, 200, 50);
        jlApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlApellido.setForeground(Color.WHITE);
        add(jlApellido);
        
        jtApellido = new JTextField();
        jtApellido.setBounds(300, 100, 170, 30);
        add(jtApellido);
    }
    
    public void telefono(){
        jlTelefono = new JLabel("Telefono");
        jlTelefono.setBounds(100, 150, 200, 30);
        jlTelefono.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTelefono.setForeground(Color.WHITE);
        add(jlTelefono);
        
        jtTelefono = new JTextField();
        jtTelefono.setBounds(300, 150, 170, 30);
        add(jtTelefono);
        
    }
    
    public void cedula(){
        jlCedula = new JLabel("Cedula");
        jlCedula.setBounds(100, 200, 200, 30);
        jlCedula.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlCedula.setForeground(Color.WHITE);
        add(jlCedula);
        
        jtCedula = new JTextField();
        jtCedula.setBounds(300, 200, 170, 30);
        add(jtCedula);
    }
    
    public void placa(){
        jlPlaca = new JLabel("Placa del vehiculo");
        jlPlaca.setBounds(100, 250, 200, 30);
        jlPlaca.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlPlaca.setForeground(Color.WHITE);
        add(jlPlaca);
        
        jtPlaca = new JTextField();
        jtPlaca.setBounds(300, 250, 170, 30);
        add(jtPlaca);
    }
    
    public void modelo(){
        jlModelo = new JLabel("Modelo del vehiculo");
        jlModelo.setBounds(100, 300, 200, 30);
        jlModelo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlModelo.setForeground(Color.WHITE);
        add(jlModelo);
        
        jtModelo = new JTextField();
        jtModelo.setBounds(300, 300, 170, 30);
        add(jtModelo);
    }
    
    public void tipo(){
        jlTipo = new JLabel("Tipo de vehiculo");
        jlTipo.setBounds(100, 350, 200, 30);
        jlTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTipo.setForeground(Color.WHITE);
        add(jlTipo);
        
        jtTipo = new JTextField();
        jtTipo.setBounds(300, 350, 170, 30);
        add(jtTipo);
    }
    
    
    
    
}
