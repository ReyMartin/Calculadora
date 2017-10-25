package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;


public class ControladorLetra implements MouseListener {

   String caption;
   JTextField campo_texto; 
   Double ultimo_num;
   Double acumulador;
   JTextField campo_total;
   Double rst;
   
    public ControladorLetra(String pcaption_num, JTextField pcampo_texto, Double ultimo_num, Double pacumulador, JTextField pcampo_total) {
        this.caption = pcaption_num;
        this.campo_texto = pcampo_texto;
        this.ultimo_num = ultimo_num;
        acumulador = pacumulador;
        campo_total = pcampo_total;
        
    }

    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        this.campo_texto.setText(campo_texto.getText() + caption); //Acumula lo que tiene escrito + lo que entra.
        
        this.ultimo_num = Double.valueOf(caption); //Este metodo transforma el capuchon del boton "caption" en Double para poder sumarlo.
        
       // acumulador = ultimo_num;
        acumulador= Double.parseDouble(campo_texto.getText());//Ver este metodo
        rst = acumulador + ultimo_num;
        campo_total.setText(rst.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
