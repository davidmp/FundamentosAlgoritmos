/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;


import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author Docente
 */
public class SubPrograma {   
    
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
    
    
    public static void main(String[] args) throws IOException {
        SubPrograma sp=new SubPrograma();//definiendo Objeto de SubPrograma
        LeetTeclado br=new LeetTeclado();        
        System.out.println("Ingres el rango de numeros para calcular el Factorial");       
        int numI=br.leer(0, "Ingrese el Primer numero:");        
        int numF=br.leer(0, "Ingrese el numero Final:");
        sp.calcFactRangoNum(numI, numF);
                                
        String nombre =br.leer("", "Coloque su nombre:");
        System.out.println("El nombre es:"+nombre);
        
    }
    
}
