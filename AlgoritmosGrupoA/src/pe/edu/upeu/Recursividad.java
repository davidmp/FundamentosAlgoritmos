/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

/**
 *
 * @author Software Student
 */
public class Recursividad {
   int factorial(int numero) {
       if(numero<=1){
        System.out.println("Ciclo if "+numero);
        return 1;
       }
       else{
        System.out.println("Ciclo else "+numero);
        return numero*factorial(numero-1);
       }
   }
   
    public long fibonacii(int numero){
        long f=0, fsig=1;
        for(int i=0; i<numero;i++){
            long aux=fsig;
            fsig+=f;
            f=aux;
        }
        return (f);
    }
    
    public long fibonacir(int numero){
        if(numero<0)
            return -1;
        else if(numero==0)
            return 0;
        else if(numero==1)
                return 1;
            else
                return fibonacir(numero-1)+fibonacir(numero-2);
    }
    
    public static void main(String[] args) {
       Recursividad r=new Recursividad();
      // System.out.println("Recursividad de 0:"+r.factorial(0));
       //System.out.println("Recursividad de 1:"+r.factorial(1));
       //System.out.println("Recursividad de 2:"+r.factorial(2));
       //System.out.println("Recursividad de 3:"+r.factorial(3));
       //System.out.println("Recursividad de 4:"+r.factorial(4));
       System.out.println("Recursividad de 5:"+r.factorial(5));
    }
}
