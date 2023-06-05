
package Vista;

import Controlador.Consul_Cliente_X_Estado_Control;
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

public class Consul_Cliente_X_Estado extends JPanel{ //Vista de consultar por estado de usuario
    
    public JButton jbConsultar;
    public JLabel jlTituloJTable, jlestado;
    public JTextField jtestado;
    public SubMenuConsultas_Vista sub;
    public ListadoCliente_Modelo ls;
    public ModeloTabla_Vista mt;
    public JTable tablaC;

    public Consul_Cliente_X_Estado(SubMenuConsultas_Vista sub) {
        this.sub = sub;
        setBorder(new LineBorder(Color.RED));
        setBounds(300, 0, 1150, 750);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
     Consul_Cliente_X_Estado_Control ctrl = new Consul_Cliente_X_Estado_Control(this);
     tablaC(ctrl);
     
    }
    
    public void tablaC(Consul_Cliente_X_Estado_Control obj){
        
        jlTituloJTable = new JLabel("  Consulta por Usuario x Estado");        
        jlTituloJTable.setBounds(0, 0, 1150 ,70); 
        jlTituloJTable.setOpaque(true);
        jlTituloJTable.setBackground(Color.WHITE);
        jlTituloJTable.setForeground(Color.BLUE);
        jlTituloJTable.setFont(new Font("Tahoma", Font.BOLD, 22));
        jlTituloJTable.setHorizontalAlignment(SwingConstants.CENTER);
        jlTituloJTable.setBorder(new EtchedBorder());
        jlTituloJTable.setVisible(true); // el componente no se muestra
        add(jlTituloJTable); // anadir el JLabel al JPanel jpResultados
        
        
        String encabezados[] = {"Usuario", "Contraseña", "Correo", "Telefono", "Rol","Estado"};
        String datos[][] = {{"", "", "", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaC = new JTable(mt);
        
        
        tablaC.setSelectionBackground(Color.lightGray);
        tablaC.setSelectionForeground(Color.RED);
       
        JScrollPane js = new JScrollPane(tablaC);
        js.setBounds(25, 100, 1100, 550);        
        add(js);
        
        jlestado = new JLabel("Estado Usuario:");
        jlestado.setBounds(70, 680, 120, 25);
        jlestado.setVisible(true); // el componente se muestra
        add(jlestado); // anadir el JLabel al JFrame
        
        jtestado = new JTextField();
        jtestado.setBounds(200, 680, 100, 25);
        jtestado.setVisible(true); // el componente se muestra
        jtestado.addActionListener(obj); 
        add(jtestado); // anadir el JTextField al JFrame
        
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(500, 680, 150, 30);
        jbConsultar.addActionListener(obj);
        add(jbConsultar);
}
}