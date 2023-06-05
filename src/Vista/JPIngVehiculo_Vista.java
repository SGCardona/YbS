package Vista;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class JPIngVehiculo_Vista extends JPanel{
    
    public JTextField jtPlaca, jtModelo;
    public JLabel jlPlaca, jlModelo, jlTipo, jlFecha, jlHora, jl;
    public JComboBox<String>  jcTipo, jcHora, jcMinutos;
    public JDateChooser JdEntrada, jdSalida;
    public IngresoVehiculo_Vista iv;
    
    public JPIngVehiculo_Vista(IngresoVehiculo_Vista obj){
        iv = obj;
        setBorder(new LineBorder(Color.BLACK));
        setBounds(40, 50, 510, 210);
        setOpaque(false);
        TitledBorder border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE), "Datos del vehiculo");
        border.setTitleColor(Color.WHITE);
        setBorder(border);
        setLayout(null);
        crearGUI();
        setVisible(false);
    }

    private void crearGUI() {
        placaEntrada();
        modeloEntrada();
        tipoEntrada();
        fechaEntrada();
        //fechaSalida();
    }
    
    public void placaEntrada(){
        jlPlaca = new JLabel("Placa:");
        jlPlaca.setBounds(10, 15, 100, 30);
        jlPlaca.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlPlaca.setForeground(Color.WHITE);
        add(jlPlaca);
        
        jtPlaca = new JTextField();
        jtPlaca.setBounds(110, 15, 200, 30);
        add(jtPlaca);
    }
    public void modeloEntrada(){
        jlModelo = new JLabel("Modelo:");
        jlModelo.setBounds(10, 65, 100, 30);
        jlModelo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlModelo.setForeground(Color.WHITE);
        add(jlModelo);
        
        jtModelo = new JTextField();
        jtModelo.setBounds(110, 65, 200, 30);
        add(jtModelo);
    }
    public void tipoEntrada(){
        jlTipo = new JLabel("Tipo:");
        jlTipo.setBounds(10, 115, 100, 30);
        jlTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTipo.setForeground(Color.WHITE);
        add(jlTipo);
        
        jcTipo = new JComboBox<>();
        jcTipo.setPrototypeDisplayValue("");
        jcTipo.addItem("MOTOCICLETA");
        jcTipo.addItem("AUTOMOVIL");
        jcTipo.setSelectedIndex(-1);
        jcTipo.setBounds(110, 115, 200, 30);
        add(jcTipo);
    }
    public void fechaEntrada(){
        jlFecha = new JLabel("Fecha:");
        jlFecha.setBounds(10, 165, 100, 30);
        jlFecha.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlFecha.setForeground(Color.WHITE);
        add(jlFecha);
        
        JdEntrada = new JDateChooser(new Date());
        JdEntrada.setBounds(110, 165, 100, 30);
        add(JdEntrada);
        
        jlHora = new JLabel("Hora:");
        jlHora.setBounds(240, 165, 60, 30);
        jlHora.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlHora.setForeground(Color.WHITE);
        add(jlHora);
        
        jcHora = new JComboBox<>();
        for(int i = 0; i < 24; i++){
            if(i < 10) jcHora.addItem("0" + i);
            else jcHora.addItem("" + i);
        }
        jcHora.setBounds(320, 165, 48, 30);
        add(jcHora);
        
        jl = new JLabel(":");
        jl.setBounds(375, 165, 20, 30);
        jl.setForeground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(jl);
        
        jcMinutos = new JComboBox<>();
        for(int i = 0; i < 60; i++){
            if(i < 10) jcMinutos.addItem("0" + i);
            else jcMinutos.addItem("" + i);
        }
        jcMinutos.setBounds(388, 165, 48, 30);
        add(jcMinutos);

    }
}
