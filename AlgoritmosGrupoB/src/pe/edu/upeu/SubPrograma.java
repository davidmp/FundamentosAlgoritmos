/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class SubPrograma {
    Scanner leer;//Variable Global
    
    //Funcion o Metodo para calcular el factorial de X numero
    int factorial(int numero){
    int contador=1, result=1;//definir variable local
        while (contador<=numero) {            
          result=result*contador;
          contador++;//Incrementa en una unidad
        }
    return result;
    }
    
    void calcFactRangoNum(int numInicio, int numFinal){      
        for (int i = numInicio; i <= numFinal; i++) {
            System.out.println("El Factorial de "+i+" es:"+factorial(i));
        }
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
