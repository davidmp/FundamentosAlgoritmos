/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class LeerEscribirArchivos {
   
    public int[][] leerArchivo(File file){
        Scanner s=null;
        int contador=0, cantColumna=0;
        int[][] matriz=null;
        try {
            s=new Scanner(file);
            while (s.hasNextLine()) {                
                String linea=s.nextLine();
                if(contador==1){
                String[] vector=linea.split("\t");
                cantColumna=vector.length;
                }
                contador++;
            }
            matriz=new int[contador-1][cantColumna];
            contador=0;
            s=new Scanner(file);
            while (s.hasNextLine()) {                
                String linea=s.nextLine();
                if(contador!=0){
                String[] vector=linea.split("\t");
                    for (int i = 0; i < vector.length; i++) {
                        matriz[contador-1][i]=Integer.parseInt(vector[i].trim());
                    }
                }
                contador++;                
            }            
        } catch (IOException e) {
        }finally{
            try {
                s.close();
            } catch (Exception e) {
            }
        }
        
    return matriz;
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
       public int[][] transformada05(int dimension, int numInit){
           int [][] matriz=new int[dimension][dimension];           
           for (int i = 0; i < matriz.length; i++) {
               for (int j = dimension-1; j>=0; j--) {
                   if(j+1<dimension-i){
                   matriz[i][j]=-1;
                   }else{
                    matriz[i][j]=numInit++;
                   }
               }
           }
           return matriz;
       }    
    public void escribirArchivo(String[] head, int[][] data, String nameFile){
        Writer out=null;
        try {
        String url=System.class.getResource("/").getFile().replaceAll("%20", " ");        
        String[] urlReal=url.split("target");
        out=new BufferedWriter(new OutputStreamWriter(
        new FileOutputStream(urlReal[0]+"src/main/resources/"+nameFile),"UTF-8"));
        if(head!=null && data!=null){
        }else if(head==null && data!=null){
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    try {
                        out.write(data[i][j]+"\t");
                        if(i<data.length-1){
                        if(j==data[0].length-1){
                        out.write("\n");
                        }
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }else{
        System.out.println("Los parametros de entrada no tienen contenido");
        }
        
        } catch (Exception e) {
        }finally{
            try {
                out.close();
            } catch (Exception e) {
            }
        }
        
    }
    
    public static void main(String[] args) {
        LeerEscribirArchivos lea=new LeerEscribirArchivos();
        URL fileUrl=System.class.getResource("/02-exemplo7.txt");       
        //System.out.println("Ruta:"+fileUrl.getFile().replace("%20", " "));
        lea.imprimirMatriz(lea.leerArchivo(new File(fileUrl.getFile().replace("%20", " "))));
        
        System.out.println("Crear Archivos");
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dimM=sc.nextInt();
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=sc.nextInt();
        lea.escribirArchivo(null, lea.transformada05(dimM, numInit), "archivo4.txt");
        
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
