package Vista;

import Controlador.Listado_Control;
import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;


public class Listado_Vista extends JFrame{
//    public VentanaPrincipal_Vista mp;
//    public MenuPrincipal_Vista mp;
    public SubMenuListados_Vista sub;
    public ModeloTabla_Vista mt;
    public JTable tablaC, tablaV, tablaCV;
    public JButton jbVolver;
    public ListadoCliente_Modelo lsCV, lsC, lsV; 

    public Listado_Vista(SubMenuListados_Vista obj) {
        
        super("Listado de personas");
        sub = obj;
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        GUI();
//        ListadoCliente_Modelo lpm = new ListadoCliente_Modelo(this);
//        lpm.addRegistrosCV();
        /*lsCV = new ListadoCliente_Modelo(this);
        lsCV.addRegistrosCV();
        lsC = new ListadoCliente_Modelo(this);
        lsC.addRegistrosC();
        lsV = new ListadoCliente_Modelo(this);
        lsV.addRegistrosV();*/
        setVisible(true);
    }
    
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        
        titulo();
        //tablaCV();
        //tablaC();
        //tablaV();
        volver();
    }
    
    public void titulo(){
        JLabel jl = new JLabel("Listado");
        jl.setBounds(0, 0, 600, 50);
        jl.setBorder(new EtchedBorder());
        jl.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jl.setOpaque(true);
        jl.setBackground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jl);
    }
    
    public void tablaCV(){
        
        String encabezados[] = {"Apellido", "Nombre", "Telefono", "Cedula", "Modelo", "Placa", "Marca"};
        String datos[][] = {{"", "", "", "", "", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaCV = new JTable(mt);
        
        tablaCV.setSelectionBackground(Color.lightGray);
        tablaCV.setSelectionForeground(Color.RED);
        tablaCV.setVisible(false);
                
        JScrollPane js = new JScrollPane(tablaCV);
        js.setBounds(20, 60, 550, 350);        
        add(js);
    }
    public void tablaC(){
        
        String encabezados[] = {"Apellido", "Nombre", "Telefono", "Cedula"};
        String datos[][] = {{"", "", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaC = new JTable(mt);
        
        tablaC.setSelectionBackground(Color.lightGray);
        tablaC.setSelectionForeground(Color.RED);
        tablaC.setVisible(false);
                
        JScrollPane js = new JScrollPane(tablaC);
        js.setBounds(20, 60, 550, 350);        
        add(js);
    }
    public void tablaV(){
        
        String encabezados[] = {"Modelo", "Placa", "Marca"};
        String datos[][] = {{"", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaV = new JTable(mt);
        
        tablaV.setSelectionBackground(Color.lightGray);
        tablaV.setSelectionForeground(Color.RED);
        tablaV.setVisible(false);
                
        JScrollPane js = new JScrollPane(tablaV);
        js.setBounds(20, 60, 550, 350);        
        add(js);
    }
    
    public void volver(){
        Listado_Control lpc = new Listado_Control(this);
        jbVolver = new JButton("Volver al menu principal");
        jbVolver.setBounds((600-250)/2, 420, 250, 25);
        jbVolver.addActionListener(lpc);
        add(jbVolver);
    }
    
    
}
