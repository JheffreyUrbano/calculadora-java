/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class LogaritmoNatural extends Operaciones {
    @Override
    public double calcular(double a, double b) {
        if (a <= 0) {
            return Double.NaN;
        }
        return Math.log(a);
    }    
}
