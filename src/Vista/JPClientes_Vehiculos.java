
package Vista;

import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class JPClientes_Vehiculos extends JPanel{
    
    public SubMenuListados_Vista sub;
    public JTable tablaCV;
    public ModeloTabla_Vista mt;
    public ListadoCliente_Modelo ls;

    public JPClientes_Vehiculos(SubMenuListados_Vista obj){
        sub = obj;
        setBorder(new LineBorder(Color.RED));
//        setBackground(Color.CYAN);
        setBounds(300, 50, 1150, 700);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
        tablaCV();
        ls = new ListadoCliente_Modelo(this);
        ls.addRegistrosCV();
    }
    public void tablaCV(){
        
        String encabezados[] = {"Cedula","Apellido", "Nombre", "Telefono", "Vehiculo", "Placa", "Modelo", "Entrada", "Salida"};
        String datos[][] = {{"", "", "", "", "", "",  "", "", ""}};
        mt = new ModeloTabla_Vista(datos, encabezados);
        tablaCV = new JTable(mt);
        
        tablaCV.setSelectionBackground(Color.lightGray);
        tablaCV.setSelectionForeground(Color.RED);
//        tablaCV.setVisible(false);
                
        JScrollPane js = new JScrollPane(tablaCV);
        js.setBounds(25, 100, 1100, 550);        
        add(js);
    }
}
