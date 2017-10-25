package datos;

import controlador.ControladorLetra;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Letra extends JButton {
    
    private String caption_num;
    private JTextField campo_texto;
    private ControladorLetra controladorLetra;
    private Double ultimo_num;
    private Double acumulador;
    private JTextField campo_total;
    
public Letra(String caption_num, JTextField campo_texto, Double ultimo_num ,Double pacumulador, JTextField pcampo_total){
    
    this.caption_num = caption_num;
    this.campo_texto = campo_texto;
    this.ultimo_num = ultimo_num;
    acumulador = pacumulador;
    campo_total=  pcampo_total;
    this.setText(caption_num);
    
    controladorLetra = new ControladorLetra(caption_num, campo_texto, ultimo_num , acumulador, campo_total);
    this.addMouseListener(controladorLetra);


    }
}