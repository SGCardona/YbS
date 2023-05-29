package Vista;

import Controlador.IngresoVehiculo_Control;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class InDVehiculo_Vista extends JPanel{
    
    public JTextField jtPlaca, jtModelo, jtHoraEntrada, jtHoraSalida;
    public JLabel jlPlaca, jlModelo, jlTipo, jlHoraEntrada, jlHoraSalida;
    public JComboBox<String>  jcTipo;
    //public IngresoVehiculo_Control ivc;
    public IngresoVehiculo_Vista iv;
    
    public InDVehiculo_Vista(IngresoVehiculo_Vista obj){
        iv = obj;
        setBorder(new LineBorder(Color.WHITE));
        setBounds(40, 50, 510, 210);
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        crearGUI();
        setVisible(false);
    }

    private void crearGUI() {
        
        placaEntrada();
        modeloEntrada();
        tipoEntrada();
        horaEntrada();
        horaSalida();
        
    }
    
    public void placaEntrada(){
        jlPlaca = new JLabel("Placa del vehiculo");
        jlPlaca.setBounds(80, 15, 200, 30);
        jlPlaca.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlPlaca.setForeground(Color.WHITE);
        add(jlPlaca);
        
        jtPlaca = new JTextField();
        jtPlaca.setBounds(280, 15, 170, 30);
        add(jtPlaca);
    }
    
    
    
    public void modeloEntrada(){
        jlModelo = new JLabel("Modelo del vehiculo");
        jlModelo.setBounds(80, 65, 200, 30);
        jlModelo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlModelo.setForeground(Color.WHITE);
        add(jlModelo);
        
        jtModelo = new JTextField();
        jtModelo.setBounds(280, 65, 170, 30);
        add(jtModelo);
    } 
    
    public void tipoEntrada(){
        jlTipo = new JLabel("Tipo de vehiculo");
        jlTipo.setBounds(80, 115, 200, 30);
        jlTipo.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlTipo.setForeground(Color.WHITE);
        add(jlTipo);
        
        jcTipo = new JComboBox<>();
        jcTipo.addItem(" ");
        jcTipo.addItem("MOTOCICLETA");
        jcTipo.addItem("CARRO");
        jcTipo.setBounds(280, 115, 170, 30);
        add(jcTipo);
    }
    
    public void horaEntrada(){
        jlHoraEntrada = new JLabel("Hora entrada");
        jlHoraEntrada.setBounds(80, 165, 200, 30);
        jlHoraEntrada.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlHoraEntrada.setForeground(Color.WHITE);
        add(jlHoraEntrada);
        
        jtHoraEntrada = new JTextField();
        jtHoraEntrada.setBounds(280, 165, 170, 30);
        add(jtHoraEntrada);
    }
    
    public void horaSalida(){
        jlHoraSalida = new JLabel("Hora Salida");
        jlHoraSalida.setBounds(80, 165, 200, 30);
        jlHoraSalida.setFont(new Font("Tahoma", Font.BOLD, 18));
        jlHoraSalida.setForeground(Color.WHITE);
        jlHoraSalida.setVisible(false);
        add(jlHoraSalida);
        
        jtHoraSalida = new JTextField();
        jtHoraSalida.setBounds(280, 165, 170, 30);
        jtHoraSalida.setVisible(false);
        add(jtHoraSalida);
    }
}
