
package Vista;

import Controlador.InDVehiculo_Control;
import Controlador.IngresoVehiculo_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IngresoVehiculo_Vista extends JFrame{
    public JButton jbGuardar, jbVolver, jbEntrada, jbSalida;
    public MenuPrincipal_Vista mp;
    public InDCliente_Vista ind;
    public InDVehiculo_Vista indv;

    public IngresoVehiculo_Vista(MenuPrincipal_Vista obj) {
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
        GuardarEntradaSalida();
    }
    
    public void GuardarEntradaSalida(){
        IngresoVehiculo_Control ctrl = new IngresoVehiculo_Control(this);
        
        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(100, 500, 200, 30);
        jbGuardar.addActionListener(ctrl);
        add(jbGuardar);
        
        jbVolver = new JButton("Volver");
        jbVolver.setBounds(310, 500, 200, 30);
        jbVolver.addActionListener(ctrl);
        add(jbVolver);
        
        jbEntrada = new JButton("Entrada");
        jbEntrada.setBounds(20, 10, 150, 30);
        jbEntrada.addActionListener(ctrl);
        add(jbEntrada);
        
        jbSalida = new JButton("Salida");
        jbSalida.setBounds(185, 10, 150, 30);
        jbSalida.addActionListener(ctrl);
        add(jbSalida);
        
        ind = new InDCliente_Vista(this);
        add(ind);
        
        indv = new InDVehiculo_Vista(this);
        add(indv);
        
    }
    
    public static void main(String[] args) {
        IngresoVehiculo_Vista ing = new IngresoVehiculo_Vista(null);
    }
    
    
}