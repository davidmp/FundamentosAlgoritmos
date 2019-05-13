/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

/**
 *
 * @author Docente
 */
public class Busqueda {
  
    public static void busquedaSecuencial(){
    int vectorX[]={1,6,3,4,20,10,14,4,6};
        System.out.println("T:"+vectorX.length);
        System.out.println("T:"+vectorX[6]);
        vectorX[6]=16;
        System.out.println("T:"+vectorX[6]);
    }
    
    public void busquedaSecuencial1(){
    int vectorX[]={1,6,3,4,20,10,14,4,6};
        System.out.println("T:"+vectorX.length);
        System.out.println("T:"+vectorX[6]);
        vectorX[6]=16;
        System.out.println("T:"+vectorX[6]);
    }    
    public void busquedaSecuencial2(int vectorX[]){    
        System.out.println("T:"+vectorX.length);
        System.out.println("T:"+vectorX[6]);
        vectorX[6]=16;
        System.out.println("T:"+vectorX[6]);
    } 
    public void busquedaSecuencial3(int vectorX[], int posicion){    
        System.out.println("T:"+vectorX.length);
        System.out.println("T:"+vectorX[posicion]);
        vectorX[posicion]=16;
        System.out.println("T:"+vectorX[posicion]);
    } 
    public int busquedaSecuencialR(int vector[],int valorB){
        int posicion=0, indi=0;//es el mismo indice       
        for (int indice = 0; indice < vector.length; indice++) {
            if(valorB==vector[indice]){
            posicion=indice;
            indi=1;
            break;
            }
            System.out.println("Ciclo "+indi);
        }
        if(indi==0){
            System.out.println("No se encontro el Valor");
        }else{
            System.out.println("si existe el Valor");
        }
        return posicion;
    }
    
    public int busquedaSecuencialR1(int vector[], int numero){
        int cantidadNumRepitentes=0;
        for (int i = 0; i < 8; i++) {
            if(vector[i]==numero){
                //cantidadNumRepitentes = cantidadNumRepitentes + 1;
                //Si es IGUAL CANT ´cantidadNumRepitentes´ AUMENTA 1;
                cantidadNumRepitentes++;
            }
        }
        
        return cantidadNumRepitentes;
    }
    public static void main(String[] args) {
        busquedaSecuencial();        
        System.out.println("\n Segunda Forma:");
        Busqueda b=new Busqueda();        
        b.busquedaSecuencial1();   
        System.out.println("\n Tercera Forma:");
        int vectorXX[]={1,6,3,3,20,14,4,6};   //Numeros repetidos 2 el 3     
        b.busquedaSecuencial2(vectorXX);
        System.out.println("\n Cuarta Forma:");
        b.busquedaSecuencial3(vectorXX,4);
        System.out.println("\n Busqueda Secuencial:");
        System.out.println("El valor se encuentra en la Poscion:"+b.busquedaSecuencialR(vectorXX, 3));
        System.out.println("Cantida de numeros: \t"+b.busquedaSecuencialR1(vectorXX, 3));
        int vectorXXX[]={1,18,3,17,20,14,4,6};       
        System.out.println("Metodo de Ordenacion x Insercion D");
        b.imprimir(b.ordenacionXInsercionD(vectorXXX));
        
    }
    
    //Algoritmo de Ordenación
    public int[] ordenacionXInsercionD(int[] vector){
        int aux, j;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            j=i;
            while (j>0 && aux<vector[j-1]) {                
                vector[j]=vector[j-1]; 
                j--;
            }
            vector[j]=aux;            
        }        
    return vector;
    }
    public void imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]="+vector[i]);
        }
    }
    
    
}
