
package Vista;

import Controlador.SubMenuConsultas_Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubMenuConsultas_Vista extends JFrame{
    
    public JButton consulta;
    public JLabel jlnumid;
    public JTextField jtnumid;
    public Consul_Cliente_X_ID id;
    public Consul_Cliente_X_Estado estado;
    public Consul_ListaVehiculos vehi;
    public Consul_Lista_Clientes_Vehiculos Clien_Vehi;
    public MenuPrincipal_Vista mp;
    public JButton jbC_Id, jbC_est, jbV_Placa, jbV_Tipo, jbSalida;

    public SubMenuConsultas_Vista(MenuPrincipal_Vista mp){
        super("Sub Menu Consultas");
        this.mp = mp;
        setSize(1500,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GUI();
        id = new Consul_Cliente_X_ID(this);
        add(id);
        
        setVisible(true);
    }
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        setResizable(false);
        
        SubMenuConsultas_Control ctrl = new SubMenuConsultas_Control(this);
        cliente_id(ctrl);
        cliente_estado(ctrl);
        vehiculo_placa(ctrl);
        vehiculo_tipo(ctrl);
        salida(ctrl);
        
    }
    public void consulta(){
        consulta = new JButton("Consultar");
        consulta.setBounds(800, 890, 50, 50);
        add(consulta);
    }
    
    public void id(){
        jlnumid = new JLabel("Id:");
        jlnumid.setBounds(600, 890, 50, 50);
        add(jlnumid);
        
        jtnumid = new JTextField("");
        jtnumid.setBounds(700, 890, 50, 50);
        
        
        
    }
    
    public void cliente_id(SubMenuConsultas_Control obj){
        jbC_Id = new JButton("Cliente x ID");
        jbC_Id.setBounds(50, 50, 200, 30);
        jbC_Id.addActionListener(obj);
        add(jbC_Id);
    }
    public void cliente_estado(SubMenuConsultas_Control obj){
        jbC_est = new JButton("Cliente x estado");
        jbC_est.setBounds(50, 90, 200, 30);
        jbC_est.addActionListener(obj);
        add(jbC_est);
    }
    public void vehiculo_placa(SubMenuConsultas_Control obj){
        jbV_Placa = new JButton("Lista de Vehiculos");
        jbV_Placa.setBounds(50, 130, 200, 30);
        jbV_Placa.addActionListener(obj);
        add(jbV_Placa);
    }
    public void vehiculo_tipo(SubMenuConsultas_Control obj){
        jbV_Tipo = new JButton("Lista de Clientes y Vehiculos");
        jbV_Tipo.setBounds(50, 170, 200, 30);
        jbV_Tipo.addActionListener(obj);
        add(jbV_Tipo);
    }
    public void salida(SubMenuConsultas_Control obj){
        jbSalida = new JButton("<");
        jbSalida.setBounds(30, 890, 50, 50);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
    public static void main(String[] args) {
        SubMenuConsultas_Vista sub = new SubMenuConsultas_Vista(null);
    }
}
