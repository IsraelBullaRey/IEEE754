/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ACER 59AL
 */
public class ConversionDecimal {
    private String ieee;
    private String signo = "";
    private String exponente = "";
    private String mantisa = "";
    
    private double signoDecimal;
    private double exponenteDecimal;
    private double flotante;
    private double decimal;
    
    public void convertir(String ieee, boolean dato) {
        this.setIeee(ieee);
        this.setSigno("");
        this.setExponente("");
        this.setMantisa("");
        if (dato) {
            convertir32bits();
        } else {
            convertir64bits();
        }
    }

    private void convertir32bits() {
        if (ieee.length()!=32) throw new RuntimeException("El tamaño ingresado no concuerda con los 32 bits...");
        evaluarIEEE();
        signo = Character.toString(ieee.charAt(0));
        for (int i = 1; i <= 8; i++) {
            exponente += Character.toString(ieee.charAt(i));
        }
        for (int i = 9; i < 32; i++) {
            mantisa += Character.toString(ieee.charAt(i));
        }
        if (signo.equals("0")) signoDecimal = 1;
        if (signo.equals("1")) signoDecimal = -1;
        exponenteDecimal = binarioDecimal(exponente);
        exponenteDecimal -= 127;
        flotante = convertirMantisa();
        decimal = ((flotante+1) * Math.pow(2, exponenteDecimal))*signoDecimal;
        
        System.out.println("Decimal: " + decimal);
    }
    
    private void convertir64bits() {
        if (ieee.length()!=64) throw new RuntimeException("El tamaño ingresado no concuerda con los 64 bits...");
        evaluarIEEE();
        signo = Character.toString(ieee.charAt(0));
        for (int i = 1; i <= 11; i++) {
            exponente += Character.toString(ieee.charAt(i));
        }
        for (int i = 12; i < 64; i++) {
            mantisa += Character.toString(ieee.charAt(i));
        }
        if (signo.equals("0")) signoDecimal = 1;
        if (signo.equals("1")) signoDecimal = -1;
        exponenteDecimal = binarioDecimal(exponente);
        exponenteDecimal -= 1023;
        flotante = convertirMantisa();
        decimal = ((flotante+1) * Math.pow(2, exponenteDecimal))*signoDecimal;
        
        System.out.println("Decimal: " + decimal);
    }
    
    private void evaluarIEEE(){
        for (int i = 0; i < ieee.length(); i++) {
            if (ieee.charAt(i) != '0' && ieee.charAt(i) != '1') {
                throw new RuntimeException("No es posible realizar una operacion con un número que no es IEEE754...");
            }
        }
    }

    private long binarioDecimal(String numero) {
        long resultado = 0;
        int exponenteDe2 = 0;
        for (int i = numero.length() - 1; i >= 0; i--) {
            resultado += Integer.parseInt(String.valueOf(numero.charAt(i))) * Math.pow(2, exponenteDe2);
            exponenteDe2++;
        }
        return resultado;
    }
    
    private double convertirMantisa() {
        double res = 0;
        for (int i = 0; i < mantisa.length(); i++) {
            if (mantisa.charAt(i) == '1') {
                res += Math.pow(2, (i+1)*-1);
            }
        }
        return res;
    }
    
    public String getIeee() {
        return ieee;
    }

    public void setIeee(String ieee) {
        this.ieee = ieee;
    }    

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getExponente() {
        return exponente;
    }

    public void setExponente(String exponente) {
        this.exponente = exponente;
    }

    public String getMantisa() {
        return mantisa;
    }

    public void setMantisa(String mantisa) {
        this.mantisa = mantisa;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
    
}
