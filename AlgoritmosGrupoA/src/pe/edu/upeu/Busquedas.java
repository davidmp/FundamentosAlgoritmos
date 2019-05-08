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
public class Busquedas {    
  public void busquedaSecuencial(){
  int[] vectorX={20,10,8,4,3,20,90};
    System.out.println("Tamaño:"+vectorX.length);
    System.out.println("Posicion 1:"+vectorX[1]);
  }  
  public void busquedaSecuencial2(int[] v){  
    System.out.println("Tamaño:"+v.length);
    System.out.println("Posicion 1:"+v[1]);
  }
  public int busquedaSecuencial3(int[] v){  
    return v.length;
  }
  public int busquedaSecuencial4(int[] v, int posicion){  
    return v[posicion];
  }
  public int busquedaSecuencial4Funcional(int[] v, int valorB){  
      int posicion=0;
      for (int i = 0; i < v.length; i++) {
          if(v[i]==valorB){
              System.out.println("Si existe");
              posicion= i;
              break;
          }else{
            System.out.println("No existe");           
          }
      }
      return posicion;
  }
  
    public static void main(String[] args) {
        int[] vectorX={20,10,8,4,3,20,90, 14, 8};        
        Busquedas n=new Busquedas();
        n.busquedaSecuencial();
        System.out.println("\n");
        n.busquedaSecuencial2(vectorX);
        System.out.println("Tamaño de Vector es:"+n.busquedaSecuencial3(vectorX));
        System.out.println("El valor de la posicion:"+n.busquedaSecuencial4(vectorX, 3));        
        System.out.println("\n");
        System.out.println("El valor ingresado esta en posicion:"+n.busquedaSecuencial4Funcional(vectorX, 14));
    }
   
}
