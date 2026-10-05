package Controlador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jurbano
 */
import Modelo.*;
import vista.calculadoraCientificaGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane; // lo usamos para mostrar los errores

public class ControladorCalculadora implements ActionListener {

    private calculadoraCientificaGUI vista;
    private Operaciones operacion; // La clase padre que hicieron David y Sebastián

    public ControladorCalculadora(calculadoraCientificaGUI vista) {
        this.vista = vista;

        // Definimos que los botones obtenga la accion de la vista
        this.vista.getBtnSumar().addActionListener(this);
        this.vista.getBtnRestar().addActionListener(this);
        this.vista.getBtnMultiplicar().addActionListener(this);
        this.vista.getBtnDividir().addActionListener(this);
        this.vista.getBtnRaizCuadrada().addActionListener(this);
        this.vista.getBtnRaizCubica().addActionListener(this);
        this.vista.getBtnLogaritmo().addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Calculadora Cientifica");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            // captura falla de número sino es double
            double num1 = Double.parseDouble(vista.getTxtNumero1().getText());
            double num2 = 0; //iniciamos en 0, si la operacion requiere 2, usamos condicionales

            // Si la operacion requiere 2 numeros
            if (e.getSource() == vista.getBtnSumar() || e.getSource() == vista.getBtnRestar() || 
                e.getSource() == vista.getBtnMultiplicar() || e.getSource() == vista.getBtnDividir()) {
                if (e.getSource() == vista.getBtnSumar()) {
                    operacion = new Suma();
                } else if (e.getSource() == vista.getBtnRestar()) {
                    operacion = new Resta();
                } else if (e.getSource() == vista.getBtnMultiplicar()) {
                    operacion = new Multiplicacion();
                } else if (e.getSource() == vista.getBtnDividir()) {
                    operacion = new Division();
                }
                
            //Si la operacion es de un solo numero
            }else{   // condicional para ver que operacion pide el usuario
                    if(e.getSource()==vista.getBtnRaizCuadrada()){
                        operacion = new RaizCuadrada();
                    } else if (e.getSource() == vista.getBtnRaizCubica()){
                        operacion = new RaizCubica();
                    } else if (e.getSource() == vista.getBtnLogaritmo()) {
                        operacion = new LogaritmoNatural();
                    }
                }
        if (operacion != null) {
            double resultado = operacion.calcular(num1, num2); //ejecuta calcular de
                                                                //la clase hija definida
                                                                
            if(Double.isNaN(resultado)){
                vista.getLblResultado().setText("error matematico");
            }else{
                vista.getLblResultado().setText(""+resultado);
                }
            operacion = null;
        }
    }
    catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un números válidos en las casillas");
        }
    }
}
