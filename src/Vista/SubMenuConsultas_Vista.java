
package Vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SubMenuConsultas_Vista extends JFrame{
    
    public MenuPrincipal_Vista mp;
    public JButton jbC_Id, jbC_est, jbV_Placa, jbV_Tipo, jbSalida;

    public SubMenuConsultas_Vista(MenuPrincipal_Vista mp){
        super("Sub Menu Consultas");
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
        
        cliente_id();
        cliente_estado();
        vehiculo_placa();
        vehiculo_tipo();
        salida();
    }
    public void cliente_id(){
        jbC_Id = new JButton("Cliente x ID");
        jbC_Id.setBounds(100, 50, 300, 40);
//        jblista1.addActionListener(obj);
        add(jbC_Id);
    }
    public void cliente_estado(){
        jbC_est = new JButton("Cliente x estado");
        jbC_est.setBounds(100, 100, 300, 40);
//        jblista1.addActionListener(obj);
        add(jbC_est);
    }
    public void vehiculo_placa(){
        jbV_Placa = new JButton("Lista de Vehiculos");
        jbV_Placa.setBounds(100, 150, 300, 40);
//        jblista1.addActionListener(obj);
        add(jbV_Placa);
    }
    public void vehiculo_tipo(){
        jbV_Tipo = new JButton("Lista de Clientes y Vehiculos");
        jbV_Tipo.setBounds(100, 200, 300, 40);
//        jblista1.addActionListener(obj);
        add(jbV_Tipo);
    }
    public void salida(){
        jbSalida = new JButton("<");
        jbSalida.setBounds(10, 250, 50, 50);
        add(jbSalida);
    }
    public static void main(String[] args) {
        SubMenuConsultas_Vista sub = new SubMenuConsultas_Vista(null);
    }
}
