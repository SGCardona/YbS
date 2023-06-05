
package Vista;

import Modelo.ListadoUsuarios_Modelo;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EtchedBorder;

public class ListadoUsuarios_Vista extends JFrame{
    
    public VentanaPrincipal_Vista mp;
    public ModeloTabla_Vista mt;
    public JTable tabla;
    public JButton jbVolver;

    public ListadoUsuarios_Vista(VentanaPrincipal_Vista obj) {
        super("Listado de Usuarios");
        mp = obj;
        
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GUI();
        //Listado_Modelo lpm = new Listado_Modelo(this);
        //lpm.addRegistros();
        ListadoUsuarios_Modelo lsu = new ListadoUsuarios_Modelo(this);
        lsu.addRegistros();
        
        setVisible(true);
    }
    
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        setResizable(false);
        
        titulo();
        tabla();
        volver();
    }
    
    public void titulo(){
        JLabel jl = new JLabel("Listado de Usuarios");
        jl.setBounds(0, 0, 600, 50);
        jl.setBorder(new EtchedBorder());
        jl.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jl.setOpaque(true);
        jl.setBackground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(jl);
    }
    
    public void tabla(){
        String encabezados[] = {"Usuario", "Contraseña", "Correo", "Telefono", "Rol"};
        String datos[][] = {{"", "", "", "", ""}};
        
        mt = new ModeloTabla_Vista(datos, encabezados);
        tabla = new JTable(mt);
        
        tabla.setSelectionBackground(Color.lightGray);
        tabla.setSelectionForeground(Color.RED);
                
        JScrollPane js = new JScrollPane(tabla);
        js.setBounds(20, 60, 550, 350);        
        add(js);
    }
    
    public void volver(){
        //Listado_Control lpc = new Listado_Control(this);
        jbVolver = new JButton("Volver al menu principal");
        jbVolver.setBounds((600-250)/2, 420, 250, 25);
        //jbVolver.addActionListener(lpc);
        add(jbVolver);
    }
    
    /*public static void main(String[] args) {
        ListadoUsuarios_Vista ls = new ListadoUsuarios_Vista();
    }*/
    
}
