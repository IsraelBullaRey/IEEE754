/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ConversionIEEE754;

/**
 *
 * @author ACER 59AL
 */
public class Test {
    public static void main(String[] args) {
        ConversionIEEE754 ie = new ConversionIEEE754();
        ie.conversionPregunta(102.375, true);
        ie.conversionPregunta(-15.875, true);
        ie.conversionPregunta(-0.03125, false);
        ie.conversionPregunta(99.99, false);
    }
}
