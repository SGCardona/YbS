
package Vista;

import Controlador.Correo_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Correo_Vista extends JFrame{
    
    public MenuPrincipal_Vista mp;
    public JLabel titulo, destino, asunto, contenido,labarchivos;
    public JTextField emailTo, subject;
    public JTextArea content;
    public JButton salir, enviar, archivos;
    
    public Correo_Vista(MenuPrincipal_Vista mp){
        super("Enviar Correo");
        this.mp = mp;
        setSize(700,700);
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
        Correo_Control ctrl = new Correo_Control(this);
        titulo();
        carta();
        buttons(ctrl);
        
    }
    public void titulo(){
        titulo = new JLabel("Envio de correo");
        titulo.setBounds(220, 20, 400, 100);
        Font font = new Font("Tahoma", Font.PLAIN, 33);
        Font font2 = new Font("Tahoma", Font.PLAIN, 20);
        titulo.setFont(font);
        titulo.setForeground(Color.BLACK);
        add(titulo);
        
        destino = new JLabel("Enviar a:");
        destino.setBounds(40, 50, 400, 200);
        destino.setFont(font2);
        destino.setForeground(Color.BLACK);
        add(destino);
        
        asunto = new JLabel("Asunto:");
        asunto.setBounds(40, 100, 400, 200);
        asunto.setFont(font2);
        asunto.setForeground(Color.BLACK);
        add(asunto);
        
        contenido = new JLabel("Contenido:");
        contenido.setBounds(40, 150, 400, 200);
        contenido.setFont(font2);
        contenido.setForeground(Color.BLACK);
        add(contenido);
        
        labarchivos = new JLabel("....");
        labarchivos.setBounds(150, 350, 400, 300);
        labarchivos.setFont(font2);
        labarchivos.setForeground(Color.BLACK);
        add(labarchivos);
    }
    public void carta(){
        emailTo = new JTextField("");
        emailTo.setBounds(150, 130, 500, 30);
        add(emailTo);
        
        subject = new JTextField("");
        subject.setBounds(150, 185, 500, 30);
        add(subject);
        
        content = new JTextArea("");
        content.setBounds(150, 240, 500, 160);
        add(content);
    }
    public void buttons(Correo_Control obj){
        salir = new JButton("<");
        salir.setBounds(40, 580, 50, 50);
        salir.addActionListener(obj);
        add(salir);
        
        enviar = new JButton("Enviar Correo");
        enviar.setBounds(320, 580, 130, 50);
        enviar.addActionListener(obj);
        add(enviar);
        
        archivos = new JButton("Adjuntar Archivos");
        archivos.setBounds(150, 410, 500, 30);
        archivos.addActionListener(obj);
        add(archivos);
    }
}
