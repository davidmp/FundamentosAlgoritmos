
import java.util.Scanner;


public class AlgoritmosRepaso {
    
    static Scanner leer=new Scanner(System.in);
    public static void determinarFactN(){
        int numF, inc=1, resultF=1;
        
        System.out.println("Ingrese de numero del Factorial que desea calcular:");
        numF=leer.nextInt();
        while(inc<=numF){
            resultF=resultF*inc;
            inc++;
        }
        System.out.println("El Factorial de "+numF+" es:"+resultF);
    }
    public static int sumarNumentre2valores(int mayor, int menor){
        
        int sumaPositivos = 0;
        for(int i = menor; i <= mayor; i++){
            if(i%2==0){
                sumaPositivos = sumaPositivos + i;
            } 
        }
        return sumaPositivos;
    }
    
    public static void sumaNumeroEntre2ValoresForm2(){
        int n1,n2, mayor, menor;
        System.out.println("Ingrese numero 1: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        n2 = leer.nextInt();
        if(n1>n2){
            mayor=n1;
            menor=n2;
        }else{
         mayor=n2;
         menor=n1;
        }    
        int sumaPositivos = 0;
        for(int i = menor; i <= mayor; i++){
            if(i%2==0){                
                sumaPositivos = sumaPositivos + i;                
            } 
            System.out.println("Valor de i="+i+" : Valor de sumaPositivos = "+sumaPositivos);
        }        
        System.out.println("\nLa suma de los positivos es:"+sumaPositivos);
    }
    
    public static void main(String[] args) {        
        //determinarFactN();
        /* int n1,n2;
        System.out.println("Ingrese numero 1: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        n2 = leer.nextInt();
        if(n1>n2){
            System.out.println("La suma de los positivos es: " + sumarNumentre2valores(n1, n2));
            
        }
        else{
            System.out.println("La suma de los positivos es: " + sumarNumentre2valores(n2, n1));
        }*/
        sumaNumeroEntre2ValoresForm2();
    }
    
}
