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
public class ArraysGrupoA {
    public int[][] cuadradosXnum(int numero){
    int[][] tablaM=new int[numero][2];
        for(int i = 0; i < tablaM.length; i++) {
           tablaM[i][0]=i+1;
           tablaM[i][1]=(i+1)*(i+1);           
        }
        return tablaM;
    }    
    public void sumaDeValoresxParesImpar(){
        int[][]  datos={{3,40,70,30},{50,5,20,4},{60,18,6,10},{16,5,9,7}};
        int par=0, impar=0, todos=0;        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if(datos[i][j]%2==0){
                    par=par+datos[i][j];
                }else{
                    impar=impar+datos[i][j];
                }
                todos=todos+datos[i][j];
            }
        }
        System.out.println("PAR:"+par);
        System.out.println("impar:"+impar);
        System.out.println("todos:"+todos);
     }
    
    public int[][] transformada01(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimensionX-i){
                    matriz[i][j]=numInit+(i+j)*(i+j+1)/2+i;
                }else{
                matriz[i][j]=-1;
                }
            }
        }        
    return matriz;
    }
    public int[][] transformada05(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[i][j]=numInit;
                    numInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
    
    public int[][] trasformada28(int dim, int numInit){
    int cont=0; int[][] matriz=new int[dim][dim];
        for (int x =matriz.length-1; x >=0 ; x--) {
            if(cont%2==0){
                for (int y = 0; y < matriz[0].length; y++) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }else{
                for (int y = matriz[0].length-1; y >=0; y--) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }
            cont++;
        }    
        return matriz;
    }
   
    public int[][] trasformada29(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }            
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit;
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
    
    public static void main(String[] args) {
        ArraysGrupoA ag=new ArraysGrupoA();
        int[][] matriX=ag.cuadradosXnum(10);
        for (int i = 0; i < matriX.length; i++) {
            System.out.println(matriX[i][0]+"|"+matriX[i][1]);
        }
        System.out.println("Resultados de Suma de contenido de Matriz");
        ag.sumaDeValoresxParesImpar();
        System.out.println("");
        ag.imprimirMatriz(ag.transformada01(20, 5));
        System.out.println("");
        ag.imprimirMatriz(ag.transformada05(20, 0));
        System.out.println("---------------");
        ag.imprimirMatriz(ag.trasformada28(20, 100));
        System.out.println("***************");
        ag.imprimirMatriz(ag.trasformada29(6, 0));
        
    }
}
