
package Vista;

import Controlador.VenatanaPrincipal_Control;
import Entidades.Clientes_Entidad;
import Entidades.Usuarios_Entidad;
import Entidades.Vehiculo_Entidad;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal_Vista extends JFrame{
    
    public JButton jbCrear, jbEntrada, jbListar;
    public ArrayList <Clientes_Entidad> listaCliente = new ArrayList<>();
    public ArrayList <Vehiculo_Entidad> listaVehiculo = new ArrayList<>();
    public ArrayList <Usuarios_Entidad> listaUsuarios = new ArrayList<>();

    public VentanaPrincipal_Vista(){
        
        super("Menu Principal");
        
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
        
        VenatanaPrincipal_Control ctrl = new VenatanaPrincipal_Control(this);
        iniciarSesion(ctrl);
        salida(ctrl);
        crearCuenta(ctrl);
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
        jbListar = new JButton("Listado");
        jbListar.setBounds(200, 480, 200, 25);
        jbListar.addActionListener(obj);
        add(jbListar);
    }
    
    
    
    /*public static void main(String[] args) {
        VentanaPrincipal_Vista mp = new VentanaPrincipal_Vista();    
    }*/
    
}
