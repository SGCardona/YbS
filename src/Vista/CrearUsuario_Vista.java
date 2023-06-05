
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
    public VentanaPrincipal_Vista vp;

    public CrearUsuario_Vista(VentanaPrincipal_Vista obj){
        
        super("Crear Usuario");
        vp = obj;
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        jlNombre.setBounds(50, 50, 200, 30);
        jlNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlNombre.setForeground(Color.WHITE);
        add(jlNombre);
        
        jtNombre = new JTextField();
        jtNombre.setBounds(250, 50, 230, 30);
        add(jtNombre);
    }
    
    public void contraseña(CrearUsuario_Control obj){
        ver = new ImageIcon(getClass().getResource("../Imagenes/Ver_Icon.png"));
        noVer = new ImageIcon(getClass().getResource("../Imagenes/NoVer_Icon.png"));
        
        jtVer = new JToggleButton(noVer);
        jtVer.setBounds(480, 110, 50, 30);
        jtVer.setBorderPainted(false);
        jtVer.setContentAreaFilled(false);
        jtVer.setFocusPainted(false);
        jtVer.addActionListener(obj);
        add(jtVer);
        
        jlContraseña = new JLabel("Contraseña:");
        jlContraseña.setBounds(50, 110, 200, 30);
        jlContraseña.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlContraseña.setForeground(Color.WHITE);
        add(jlContraseña);
        
        jpContraseña = new JPasswordField();
        jpContraseña.setBounds(250, 110, 230, 30);
        jpContraseña.setFont(new Font("Tahoma", WIDTH, 18));
        jpContraseña.setEchoChar('*');
        add(jpContraseña);
    }
    
    public void correo(CrearUsuario_Control obj){
        jlCorreo = new JLabel("Correo electronico:");
        jlCorreo.setBounds(50, 170, 200, 30);
        jlCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlCorreo.setForeground(Color.WHITE);
        add(jlCorreo);
        
        jtCorreo = new JTextField();
        jtCorreo.setBounds(250, 170, 230, 30);
        add(jtCorreo);
    }
    public void telefono(CrearUsuario_Control obj){
        jlTelefono = new JLabel("Telefono:");
        jlTelefono.setBounds(50, 230, 200, 30);
        jlTelefono.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTelefono.setForeground(Color.WHITE);
        add(jlTelefono);
        
        jtTelefono = new JTextField();
        jtTelefono.setBounds(250, 230, 230, 30);
        add(jtTelefono);
    }
    public void rol(CrearUsuario_Control obj){
        jlRol = new JLabel("Seleccion de rol:");
        jlRol.setBounds(50, 300, 200, 30);
        jlRol.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlRol.setForeground(Color.WHITE);
        add(jlRol);
        
        jcRol = new JComboBox<>();
        jcRol.setPrototypeDisplayValue("");
        jcRol.addItem("Administrador");
        jcRol.addItem("Usuario");
        jcRol.setSelectedIndex(-1);
        jcRol.setBounds(250, 300, 230, 30);
        add(jcRol);
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
    
    public static void main(String[] args) {
        CrearUsuario_Vista obj = new CrearUsuario_Vista(null);
    }
    
}
