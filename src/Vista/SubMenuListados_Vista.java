
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
    public JPUsuarios jpU;
    public JPClientes jpC;
    public JPVehiculos jpV;
    public JPClientes_Vehiculos jpCV;

    public SubMenuListados_Vista(MenuPrincipal_Vista mp){
        super("Sub Menu Listas");
        this.mp = mp;
        setSize(1500,1000);
        setLocationRelativeTo(null);
        setLayout(null);
        jpU = new JPUsuarios(this);
        add(jpU);
        jpC = new JPClientes(this);
        add(jpC);
        jpV = new JPVehiculos(this);
        add(jpV);
        jpCV = new JPClientes_Vehiculos(this);
        add(jpCV);
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
        jblistaU.setBounds(50, 50, 200, 30);
        jblistaU.addActionListener(obj);
        add(jblistaU);
    }
    public void listaCliente(SubMenuListados_Control obj){
        jblistaC = new JButton("Lista de Clientes");
        jblistaC.setBounds(50, 90, 200, 30);
        jblistaC.addActionListener(obj);
        add(jblistaC);
    }
    public void listaVehiculo(SubMenuListados_Control obj){
        jblistaV = new JButton("Lista de Vehiculos");
        jblistaV.setBounds(50, 130, 200, 30);
        jblistaV.addActionListener(obj);
        add(jblistaV);
    }
    public void listaClienteVehiculo(SubMenuListados_Control obj){
        jblistaCV = new JButton("Lista de Clientes y Vehiculos");
        jblistaCV.setBounds(50, 170, 200, 30);
        jblistaCV.addActionListener(obj);
        add(jblistaCV);
    }
    public void salida(SubMenuListados_Control obj){
        jbSalida = new JButton("<");
        jbSalida.setBounds(30, 890, 50, 50);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
    public static void main(String[] args) {
        SubMenuListados_Vista sub = new SubMenuListados_Vista(null);
    }
}
