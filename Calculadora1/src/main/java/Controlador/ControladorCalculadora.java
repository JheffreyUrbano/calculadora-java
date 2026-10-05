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
        //Eventos con gets de la vista
    }
}