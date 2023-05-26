
package Vista;

import Controlador.CrearUsuario_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class CrearUsuario_Vista extends JFrame{
    
    public JLabel jlNombre, jlContraseña, jlCorreo, jlRol, jlTelefono, jlEstado;
    public JComboBox<String> jcRol;
    public JTextField jtNombre, jtContraseña, jtCorreo, jtTelefono, jtEstado;
    public JPasswordField jpContraseña;
    public JToggleButton jtVer;
    public JButton jbGuardar, jbCancelar;
    public ImageIcon ver, noVer;
    public VentanaPrincipal_Vista mp;

    public CrearUsuario_Vista(VentanaPrincipal_Vista obj){
        
        super("Crear Usuario");
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
        setResizable(false);
        
        CrearUsuario_Control ctrl = new CrearUsuario_Control(this);
        nombre(ctrl);
        contraseña(ctrl);
        correo(ctrl);
        telefono(ctrl);
        rol(ctrl);
        Guardar(ctrl);
        cancelar(ctrl);
    }
    
    public void nombre(CrearUsuario_Control obj){
        jlNombre = new JLabel("Nombre de usuario:");
        jlNombre.setBounds(100, 50, 200, 30);
        jlNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlNombre.setForeground(Color.WHITE);
        add(jlNombre);
        
        jtNombre = new JTextField();
        jtNombre.setBounds(300, 50, 170, 30);
        add(jtNombre);
    }
    
    public void contraseña(CrearUsuario_Control obj){
        ver = new ImageIcon(getClass().getResource("../Imagenes/Ver_Icon.png"));
        noVer = new ImageIcon(getClass().getResource("../Imagenes/NoVer_Icon.png"));
        
        jtVer = new JToggleButton(noVer);
        jtVer.setBounds(475, 100, 50, 30);
        jtVer.setBorderPainted(false);
        jtVer.setContentAreaFilled(false);
        jtVer.setFocusPainted(false);
        jtVer.addActionListener(obj);
        add(jtVer);
        
        jlContraseña = new JLabel("Contraseña:");
        jlContraseña.setBounds(100, 100, 200, 30);
        jlContraseña.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlContraseña.setForeground(Color.WHITE);
        add(jlContraseña);
        
        jpContraseña = new JPasswordField();
        jpContraseña.setBounds(300, 100, 170, 30);
        jpContraseña.setFont(new Font("Arial", WIDTH, 18));
        jpContraseña.setEchoChar('*');
        add(jpContraseña);
    }
    
    public void correo(CrearUsuario_Control obj){
        jlCorreo = new JLabel("Ingrese su correo:");
        jlCorreo.setBounds(100, 150, 200, 30);
        jlCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlCorreo.setForeground(Color.WHITE);
        add(jlCorreo);
        
        jtCorreo = new JTextField();
        jtCorreo.setBounds(300, 150, 170, 30);
        add(jtCorreo);
    }
    
    public void rol(CrearUsuario_Control obj){
        jlRol = new JLabel("Seleccionar un rol:");
        jlRol.setBounds(100, 250, 200, 30);
        jlRol.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlRol.setForeground(Color.WHITE);
        add(jlRol);
        
        jcRol = new JComboBox<>();
        jcRol.addItem("");
        jcRol.addItem("Administrador");
        jcRol.addItem("Usuario");
        jcRol.setBounds(300, 250, 170, 30);
        add(jcRol);
    }
    
    public void telefono(CrearUsuario_Control obj){
        jlTelefono = new JLabel("Telefono");
        jlTelefono.setBounds(100, 200, 200, 30);
        jlTelefono.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTelefono.setForeground(Color.WHITE);
        add(jlTelefono);
        
        jtTelefono = new JTextField();
        jtTelefono.setBounds(300, 200, 170, 30);
        add(jtTelefono);
        
    }
    
    public void Guardar(CrearUsuario_Control obj){
        
        
        jbGuardar = new JButton("Crear");
        jbGuardar.setBounds(100, 500, 200, 30);
        jbGuardar.addActionListener(obj);
        add(jbGuardar);
    }
    
    public void cancelar(CrearUsuario_Control obj){
        jbCancelar = new JButton("Cancelar");
        jbCancelar.setBounds(310, 500, 200, 30);
        jbCancelar.addActionListener(obj);
        add(jbCancelar);
    }
    
}
