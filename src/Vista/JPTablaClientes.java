
package Vista;

import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class JPTablaClientes extends JPanel{
    
    public SubMenuListados_Vista sub;
    public ListadoCliente_Modelo ls;
    public ModeloTabla_Vista mt;
    public JTable tablaC;

    public JPTablaClientes(SubMenuListados_Vista sub) {
        this.sub = sub;
        setBorder(new LineBorder(Color.RED));
        setBounds(300, 50, 1150, 700);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
        tablaC();
        ls = new ListadoCliente_Modelo(this);
        ls.addRegistrosC();
    }
    public void tablaC(){
        
        String encabezados[] = {"Cedula", "Apellido", "Nombre", "Telefono"};
        String datos[][] = {{"", "", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaC = new JTable(mt);
        
        tablaC.setSelectionBackground(Color.lightGray);
        tablaC.setSelectionForeground(Color.RED);
//        tablaC.setVisible(false);
                
        JScrollPane js = new JScrollPane(tablaC);
        js.setBounds(25, 100, 1100, 550);        
        add(js);
    }
    
    
    
    
}
