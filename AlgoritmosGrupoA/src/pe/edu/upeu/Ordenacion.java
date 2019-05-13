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
public class Ordenacion {
    
    public int[] ordenacionXInsercionD(int[] vector){
        int aux, j;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            j=i;
            while(j>0 && aux<vector[j-1]){
            vector[j]=vector[j-1];
            j--;
            }
            vector[j]=aux;
        }        
    return vector;
    }
    public int[] ordenacionXInsercionDD(int[] vector){
        int aux, j;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            j=i;
            while(j>0 && aux>vector[j-1]){
            vector[j]=vector[j-1];
            j--;
            }
            vector[j]=aux;
        }        
    return vector;
    }
    public int[] ordenacionDecreciente1(int[] vec){
        int aux, j;
        for (int i = 1; i < vec.length; i++) {
            aux=vec[i];
            j=i;
            while(j>0 && aux>vec[j-1]){
            vec[j]=vec[j-1];
            j--;
            }
            vec[j]=aux;
        }        
    return vec;
    }
    public int[] ordenacionDecreciente2(int[] venc){
        int aux, j;
        for (int i = 1; i < venc.length; i++) {
            aux=venc[i];
            j=i;
            while(j>0 && aux>venc[j-1]){
            venc[j]=venc[j+1];
            j--;
            }
            venc[j]=aux;
        }        
    return venc;
    }
    
    
    public void imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]="+vector[i]);
        }
    }    
    public static void main(String[] args) {
        int[] vector={2,6,1,3,4};
        Ordenacion or=new Ordenacion();
        //or.imprimir(vector);
        /*System.out.println("Ordenado");
        or.imprimir(or.ordenacionXInsercionD(vector));  
        System.out.println("Ordenado Descendente");
        or.imprimir(or.ordenacionXInsercionDD(vector));*/    
        or.imprimir(or.ordenacionDecreciente1(vector));
        System.out.println("new met...");
        or.imprimir(or.ordenacionDecreciente2(vector));
    }
}
