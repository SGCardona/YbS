
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class InicioSesion_Vista extends JFrame{
    
    public JButton jbIniciar, jbCancelar;
    public JLabel jlTitulo, jlUsuario, jlPass;
    public JTextField jtUsuario;
    public JPasswordField jpPass;
    public JToggleButton tVer;
    public VentanaPrincipal_Vista vp;
    public ImageIcon ver, no_ver;

    public InicioSesion_Vista(VentanaPrincipal_Vista obj) {
        super("Crear Usuario");
        vp = obj;
        
        setSize(500,500);
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
        
        titulo();
        usuario();
        passw();
        iniciarSesion();
        cancelar(); 
    }
    
    public void iniciarSesion(){
        jbIniciar = new JButton("Iniciar sesion");
        jbIniciar.setBounds(150, 350, 200, 30);
//        jbIniciar.addActionListener(obj);
        add(jbIniciar);
    }
    
    public void cancelar(){
        jbCancelar = new JButton("Cancelar");
        jbCancelar.setBounds(150, 390, 200, 30);
//        jbCancelar.addActionListener(obj);
        add(jbCancelar);
    }
    
    public void titulo(){
        ImageIcon ima = new ImageIcon(getClass().getResource("../Imagenes/Login_icon.png"));
        jlTitulo = new JLabel("Inicio Sesion", ima, JLabel.CENTER);
        jlTitulo.setBounds(0, 0, 500, 150);
        jlTitulo.setFont(new Font("tahoma", Font.BOLD, 20));
        jlTitulo.setOpaque(true);
        add(jlTitulo);
    }
    
    public void usuario(){
        jlUsuario = new JLabel("Usuario");
        jlUsuario.setBounds(100, 200, 100, 30);
//        jlUsuario.setBorder(new LineBorder(Color.RED));
        jlUsuario.setFont(new Font("tahoma", Font.BOLD, 20));
        jlUsuario.setForeground(Color.WHITE);
        add(jlUsuario);
        
        jtUsuario = new JTextField();
        jtUsuario.setBounds(210, 200, 150, 30);
        add(jtUsuario); 
    }
    
    public void passw(){
        ver = new ImageIcon(getClass().getResource("../Imagenes/Ver_Icon.png"));
        no_ver = new ImageIcon(getClass().getResource("../Imagenes/NoVer_Icon.png"));
        
        tVer = new JToggleButton(no_ver);
        tVer.setBounds(360, 240, 50, 30);
        tVer.setBorderPainted(false);
        tVer.setContentAreaFilled(false);
        tVer.setFocusPainted(false);
        add(tVer);
        
        jlPass = new JLabel("Password");
        jlPass.setBounds(100, 240, 100, 30);
        jlPass.setFont(new Font("tahoma", Font.BOLD, 20));
        jlPass.setForeground(Color.WHITE);
        add(jlPass);
        
        jpPass = new JPasswordField();
        jpPass.setBounds(210, 240, 150, 30);
        jpPass.setEchoChar('*');
        add(jpPass);
    }
    
    public static void main(String[] args) {
        InicioSesion_Vista is = new InicioSesion_Vista(null);
    }
    
}
