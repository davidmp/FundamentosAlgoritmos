package pe.edu.upeu;

import java.util.Scanner;

public class Mtriz {
    Scanner leerTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        Mtriz objeto = new Mtriz();
        objeto.ejercicio7_6();
        objeto.imprimirMatriz(objeto.transformada01(5, 1));
        
}
        public void ejercicio7_4(){
            int matriz[][]= new int [3][3];
            int vectorSumFilas[] = new int [3];
            int vectorSumColum[] = new int [3];
            
            //Pasado datos a la matriz
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("["+i+"]["+j+"]: ");
                    matriz[i][j] = leerTeclado.nextInt();
                    
                }
            }
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            //Suma de filas
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    vectorSumFilas[i] += matriz[i][j];
                }
            }
            
            //Suma de columnas
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    vectorSumColum[i] += matriz[j][i];
                }
            }
            System.out.println("Sum de filas Filas");
            //mostar la suma de las filas 
            for (int i = 0; i < vectorSumFilas.length; i++) {
                System.out.print(vectorSumFilas[i]+" ");
            }
            System.out.println("\nSum de filas Columnas");
            //Mostrar suma de columnas
            for (int i = 0; i < vectorSumColum.length; i++) {
                System.out.print(vectorSumColum[i]+" ");
            }
            System.out.println("");
        }
        
        public void ejercicio7_5(){
            int vector[] = new int [100];
            int tamVector, suma=0, media;
            System.out.print("Ingrese el numero de lementos del vector: ");
            tamVector = leerTeclado.nextInt();
            for (int i = 0; i < tamVector; i++) {
                System.out.print("Ingrese dato ["+i+"]: ");
                vector[i] = leerTeclado.nextInt();
                suma += vector[i];
            }
            media = suma/tamVector;
            
            System.out.println("La suma es: " +suma);
            System.out.println("La media es: " +media);
        }
        
        public void ejercicio7_6(){
            int vector[]= new int [60];
            int conCeros=0, conPos=0, conNeg=0;
            for (int i = 0; i < vector.length; i++) {
                
                int numero = (int) (Math.random() * 100) + 1; 
                numero = numero-15;
                vector[i] = numero;
                System.out.print(numero + ", ");
            }
            
            for (int i = 0; i < vector.length; i++) {
                if(vector[i] == 0){
                    conCeros++;
                }else if(vector[i]>0){
                    ++conPos;
                }else if(vector[i]<0){
                    conNeg++;
                }
            }
            System.out.println("\nCeros: " + conCeros);
            System.out.println("Positivos: " + conPos);
            System.out.println("Negativo: " + conNeg);
            
            
        }
    
       public int[][] transformada01(int dimension, int numInit){
           int [][] matriz=new int[dimension][dimension];
           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[0].length; j++) {
                   if(j<dimension-i){
                   matriz[i][j]=numInit+(i+j)*(i+j+1)/2+i;
                   }else{
                   matriz[i][j]=-1;
                   }
               }
           }
           return matriz;
       }
       
       public void imprimirMatriz(int[][] matriz){
           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[0].length; j++) {
                   System.out.print(matriz[i][j]+"\t");
               }
               System.out.println("");
           }       
       }
        
}
