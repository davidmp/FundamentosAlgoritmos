/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class SubPrograma {
   static Scanner leer;//Variable Global
    
    //Funcion o Metodo para calcular el factorial de X numero
    int factorial(int numero){
    int contador=1, result=1;//definir variable local
        while (contador<=numero) {            
          result=result*contador;
          contador++;//Incrementa en una unidad
        }
    return result;
    }
    long factorialLong(int numero){
    long contador=1;
    long result=1;//definir variable local
        while (contador<=numero) {            
          result=result*contador;
          contador++;//Incrementa en una unidad
        }
    return result;
    }
    BigInteger factorialBigNumber(int numero){
    long contador=1;
    BigInteger result=new BigInteger("1");//definir variable local
        while (contador<=numero) {            
          result=result.multiply(BigInteger.valueOf(contador));
          contador++;//Incrementa en una unidad
        }
    return result;
    }
    
    void calcFactRangoNum(int numInicio, int numFinal){         
        for (int i = numInicio; i <= numFinal; i++) {
            if(i>=65){
            System.out.println("El Factorial de "+i+" es:"+factorialBigNumber(i));
            }else if(i>=34){
            System.out.println("El Factorial de "+i+" es:"+factorialLong(i));
            }else{
            System.out.println("El Factorial de "+i+" es:"+factorial(i));
            }
        }
    }
    
    
    public static void main(String[] args) {
        SubPrograma sp=new SubPrograma();//definiendo Objeto de SubPrograma
        System.out.println("Ingres el rango de numeros para calcular el Factorial");
        System.out.print("Ingrese el Primer numero:");
        leer=new Scanner(System.in);//definiendo un Objeto
        int numI=leer.nextInt();
        System.out.print("\nIngrese el numero Final:");
        int numF=leer.nextInt();
        sp.calcFactRangoNum(numI, numF);
    }
    
}
