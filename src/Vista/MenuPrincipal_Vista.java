
package Vista;

import Controlador.IngresoVehiculo_Control;
import Controlador.MenuPrincipal_Control;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuPrincipal_Vista extends JFrame{
    
    public IngresoVehiculo_Vista ivv;
    public VentanaPrincipal_Vista vp;
    public JButton jbDatos, jbListados, jbGraficas, jbConsulta, jbAcerca;

    public MenuPrincipal_Vista(VentanaPrincipal_Vista vp){
        super("Menu Principal");
        this.vp = vp;
        setSize(600,400);
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
        
        MenuPrincipal_Control ctrl = new MenuPrincipal_Control(this);
        ingreso_datos(ctrl);
        listados(ctrl);
        consultas(ctrl);
        graficas(ctrl);
        acerdaDe(ctrl);
    }
    public void ingreso_datos(MenuPrincipal_Control obj){
        jbDatos = new JButton("Ingreso vehiculo");
        jbDatos.setBounds(150, 50, 300, 30);
        jbDatos.addActionListener(obj);
        add(jbDatos);
    }
    public void listados(MenuPrincipal_Control obj){
        jbListados = new JButton("Listas");
        jbListados.setBounds(150, 100, 300, 30);
        jbListados.addActionListener(obj);
        add(jbListados);
    }
    public void consultas(MenuPrincipal_Control obj){
        jbConsulta = new JButton("Consultas");
        jbConsulta.setBounds(150, 150, 300, 30);
        jbConsulta.addActionListener(obj);
        add(jbConsulta);
    }
    public void graficas(MenuPrincipal_Control obj){
        jbGraficas = new JButton("Graficas");
        jbGraficas.setBounds(150, 200, 300, 30);
        jbGraficas.addActionListener(obj);
        add(jbGraficas);
    }
    public void acerdaDe(MenuPrincipal_Control obj){
        jbAcerca = new JButton("Acerca de...");
        jbAcerca.setBounds(150, 250, 300, 30);
        jbAcerca.addActionListener(obj);
        add(jbAcerca);
    }
    /*
    public static void main(String[] args) {
        MenuPrincipal_Vista mp = new MenuPrincipal_Vista(null);
    }*/
    
}
