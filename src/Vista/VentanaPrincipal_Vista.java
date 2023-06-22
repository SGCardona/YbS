
package Vista;

import Controlador.VenatanaPrincipal_Control;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal_Vista extends JFrame{
    
    public JButton jbCrear, jbEntrada, jbSalida;
    public ArrayList <String> listaAfiliado = new ArrayList<>();
    public ArrayList <String> listaCliente = new ArrayList<>();
    public ArrayList <String> listaNoAfiliado = new ArrayList<>();
    public ArrayList <String> listaVehiculo = new ArrayList<>();
    public ArrayList <String> listaUsuarios = new ArrayList<>();
    public JLabel jlLogo;
    //public ArrayList <String> listaClienteVehiculo = new ArrayList<>();


    public VentanaPrincipal_Vista(){   
        super("YBS Parking");
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

        //ImageIcon ImgLogo = new ImageIcon(getClass().getResource("../imagenes/YBSparking.png"));
        ImageIcon ImgLogo = new ImageIcon(getClass().getResource("../imagenes/YBSparkingSinFondo.png"));
        jlLogo = new JLabel(ImgLogo);
        jlLogo.setBounds(100, 25, 400, 400);
        add(jlLogo);
        
        VenatanaPrincipal_Control ctrl = new VenatanaPrincipal_Control(this);
        iniciarSesion(ctrl);// Boton mostrar ventana InicioSesion
        salida(ctrl);//Boton salir de la app
        crearCuenta(ctrl);//Boton mostrar ventana CrearUsuario
    }
    public void iniciarSesion(VenatanaPrincipal_Control obj){
        jbEntrada = new JButton("Iniciar sesion");
        jbEntrada.setBounds(95, 450, 200, 25);
        jbEntrada.addActionListener(obj);
        add(jbEntrada);
    }
    public void crearCuenta(VenatanaPrincipal_Control obj){
        jbCrear = new JButton("Crear cuenta");
        jbCrear.setBounds(305, 450, 200, 25);
        jbCrear.addActionListener(obj);
        add(jbCrear);
    }
    public void salida(VenatanaPrincipal_Control obj){
        jbSalida = new JButton("Salida");
        jbSalida.setBounds(200, 480, 200, 25);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
}
