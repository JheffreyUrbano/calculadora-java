/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora1;

/**
 *
 * @author USER
 */

import vista.calculadoraCientificaGUI;
import Controlador.ControladorCalculadora;


public class Calculadora1 {

    public static void main(String[] args) {
        // 1. Instanciamos la vista
        calculadoraCientificaGUI vista = new calculadoraCientificaGUI();
        
        // 2. Instanciamos controlador
        ControladorCalculadora controlador = new ControladorCalculadora(vista);
        
        // 3. Arrancamos el JFrame
        controlador.iniciar();
    }
}
