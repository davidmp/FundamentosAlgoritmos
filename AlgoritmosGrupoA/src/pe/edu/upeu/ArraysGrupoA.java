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
        
    }
}
