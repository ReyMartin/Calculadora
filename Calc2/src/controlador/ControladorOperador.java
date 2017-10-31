package controlador;

import Principal.Datos_Calc;
import static Principal.Teclado.acumulador;
import static Principal.Teclado.ultimo_num;
import static Principal.Teclado.ultimo_op;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorOperador implements MouseListener {

        String caption_op;
        JTextField campo_texto;
        JTextField campo_total;
       // String campo_total1;
        Datos_Calc datosCalc;
        
        
        
    public ControladorOperador(String pcaption_op, JTextField pcampo_texto, JTextField pcampo_total, Datos_Calc pdatosCalc){
                
        this.caption_op = pcaption_op;
        this.campo_texto = pcampo_texto;
        this.campo_total = pcampo_total;
        this.datosCalc = pdatosCalc;
        }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        this.campo_texto.setText(campo_texto.getText() + caption_op); // Campo acumulador de cadena.
        
        ultimo_op = caption_op;
        if(caption_op.equals("=")){
            this.campo_total.setText(acumulador.toString());            
            ultimo_op = "";
            acumulador = 0.0;
        }else if(caption_op.equals("+")){
           System.out.println(ultimo_num);
           acumulador = acumulador + Double.valueOf(ultimo_num);
        }
        ultimo_num = "";
        
               
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
