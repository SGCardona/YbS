
package Vista;

import Controlador.SubMenuIngreso_Control;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SubMenuIngreso_Vista extends JFrame{
    
    //public IngresoDatos_Vista ivv;
    public MenuPrincipal_Vista mp;
    public JButton jbAfiliados;

    public SubMenuIngreso_Vista(MenuPrincipal_Vista obj){
        super("Menu Principal");
        mp = obj;
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GUI();
        setVisible(true);
    }
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        setResizable(false);
        
        SubMenuIngreso_Control ctrl = new SubMenuIngreso_Control(this);
        afiliados(ctrl);
    }
    public void afiliados(SubMenuIngreso_Control obj){
        jbAfiliados = new JButton("Afiliados");
        jbAfiliados.setBounds(100, 50, 300, 30);
        jbAfiliados.addActionListener(obj);
        add(jbAfiliados);
    }
    public static void main(String[] args) {
        SubMenuIngreso_Vista sub = new SubMenuIngreso_Vista(null);
    }
    
    
}
