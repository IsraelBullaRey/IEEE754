/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ConversionIEEE754;
import Modelo.ConversionDecimal;

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
        ie.conversionPregunta(10.5, false);
        
        ConversionDecimal c = new ConversionDecimal();
        c.preguntarConversion("01000000101000000000000000000000", true);
        c.preguntarConversion("0100000000100101000000000000000000000000000000000000000000000000", false);
        c.preguntarConversion("1100000000001001000000000000000000000000000000000000000000000000", false);
        //c.preguntarConversion("111", true);
        c.preguntarConversion("111", false);
    }
}
