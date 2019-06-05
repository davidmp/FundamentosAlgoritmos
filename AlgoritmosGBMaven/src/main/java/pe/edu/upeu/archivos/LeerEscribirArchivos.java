/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.archivos;

import java.io.File;
import java.io.IOException;
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
    
    public static void main(String[] args) {
        LeerEscribirArchivos lea=new LeerEscribirArchivos();
        URL fileUrl=System.class.getResource("/02-exemplo7.txt");       
        //System.out.println("Ruta:"+fileUrl.getFile().replace("%20", " "));
        lea.imprimirMatriz(lea.leerArchivo(new File(fileUrl.getFile().replace("%20", " "))));
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
