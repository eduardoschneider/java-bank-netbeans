/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author eduardo.schneider
 */
public class Taxas {
    Double[] selicAnual = {9.25, 9.25, 8.25, 7.50, 7.50, 7.00, 7.00, 6.75, 6.5, 6.5, 6.5, 6.5};//julho/x a junho/x+1
    Double[] selicMensal = {0.8, 0.8, 0.64, 0.64, 0.57, 0.54, 0.58, 0.47, 0.53, 0.52, 0.52, 0.52};
    Double[] cdiMensal = {0.7971, 0.8014, 0.6377, 0.6431, 0.5674, 0.5376, 0.5833, 0.4649, 0.5315, 0.5175, 0.5175, 0.5175};
    Double[] cdiDiario = {0.0265, 0.0267, 0.0531, 0.0214, 0.0189, 0.0179, 0.0194, 0.0154, 0.0177, 0.172, 0.172, 0.172};

    public Double[] getSelicAnual() {
        return selicAnual;
    }

    public Double[] getSelicMensal() {
        return selicMensal;
    }

    public Double[] getCdiMensal() {
        return cdiMensal;
    }

    public Double[] getCdiDiario() {
        return cdiDiario;
    }
}

