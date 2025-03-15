/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author 1152358 - Israel Bulla Rey
 *         1152384 - Jose Luis Jiménez Bayona
 */
/**
 * Sample Skeleton for 'ieee754.fxml' Controller Class
 */
import Modelo.ConversionDecimal;
import Modelo.ConversionIEEE754;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class IeeeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cmdBorrar32Decimal"
    private Button cmdBorrar32Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdBorrar64Decimal"
    private Button cmdBorrar64Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdBorrarTodoDecimalIEEE"
    private Button cmdBorrarTodoDecimalIEEE; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCon32BitsDecimalInicio"
    private Button cmdCon32BitsDecimalInicio; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCon32Decimal"
    private Button cmdCon32Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCon64BitsDecimalInicio"
    private Button cmdCon64BitsDecimalInicio; // Value injected by FXMLLoader

    @FXML // fx:id="cmdCon64Decimal"
    private Button cmdCon64Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConDecimalIEEE"
    private Button cmdConDecimalIEEE; // Value injected by FXMLLoader

    @FXML // fx:id="cmdConDecimalIEEEInicio"
    private Button cmdConDecimalIEEEInicio; // Value injected by FXMLLoader

    @FXML // fx:id="cmdRegresar32Decimal"
    private Button cmdRegresar32Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="cmdRegresar64Decimal"
    private Button cmdRegresar64Decimal; // Value injected by FXMLLoader
    
    @FXML // fx:id="cmdRegresarDecIeee"
    private Button cmdRegresarDecIeee; // Value injected by FXMLLoader
    
    @FXML // fx:id="tabs"
    private TabPane tabs; // Value injected by FXMLLoader

    @FXML // fx:id="tab32Decimal"
    private Tab tab32Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="tab64Decimal"
    private Tab tab64Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="tabDecimalIEEE"
    private Tab tabDecimalIEEE; // Value injected by FXMLLoader

    @FXML // fx:id="tabIncio"
    private Tab tabIncio; // Value injected by FXMLLoader

    @FXML // fx:id="txt32Decimal"
    private TextField txt32Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="txt64Decimal"
    private TextField txt64Decimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtExponente32Bits"
    private TextField txtExponente32Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtExponente64Bits"
    private TextField txtExponente64Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtInExpo32"
    private TextField txtInExpo32; // Value injected by FXMLLoader

    @FXML // fx:id="txtInExpo64"
    private TextField txtInExpo64; // Value injected by FXMLLoader

    @FXML // fx:id="txtInManti32"
    private TextField txtInManti32; // Value injected by FXMLLoader

    @FXML // fx:id="txtInManti64"
    private TextField txtInManti64; // Value injected by FXMLLoader

    @FXML // fx:id="txtInSigno32"
    private TextField txtInSigno32; // Value injected by FXMLLoader

    @FXML // fx:id="txtInSigno64"
    private TextField txtInSigno64; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngreso32Bits"
    private TextField txtIngreso32Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngreso64Bits"
    private TextField txtIngreso64Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtIngresoDecimal"
    private TextField txtIngresoDecimal; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisa32Bits"
    private TextField txtMantisa32Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtMantisa64Bits"
    private TextField txtMantisa64Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtSigno32Bits"
    private TextField txtSigno32Bits; // Value injected by FXMLLoader

    @FXML // fx:id="txtSigno64Bits"
    private TextField txtSigno64Bits; // Value injected by FXMLLoader
    
    ConversionDecimal cd = new ConversionDecimal();
    ConversionIEEE754 ci = new ConversionIEEE754();

    private void alertError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.setTitle("ERROR");
        alert.setHeaderText("Algo va mal...");
        alert.showAndWait();
    }
    
    private void alertInformation(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
        alert.setTitle("MENSAJE");
        alert.setHeaderText("Correcto...");
        alert.showAndWait();
    }
    
    @FXML
    void borrar32Decimal(ActionEvent event) {
        txtIngreso32Bits.setText("");
        txt32Decimal.setText("");
        txtInExpo32.setText("");
        txtInSigno32.setText("");
        txtInManti32.setText("");
        cmdCon32Decimal.setDisable(false);
        cmdBorrar32Decimal.setDisable(true);
    }

    @FXML
    void borrar64Decimal(ActionEvent event) {
        txtIngreso64Bits.setText("");
        txt64Decimal.setText("");
        txtInExpo64.setText("");
        txtInSigno64.setText("");
        txtInManti64.setText("");
        cmdCon64Decimal.setDisable(false);
        cmdBorrar64Decimal.setDisable(true);
    }

    @FXML
    void borrarDecimalIEEE(ActionEvent event) {
        txtIngresoDecimal.setText("");
        txtSigno32Bits.setText("");
        txtExponente32Bits.setText("");
        txtMantisa32Bits.setText("");
        txtSigno64Bits.setText("");
        txtExponente64Bits.setText("");
        txtMantisa64Bits.setText("");
        cmdConDecimalIEEE.setDisable(false);
        cmdBorrarTodoDecimalIEEE.setDisable(true);
    }

    @FXML
    void con32BitsDecimalInicio(ActionEvent event) {
        tabs.getSelectionModel().select(tab32Decimal);
        tabIncio.setDisable(true);
        tab32Decimal.setDisable(false);
        cmdBorrar32Decimal.setDisable(true);
    }

    @FXML
    void con32Decimal(ActionEvent event) {
        if (txtIngreso32Bits.getText().equals("")) {
            alertError("No ha ingresado ningún valor...");
        }
        else {
            try {
                cd.convertir(txtIngreso32Bits.getText(), true);
                txtInSigno32.setText(cd.getSigno());
                txtInExpo32.setText(cd.getExponente());
                txtInManti32.setText(cd.getMantisa());
                txt32Decimal.setText("" +cd.getDecimal());
                cmdCon32Decimal.setDisable(true);
                cmdBorrar32Decimal.setDisable(false);
            } catch (Exception e) {
                alertError(e.getMessage());
            }           
        }
    }

    @FXML
    void con64BitsDecimalInicio(ActionEvent event) {
        tabs.getSelectionModel().select(tab64Decimal);
        tabIncio.setDisable(true);
        tab64Decimal.setDisable(false);
        cmdBorrar64Decimal.setDisable(true);
    }

    @FXML
    void con64Decimal(ActionEvent event) {
        if (txtIngreso64Bits.getText().equals("")) {
            alertError("No ha ingresado ningún valor...");
        }
        else {
            try {
                cd.convertir(txtIngreso64Bits.getText(), false);
                txtInSigno64.setText(cd.getSigno());
                txtInExpo64.setText(cd.getExponente());
                txtInManti64.setText(cd.getMantisa());
                txt64Decimal.setText("" +cd.getDecimal());
                cmdCon64Decimal.setDisable(true);
                cmdBorrar64Decimal.setDisable(false);
            } catch (Exception e) {
                alertError(e.getMessage());
            }
            
        }        
    }

    @FXML
    void conDecimalIEEE(ActionEvent event) {
        if (txtIngresoDecimal.getText().equals("")) {
            alertError("No ha ingresado ningún valor...");
        }
        else {
            try {
                ci.convertirDecimalIEEE32bits(Double.parseDouble(txtIngresoDecimal.getText()));
                txtSigno32Bits.setText(ci.getSigno());
                txtExponente32Bits.setText(ci.getExponente());
                txtMantisa32Bits.setText(ci.getMantisa());

                ci.convertirDecimalIEEE64bits(Double.parseDouble(txtIngresoDecimal.getText()));
                txtSigno64Bits.setText(ci.getSigno());
                txtExponente64Bits.setText(ci.getExponente());
                txtMantisa64Bits.setText(ci.getMantisa());
                cmdConDecimalIEEE.setDisable(true);
                cmdBorrarTodoDecimalIEEE.setDisable(false);
            } catch (Exception e) {
                alertError(e.getMessage());
            }
            
        }   
    }

    @FXML
    void conDecimalIEEEInicio(ActionEvent event) {
        tabs.getSelectionModel().select(tabDecimalIEEE);
        tabIncio.setDisable(true);
        tabDecimalIEEE.setDisable(false);
        cmdBorrarTodoDecimalIEEE.setDisable(true);        
    }

    @FXML
    void regresar32Decimal(ActionEvent event) {
        borrar32Decimal(event);
        tabs.getSelectionModel().select(tabIncio);
        tabIncio.setDisable(false);
        tab32Decimal.setDisable(true);
    }

    @FXML
    void regresar64Decimal(ActionEvent event) {
        borrar64Decimal(event);
        tabs.getSelectionModel().select(tabIncio);
        tabIncio.setDisable(false);
        tab64Decimal.setDisable(true);
    }
    
    @FXML
    void regresarDecIeee(ActionEvent event) {
        borrarDecimalIEEE(event);
        tabs.getSelectionModel().select(tabIncio);
        tabIncio.setDisable(false);
        tabDecimalIEEE.setDisable(true);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmdBorrar32Decimal != null : "fx:id=\"cmdBorrar32Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdBorrar64Decimal != null : "fx:id=\"cmdBorrar64Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdBorrarTodoDecimalIEEE != null : "fx:id=\"cmdBorrarTodoDecimalIEEE\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdCon32BitsDecimalInicio != null : "fx:id=\"cmdCon32BitsDecimalInicio\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdCon32Decimal != null : "fx:id=\"cmdCon32Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdCon64BitsDecimalInicio != null : "fx:id=\"cmdCon64BitsDecimalInicio\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdCon64Decimal != null : "fx:id=\"cmdCon64Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdConDecimalIEEE != null : "fx:id=\"cmdConDecimalIEEE\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdConDecimalIEEEInicio != null : "fx:id=\"cmdConDecimalIEEEInicio\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdRegresar32Decimal != null : "fx:id=\"cmdRegresar32Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdRegresar64Decimal != null : "fx:id=\"cmdRegresar64Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert cmdRegresarDecIeee != null : "fx:id=\"cmdRegresarDecIeee\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert tab32Decimal != null : "fx:id=\"tab32Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert tab64Decimal != null : "fx:id=\"tab64Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert tabDecimalIEEE != null : "fx:id=\"tabDecimalIEEE\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert tabs != null : "fx:id=\"tabs\" was not injected: check your FXML file 'ieee754.fxml'.";        
        assert tabIncio != null : "fx:id=\"tabIncio\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txt32Decimal != null : "fx:id=\"txt32Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txt64Decimal != null : "fx:id=\"txt64Decimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtExponente32Bits != null : "fx:id=\"txtExponente32Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtExponente64Bits != null : "fx:id=\"txtExponente64Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtInExpo32 != null : "fx:id=\"txtInExpo32\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtInExpo64 != null : "fx:id=\"txtInExpo64\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtInManti32 != null : "fx:id=\"txtInManti32\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtInManti64 != null : "fx:id=\"txtInManti64\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtInSigno32 != null : "fx:id=\"txtInSigno32\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtInSigno64 != null : "fx:id=\"txtInSigno64\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtIngreso32Bits != null : "fx:id=\"txtIngreso32Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtIngreso64Bits != null : "fx:id=\"txtIngreso64Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtIngresoDecimal != null : "fx:id=\"txtIngresoDecimal\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtMantisa32Bits != null : "fx:id=\"txtMantisa32Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtMantisa64Bits != null : "fx:id=\"txtMantisa64Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtSigno32Bits != null : "fx:id=\"txtSigno32Bits\" was not injected: check your FXML file 'ieee754.fxml'.";
        assert txtSigno64Bits != null : "fx:id=\"txtSigno64Bits\" was not injected: check your FXML file 'ieee754.fxml'.";

        tab32Decimal.setDisable(true);
        tab64Decimal.setDisable(true);
        tabDecimalIEEE.setDisable(true);
        
        
    }

}
