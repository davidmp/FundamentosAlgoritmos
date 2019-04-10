
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Software Student
 */
public class AlgoritmosRepaso {

    /**
     * @param args the command line arguments
     */
    
    public static void determinarFactN(){
        int numF, inc=1, resultF=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese de numero del Factorial que desea calcular:");
        numF=leer.nextInt();
        while(inc<=numF){
            resultF=resultF*inc;
            inc++;
        }
        System.out.println("El Factorial de "+numF+" es:"+resultF);
    }
    public static void main(String[] args) {        
        determinarFactN();
    }
    
}
