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
        
        try{
            // captura falla de número sino es double
            double num1 = Double.parseDouble(vista.getTxtNumero1().getText());
            double num2 = 0; //
            
            // condicional para ver que operacion pide el usuario
            if(e.getSource()==vista.getBtnRaizCuadrada()){
                operacion = new RaizCuadrada();
            } else if (e.getSource() == vista.getBtnRaizCubica()){
                operacion = new RaizCubica();
            } else if (e.getSource() == vista.getBtnLogaritmo()) {
                operacion = new LogaritmoNatural();
            }
            
            if(operacion != null){
                double resultado = operacion.calcular(num1, num2); //ejecuta calcular de
                                                                   //la clase hija definida
                vista.getLblResultado().setText(""+resultado);
                operacion = null; //reinicia para el siguiente action
            }
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido en la casilla 1");
        }
    }
}