
package Vista;

import Controlador.IngresoDatos_Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IngresoDatos_Vista extends JFrame{
    public JButton jbAfiliar, jbAnadir, jbIngreso, jbSalida, jbSalidaV, jbGuardar, jbConsulta;
    public SubMenuIngreso_Vista ing;
    public JPIngCliente_Vista inc;
    public JPIngVehiculo_Vista inv;
    public int num;

    public IngresoDatos_Vista(SubMenuIngreso_Vista obj) {
        super("Clientes Afiliados");
        num = 0;
        ing = obj;
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        inc = new JPIngCliente_Vista(this);
        add(inc);
        inv = new JPIngVehiculo_Vista(this);
        add(inv);
        GUI();
        setVisible(true);
    }
    
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        
        IngresoDatos_Control ctrl = new IngresoDatos_Control(this);
        afiliar(ctrl);
        anadirVehiculo(ctrl);
        ingresarVehiculo(ctrl);
        salida(ctrl);
        salidaVehiculo(ctrl);
        guardar(ctrl);
        consulta(ctrl);
    }
    
    public void afiliar(IngresoDatos_Control obj){
        jbAfiliar = new JButton("Afiliar cliente");
        jbAfiliar.setBounds(50, 50, 200, 30);
        jbAfiliar.addActionListener(obj);
        add(jbAfiliar);
    }
    public void anadirVehiculo(IngresoDatos_Control obj){
        jbAnadir = new JButton("Anadir vehiculo");
        jbAnadir.setBounds(50, 90, 200, 30);
        jbAnadir.addActionListener(obj);
        add(jbAnadir);
    }
    public void ingresarVehiculo(IngresoDatos_Control obj){
        jbIngreso = new JButton("Ingresar vehiculo");
        jbIngreso.setBounds(50, 130, 200, 30);
        jbIngreso.addActionListener(obj);
        add(jbIngreso);
    }
    public void salida(IngresoDatos_Control obj){
        jbSalida = new JButton("Volver al menu");
        jbSalida.setBounds(50, 210, 200, 30);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
    public void salidaVehiculo(IngresoDatos_Control obj){
        jbSalidaV = new JButton("Salida vehiculo");
        jbSalidaV.setBounds(50, 170, 200, 30);
        jbSalidaV.addActionListener(obj);
        add(jbSalidaV);
    }
    public void guardar(IngresoDatos_Control obj){
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(510, 500, 300, 30);
        jbGuardar.addActionListener(obj);
        jbGuardar.setVisible(false);
        add(jbGuardar);
    } 
    public void consulta(IngresoDatos_Control obj){
        jbConsulta = new JButton("Consultar");
        jbConsulta.setBounds(300, 500, 200, 30);
        jbConsulta.addActionListener(obj);
        jbConsulta.setVisible(false);
        add(jbConsulta);
    } 
    public static void main(String[] args) {
        IngresoDatos_Vista vs = new IngresoDatos_Vista(null);
    }
}
