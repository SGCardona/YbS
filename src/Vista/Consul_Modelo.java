
package Vista;

import Controlador.Consul_Modelo_Control;
import Controlador.Consul_Tipo_Vehiculo_Control;
import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class Consul_Modelo extends JPanel{ //Vista de consultar por modelo vehiculo
    
    public JButton jbConsultar;
    public JLabel jlTituloJTable, jlmodelo;
    public JTextField jtmodelo;
    public SubMenuConsultas_Vista sub;
    public ListadoCliente_Modelo ls;
    public ModeloTabla_Vista mt;
    public JTable tablaC;

    public Consul_Modelo(SubMenuConsultas_Vista sub) {
        this.sub = sub;
        setBorder(new LineBorder(Color.RED));
        setBounds(300, 0, 1150, 750);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
       
     Consul_Modelo_Control ctrl = new Consul_Modelo_Control(this);
     tablaC(ctrl);
     
    }
    
    public void tablaC(Consul_Modelo_Control obj){
        
        jlTituloJTable = new JLabel("  Consulta por Modelo Vehiculo");        
        jlTituloJTable.setBounds(0, 0, 1150 ,70); 
        jlTituloJTable.setOpaque(true);
        jlTituloJTable.setBackground(Color.WHITE);
        jlTituloJTable.setForeground(Color.BLUE);
        jlTituloJTable.setFont(new Font("Tahoma", Font.BOLD, 22));
        jlTituloJTable.setHorizontalAlignment(SwingConstants.CENTER);
        jlTituloJTable.setBorder(new EtchedBorder());
        jlTituloJTable.setVisible(true); // el componente no se muestra
        add(jlTituloJTable); // anadir el JLabel al JPanel jpResultados
        
        
        String encabezados[] = {"Cedula", "Apellido", "Nombre", "Telefono", "Vehiculo", "Placa", "Modelo","Fecha Entrada", "Hora Entrada"};
        String datos[][] = {{"", "", "", "", "", "" , "" , "" , ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaC = new JTable(mt);
        
        
        tablaC.setSelectionBackground(Color.lightGray);
        tablaC.setSelectionForeground(Color.RED);
       
        JScrollPane js = new JScrollPane(tablaC);
        js.setBounds(25, 100, 1100, 550);        
        add(js);
        
        jlmodelo = new JLabel("Modelo de vehiculo:");
        jlmodelo.setBounds(70, 680, 120, 25);
        jlmodelo.setVisible(true); // el componente se muestra
        add(jlmodelo); // anadir el JLabel al JFrame
        
        jtmodelo = new JTextField();
        jtmodelo.setBounds(200, 680, 100, 25);
        jtmodelo.setVisible(true); // el componente se muestra
        jtmodelo.addActionListener(obj); 
        add(jtmodelo); // anadir el JTextField al JFrame
        
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(500, 680, 150, 30);
        jbConsultar.addActionListener(obj);
        add(jbConsultar);
}
}