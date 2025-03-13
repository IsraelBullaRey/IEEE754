/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 1152358 - Israel Bulla Rey.
 *         1152384 - Jose Luis Jiménez Bayona.
 */
public class ConversionIEEE754 {

    private double num;
    private String signo = "";
    private String exponente = "";
    private String mantisa = "";
    
    
    public void conversionPregunta(double numero, boolean dato) {
        this.setNum(numero);
        this.setSigno("");
        this.setExponente("");
        this.setMantisa("");
        if (dato) {
            convertirDecimalIEEE32bits();
        } else{
            convertirDecimalIEEE64bits();
        }
    }
    
    private void convertirDecimalIEEE32bits() {
        if (num >= 0) signo = "0";
        if (num < 0) {
            signo = "1";
            num *= -1;
        }
        if (num == 0) {
            exponente = "00000000";
            mantisa = "00000000000000000000000";
        } else {
            int exp = buscarExponente();
            exponente = decimalABinario(127 + exp);
            arregloExp32bits();
            hallarMantisa32bits();
            System.out.println("Signo: " + signo);
            System.out.println("Exponente: " + exponente);
            System.out.println("Mantisa: " + mantisa);
        }
    }
    
    private void convertirDecimalIEEE64bits() {
        if (num >= 0) signo = "0";
        if (num < 0) {
            signo = "1";
            num *= -1;
        }
        if (num == 0) {
            exponente = "00000000000";
            mantisa = "0000000000000000000000000000000000000000000000000000";
        } else {
            int exp = buscarExponente();
            exponente = decimalABinario(1023 + exp);
            arregloExp64bits();
            hallarMantisa64bits();
            System.out.println("Signo: " + signo);
            System.out.println("Exponente: " + exponente);
            System.out.println("Mantisa: " + mantisa);
        }
    }

    private int buscarExponente() {
        if (num == 0) return 0;
        int ex = 0;
        if (num >= 2) {
            while (num >= 2) {
                num /= 2;
                ex++;
            }
        }
        if (num < 1) {
            while (num < 1) {
                num *= 2;
                ex--;
            }
        }
        return ex;
    }

    private String decimalABinario(int exponente) {
        String resultado = "";
        while (exponente > 0) {
            resultado = exponente % 2 + resultado;
            exponente = exponente / 2;
        }

        return resultado;
    }
    
    private void arregloExp32bits() {
        while (exponente.length() != 8) {
                exponente = "0" + exponente;
        }
    }
    
    private void arregloExp64bits() {
        while (exponente.length() != 11) {
                exponente = "0" + exponente;
        }
    }

    private void hallarMantisa32bits() {
        num -= 1;
        while (num != 1 && mantisa.length() < 23) {
            num *= 2;
            if (num > 1) {
                num-=1;
                mantisa += "1";
            }
            else if (num == 1) {
                mantisa += "1";
            }
            else {
                mantisa += "0";
            }
        }
        arregloMantisa32bits();
    }
    
    private void arregloMantisa32bits() {
        while(mantisa.length() < 23) {
            mantisa += "0";
        }
    }
    
    private void hallarMantisa64bits() {
        num -= 1;
        while (num != 1 && mantisa.length() < 52) {
            num *= 2;
            if (num > 1) {
                num-=1;
                mantisa += "1";
            }
            else if (num == 1) {
                mantisa += "1";
            }
            else {
                mantisa += "0";
            }
        }
        arregloMantisa64bits();
    }
    
    private void arregloMantisa64bits() {
        while(mantisa.length() < 52) {
            mantisa += "0";
        }
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
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

}
