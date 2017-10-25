package datos;

import controlador.ControladorOperador;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Operador extends JButton {
    
    private String caption_op ;
    private JTextField campo_texto;
    private JTextField campo_total;
    private ControladorOperador controladorOperador ;
    private Double acumulador;
    private Double ultimo_num;
    private String ultimo_op;
    private Double rst;
    

    public Operador(String pcaption_op, JTextField pcampo_texto, JTextField pcampo_total, Double pacumulador,
                        Double pultimo_num, String pultimo_op, Double prst){
    
        this.caption_op = pcaption_op;
        this.campo_texto = pcampo_texto;
        this.campo_total = pcampo_total;
        this.setText(caption_op);
        this.acumulador = pacumulador;
        this.ultimo_num = pultimo_num;
        this.ultimo_op = pultimo_op;
        rst = prst;
        
        controladorOperador = new ControladorOperador(caption_op, campo_texto, campo_total, acumulador, ultimo_num, ultimo_op, rst);
        addMouseListener(controladorOperador);
        }

}
