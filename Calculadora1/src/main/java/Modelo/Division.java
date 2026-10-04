/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Division extends Operaciones {
    @Override
    public double calcular(double a, double b) {
       
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }
}
