
package Controlador;

import Vista.Correo_Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Correo_Control implements ActionListener{
    public Correo_Vista sub;
    private static String emailFrom = "yibrian.alvarez@correounivalle.edu.co";
    private static String passwordFrom = "cxmcexihhodcvnnl";
    private String emailTosend;
    private String subjectsend;
    private String contentsend;
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;
    private MimeBodyPart mAdjuntos, mContenido;
    public MimeMultipart mElementosCorreo;
    
    private File[] mArchivosAdjuntos;
    private String nombres_archivos;
    
    public Correo_Control(Correo_Vista obj){
        sub = obj;
        mProperties = new Properties();
        nombres_archivos = "";
    }
    
    public void escoger(){
        JFileChooser chooser = new JFileChooser();
       chooser.setMultiSelectionEnabled(true);
       chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
       
        if (chooser.showOpenDialog(null) != JFileChooser.CANCEL_OPTION) { //AVISO!!!!
            mArchivosAdjuntos = chooser.getSelectedFiles();
            
            for (File archivo : mArchivosAdjuntos) {
                nombres_archivos += archivo.getName() + "<br>";
            }
            
            sub.labarchivos.setText("<html><p>" + nombres_archivos + "</p></html>");
        }
    }
    public void createEmail(){
            emailTosend = sub.emailTo.getText();
            subjectsend = sub.subject.getText();
            contentsend = sub.content.getText();
            
            
         // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user",emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        
        try {
            mElementosCorreo = new MimeMultipart();
            // Contenido del correo
            
            mContenido = new MimeBodyPart();
            mContenido.setContent(contentsend,"text/html; charset=utf-8");
            mElementosCorreo.addBodyPart(mContenido);
            
            //Agregar archivos adjuntos.
            mAdjuntos = null;
            for (int i = 0; i < mArchivosAdjuntos.length; i++) {
                mAdjuntos = new MimeBodyPart();
                mAdjuntos.setDataHandler(new DataHandler(new FileDataSource(mArchivosAdjuntos[i].getAbsolutePath())));
                mAdjuntos.setFileName(mArchivosAdjuntos[i].getName());
                mElementosCorreo.addBodyPart(mAdjuntos);
            }
            
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTosend));
            mCorreo.setSubject(subjectsend);
            mCorreo.setContent(mElementosCorreo);
           // mCorreo.setText(contentsend, "ISO-8859-1","html");
                     
            
        } catch (AddressException ex) {
            Logger.getLogger(Correo_Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Correo_Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sendEmail(){
        
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
            //lblAdjuntos.setText("");
            //nombres_archivos = "";
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Correo_Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Correo_Control.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(sub.salir)){
            sub.setVisible(false);
            sub.mp.setVisible(true);
        }
        if(e.getSource().equals(sub.enviar)){
        //System.out.println("Se presiono enviar");
        createEmail();
        sendEmail();
        
    }
        if(e.getSource().equals(sub.archivos)){
        //System.out.println("Se presiono archivos");
        escoger();
        
    }
    
}}
