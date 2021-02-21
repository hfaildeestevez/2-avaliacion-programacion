/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author hfe19
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ConversorTemperaturas converT = new ConversorTemperaturas();

        try {
            converT.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduce temperatura en ºC")));
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
}
