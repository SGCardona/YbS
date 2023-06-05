
package Vista;

import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;


public class JPTablaUsuarios extends JPanel{
    
    public SubMenuListados_Vista sub;
    public ListadoCliente_Modelo ls;
    public ModeloTabla_Vista mt;
    public JTable tablaU;

    public JPTablaUsuarios(SubMenuListados_Vista obj) {
        sub = obj;
        setBorder(new LineBorder(Color.RED));
        setBounds(300, 50, 1150, 700);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
        tablaU();
        ls = new ListadoCliente_Modelo(this);
        ls.addRegistrosU();
    }
    public void tablaU(){
        String encabezados[] = {"Usuario", "Contraseña", "Correo", "Telefono", "Rol"};
        String datos[][] = {{"", "", "", "", ""}};
        
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaU = new JTable(mt);
        
        tablaU.setSelectionBackground(Color.lightGray);
        tablaU.setSelectionForeground(Color.RED);
                
        JScrollPane js = new JScrollPane(tablaU);
        js.setBounds(25, 100, 1100, 550);        
        add(js);
    }
    
    
}
