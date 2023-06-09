
package Vista;

import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class JPTablaVehiculos extends JPanel{

    public SubMenuListados_Vista sub;
    public ListadoCliente_Modelo ls;
    public ModeloTabla_Vista mt;
    public JTable tablaV;
    
    public JPTablaVehiculos(SubMenuListados_Vista obj) {
        sub = obj;
        setBorder(new LineBorder(Color.RED));
        setBounds(300, 50, 1150, 700);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
        tablaV();
        ls = new ListadoCliente_Modelo(this);
        ls.addRegistrosV();
    }
    public void tablaV(){
        
        String encabezados[] = {"Cedula", "Placa", "Vehiculo", "Modelo", "Estado"};
        String datos[][] = {{"", "", "", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaV = new JTable(mt);
        
        tablaV.setSelectionBackground(Color.lightGray);
        tablaV.setSelectionForeground(Color.RED);
//        tablaV.setVisible(false);
                
        JScrollPane js = new JScrollPane(tablaV);
        js.setBounds(25, 100, 1100, 550);        
        add(js);
    }
    
    
    
}
