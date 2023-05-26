package Vista;

import javax.swing.table.DefaultTableModel;


public class ModeloTabla_Vista extends DefaultTableModel{
    
    public ModeloTabla_Vista(Object datos[][], Object encabezados[]){
        super(datos, encabezados);
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        //return true;
        return false;
    }
}
