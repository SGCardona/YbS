
package Modelo;

import static Modelo.DatosConexion.baseDatos;
import static Modelo.DatosConexion.host;
import static Modelo.DatosConexion.login;
import static Modelo.DatosConexion.user;
import Vista.MenuPrincipal_Vista;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;



public class Pdf implements DatosConexion{
    
    public MenuPrincipal_Vista mp;

    public Pdf(MenuPrincipal_Vista mp) {
        this.mp = mp;
    }
    
    public void generar(String lista){
        Document documento = new Document();
        
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Registros.pdf"));
            documento.open();
            documento.newPage();
            
            PdfPTable tabla = new PdfPTable(10);
            tabla.addCell("Placa");
            tabla.addCell("Dia Entrada");
            tabla.addCell("Mes Entrada");
            tabla.addCell("Year Entrada");
            tabla.addCell("Hora Entrada");
            tabla.addCell("Dia Salida");
            tabla.addCell("Mes Salida");
            tabla.addCell("Year Salida");
            tabla.addCell("Hora Salida");
            tabla.addCell("Estado");
            
            try {
                Conexion con = new Conexion();
                boolean error = con.conectarMySQL(baseDatos, user, login, host);
                if(!error){
                    String registro[][] = con.consultaMatriz("select * from " + lista);
                    for (int c = 0; c < registro.length; c++) {
                        for (int f = 0; f < registro[c].length; f++) {
                            tabla.addCell(registro[c][f]);
                        }
                    }
                }
                documento.add(tabla);
                
            } catch (DocumentException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }
}


