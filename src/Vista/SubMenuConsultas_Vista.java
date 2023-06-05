
package Vista;

import Controlador.SubMenuConsultas_Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SubMenuConsultas_Vista extends JFrame{
    

    public Consul_Cliente_X_ID id;
    public Consul_Cliente_X_Estado estado;
    public Consul_Placa placa;
    public Consul_Tipo_Vehiculo vehi;
    public Consul_Nombre nom;
    public Consul_Modelo model;
    public Consul_Entrada ent;
    public Consul_Salida sal;
    public Consul_Apellido ape;
    public Consul_Telefono tel;
    public MenuPrincipal_Vista mp;
    public JButton jbC_Id, jbC_est, jbV_Placa, jbV_Tipo,jbnom, jbmodelo, jbentrada, jbsalidav  ,jbSalida, jbtelefono, jbape;

    public SubMenuConsultas_Vista(MenuPrincipal_Vista mp){
        super("Sub Menu Consultas");
        this.mp = mp;
        setSize(1500,800);
        setLocationRelativeTo(null);
        setLayout(null);
        GUI();
        id = new Consul_Cliente_X_ID(this);
        estado = new Consul_Cliente_X_Estado(this);
        placa = new Consul_Placa(this);
        vehi = new Consul_Tipo_Vehiculo(this);
        nom = new Consul_Nombre(this);
        model = new Consul_Modelo(this);
        ent = new Consul_Entrada(this);
        sal = new Consul_Salida(this);
        ape = new Consul_Apellido(this);
        tel = new Consul_Telefono(this);
        add(id);
        add(estado);
        add(placa);
        add(vehi);
        add(nom);
        add(model);
        add(ent);
        add(sal);
        add(ape);
        add(tel);
        
        setVisible(true);
    }
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        setResizable(false);
        
        SubMenuConsultas_Control ctrl = new SubMenuConsultas_Control(this);
        cliente_id(ctrl); //Hecho - verificado
        cliente_estado(ctrl); //Hecho - verificado
        vehiculo_placa(ctrl); //Hecho - verificado
        vehiculo_tipo(ctrl); //Hecho - verificado
        cliente_nombre(ctrl); //Hecho  - verificado
        vehiculo_modelo(ctrl); //Hecho - verificado
        vehiculo_hora_entrada(ctrl); //Hecho - verificado
        vehiculo_hora_salida(ctrl); //Hecho  - verificado
        cliente_apellido(ctrl); //Hecho - verificado
        cliente_telefono(ctrl); //Hecho - verificado
        salida(ctrl);
        
    }
    
    public void cliente_id(SubMenuConsultas_Control obj){
        jbC_Id = new JButton(" Consulta Cliente x Cedula");
        jbC_Id.setBounds(10, 50, 280, 30);
        jbC_Id.addActionListener(obj);
        add(jbC_Id);
    }
    public void cliente_estado(SubMenuConsultas_Control obj){
        jbC_est = new JButton("Consulta Estado x Usuario");
        jbC_est.setBounds(10, 90, 280, 30);
        jbC_est.addActionListener(obj);
        add(jbC_est);
    }
    public void vehiculo_placa(SubMenuConsultas_Control obj){
        jbV_Placa = new JButton("Consulta Cliente x Placa");
        jbV_Placa.setBounds(10, 130, 280, 30);
        jbV_Placa.addActionListener(obj);
        add(jbV_Placa);
    }
    public void vehiculo_tipo(SubMenuConsultas_Control obj){
        jbV_Tipo = new JButton("Consulta Cliente x Tipo Vehiculo");
        jbV_Tipo.setBounds(10, 170, 280, 30);
        jbV_Tipo.addActionListener(obj);
        add(jbV_Tipo);
    }
    public void cliente_nombre(SubMenuConsultas_Control obj){
        jbnom = new JButton("Consulta Cliente x Nombre");
        jbnom.setBounds(10, 210, 280, 30);
        jbnom.addActionListener(obj);
        add(jbnom);
    }
    public void vehiculo_modelo(SubMenuConsultas_Control obj){
        jbmodelo = new JButton("Consulta Cliente x Modelo Vehiculo");
        jbmodelo.setBounds(10, 250, 280, 30);
        jbmodelo.addActionListener(obj);
        add(jbmodelo);
    }
    public void vehiculo_hora_entrada(SubMenuConsultas_Control obj){
        jbentrada = new JButton("Consulta Cliente x Hora Entrada Vehiculo");
        jbentrada.setBounds(10, 290, 280, 30);
        jbentrada.addActionListener(obj);
        add(jbentrada);
    }
    public void vehiculo_hora_salida(SubMenuConsultas_Control obj){
        jbsalidav = new JButton("Consulta Cliente x Hora Salida Vehiculo");
        jbsalidav.setBounds(10, 330, 280, 30);
        jbsalidav.addActionListener(obj);
        add(jbsalidav);
    }
    public void cliente_apellido(SubMenuConsultas_Control obj){
        jbape = new JButton("Consulta Cliente x Apellido");
        jbape.setBounds(10, 370, 280, 30);
        jbape.addActionListener(obj);
        add(jbape);
    }
    public void cliente_telefono(SubMenuConsultas_Control obj){
        jbtelefono = new JButton("Consulta Cliente x Telefono");
        jbtelefono.setBounds(10, 410, 280, 30);
        jbtelefono.addActionListener(obj);
        add(jbtelefono);
    }
    
    public void salida(SubMenuConsultas_Control obj){
        jbSalida = new JButton("<");
        jbSalida.setBounds(10, 590, 280, 50);
        jbSalida.addActionListener(obj);
        add(jbSalida);
    }
    public static void main(String[] args) {
        SubMenuConsultas_Vista sub = new SubMenuConsultas_Vista(null);
    }
}
