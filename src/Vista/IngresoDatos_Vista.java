
package Vista;

import Controlador.IngresoDatos_Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IngresoDatos_Vista extends JFrame{
    public JButton jbGuardar, jbVolver, jbEntrada, jbSalida, jbconsulta;
    public MenuPrincipal_Vista mp;
    public JPIngCliente_Vista inc;
    public JPIngVehiculo_Vista inv;

    public IngresoDatos_Vista(MenuPrincipal_Vista obj) {
        super("Clientes");
        mp = obj;
        setSize(600,600);
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
        Guardar(ctrl);
        volver(ctrl);
        afiliar(ctrl);
        salida(ctrl);
        consultar(ctrl);
    }
    
    public void Guardar(IngresoDatos_Control obj){
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(100, 500, 200, 30);
        jbGuardar.addActionListener(obj);
        add(jbGuardar);
    }
    public void volver(IngresoDatos_Control obj){
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(310, 500, 200, 30);
        jbVolver.addActionListener(obj);
        add(jbVolver);
    }
    public void afiliar(IngresoDatos_Control obj){
        jbEntrada = new JButton("afiliar cliente");
        jbEntrada.setBounds(20, 10, 150, 30);
        jbEntrada.addActionListener(obj);
        add(jbEntrada);
    }
    public void salida(IngresoDatos_Control obj){
        jbSalida = new JButton("Salida");
        jbSalida.setBounds(185, 10, 150, 30);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
    public void consultar(IngresoDatos_Control obj){
        jbconsulta = new JButton("Consulta");
        jbconsulta.setBounds(100, 500, 200, 30);
        jbconsulta.addActionListener(obj);
        jbconsulta.setVisible(false);
        add(jbconsulta);
    }
    public static void main(String[] args) {
        IngresoDatos_Vista vs = new IngresoDatos_Vista(null);
    }
}
