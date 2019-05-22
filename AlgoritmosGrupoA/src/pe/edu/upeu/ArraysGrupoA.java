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
    
    public static void main(String[] args) {
        ArraysGrupoA ag=new ArraysGrupoA();
        int[][] matriX=ag.cuadradosXnum(10);
        for (int i = 0; i < matriX.length; i++) {
            System.out.println(matriX[i][0]+"|"+matriX[i][1]);
        }
        System.out.println("Resultados de Suma de contenido de Matriz");
        ag.sumaDeValoresxParesImpar();
        
    }
}
