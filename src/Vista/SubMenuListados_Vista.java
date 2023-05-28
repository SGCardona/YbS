
package Vista;

import Controlador.SubMenuListados_Control;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SubMenuListados_Vista extends JFrame{
    
    public MenuPrincipal_Vista mp;
    public JButton jblistaU, jblistaC, jblistaV, jblistaCV, jbSalida;

    public SubMenuListados_Vista(MenuPrincipal_Vista mp){
        super("Sub Menu Listas");
        this.mp = mp;
        setSize(500,350);
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
        
        SubMenuListados_Control ctrl = new SubMenuListados_Control(this);
        listaUsuarios(ctrl);
        listaCliente(ctrl);
        listaVehiculo(ctrl);
        listaClienteVehiculo(ctrl);
        salida(ctrl);
    }
    public void listaUsuarios(SubMenuListados_Control obj){
        jblistaU = new JButton("Lista de Usuarios");
        jblistaU.setBounds(100, 50, 300, 40);
        jblistaU.addActionListener(obj);
        add(jblistaU);
    }
    public void listaCliente(SubMenuListados_Control obj){
        jblistaC = new JButton("Lista de Clientes");
        jblistaC.setBounds(100, 100, 300, 40);
        jblistaC.addActionListener(obj);
        add(jblistaC);
    }
    public void listaVehiculo(SubMenuListados_Control obj){
        jblistaV = new JButton("Lista de Vehiculos");
        jblistaV.setBounds(100, 150, 300, 40);
        jblistaV.addActionListener(obj);
        add(jblistaV);
    }
    public void listaClienteVehiculo(SubMenuListados_Control obj){
        jblistaCV = new JButton("Lista de Clientes y Vehiculos");
        jblistaCV.setBounds(100, 200, 300, 40);
        jblistaCV.addActionListener(obj);
        add(jblistaCV);
    }
    public void salida(SubMenuListados_Control obj){
        jbSalida = new JButton("<");
        jbSalida.setBounds(10, 250, 50, 50);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
    public static void main(String[] args) {
        SubMenuListados_Vista sub = new SubMenuListados_Vista(null);
    }
}
