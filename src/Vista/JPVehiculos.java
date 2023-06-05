/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ListadoCliente_Modelo;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class JPVehiculos extends JPanel{

    public SubMenuListados_Vista sub;
    public ListadoCliente_Modelo ls;
    public ModeloTabla_Vista mt;
    public JTable tablaV;
    
    public JPVehiculos(SubMenuListados_Vista obj) {
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
        
        String encabezados[] = {"Vehiculo", "Placa", "Modelo", "Entrada", "Salida"};
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
