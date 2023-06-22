
package Vista;

import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class JPTablaClientes_Afiliados extends JPanel{
    
    public SubMenuListados_Vista sub;
    public JTable tablaCV;
    public ModeloTabla_Vista mt;
    public ListadoCliente_Modelo ls;

    public JPTablaClientes_Afiliados(SubMenuListados_Vista obj){
        sub = obj;
        setBorder(new LineBorder(Color.RED));
//        setBackground(Color.CYAN);
        setBounds(300, 50, 1150, 700);
        setLayout(null);
        GUI();
        setVisible(false);
    }
    public void GUI(){
        tablaCA();
        ls = new ListadoCliente_Modelo(this);
        ls.addRegistrosA();
    }
    public void tablaCA(){
        
        String encabezados[] = {"Placa","Dia Entrada", "Mes Entrada", "Year Entrada"
                ,"Hora Entrada", "Dia Salida", "Mes Salida", "Year Salida", "Hora Salida", "Estado"};
        String datos[][] = {{"", "", "", "", "", "",  "", "", "", ""}};
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
