package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorOperador implements MouseListener {

        String caption_op;
        JTextField campo_texto;
        JTextField campo_total;
        Double acumulador;
        Double ultimo_num;
        String ultimo_op;
        Double rst;
        String campo_total1;
        
        
        
    public ControladorOperador(String pcaption_op, JTextField pcampo_texto, JTextField pcampo_total,
                          Double pacumulador, Double pultimo_num, String pultimo_op, Double prst){
                
        this.caption_op = pcaption_op;
        this.campo_texto = pcampo_texto;
        this.campo_total = pcampo_total;
        this.acumulador = pacumulador;
        this.ultimo_num = pultimo_num;
        this.ultimo_op = pultimo_op;
        rst = prst;
         
        }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        this.campo_texto.setText(campo_texto.getText() + caption_op); // Campo acumulador de cadena.
        
        this.ultimo_op = caption_op;
        
        
        
        
        
       this.acumulador = ultimo_num ;
        ultimo_num= acumulador + ultimo_num;
        
        //this.rst = acumulador + ultimo_num;
        //this.rst = acumulador - ultimo_num;
        //this.rst = acumulador * ultimo_num;
        //this.rst = acumulador / ultimo_num;
        
       //rst=acumulador;
       
        this.campo_total.setText(ultimo_num.toString());
             
    
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
