
package imc.imc_calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CASOS_DE_TESTE {
    String nome;
    String cpf;
    Float peso;
    Float altura;
    
    Float Calcular_IMC(){
        Float IMC_final = peso/(altura*altura);
        return IMC_final;
    }
    String consultarStatus(){
        Float status = Calcular_IMC();
        if (status <= 18.5){
            return "Magreza";
        } else if (status <= 24.9){
            return "Normal";
        } else if (status <= 29.9){
            return "Sobrepeso";
        } else if (status <= 39.9){
            return "Obesidade";
        } else {
            return "Obesidade grave";
        }    
    }
    
}
