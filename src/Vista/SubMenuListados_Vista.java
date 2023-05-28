
package Vista;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SubMenuListados_Vista extends JFrame{
    
    public MenuPrincipal_Vista mp;

    public SubMenuListados_Vista(MenuPrincipal_Vista mp) throws HeadlessException {
        super("Sub Menu Listas");
        this.mp = mp;
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(null);
        GUI();
        setVisible(true);
    }
    public void GUI(){
        getContentPane().setBackground(new Color(37, 44, 235));
        Image icn = new ImageIcon(getClass().getResource("../Imagenes/Car_Icon.png")).getImage();
        setIconImage(icn);
        setResizable(false);
    }
    
    
}
