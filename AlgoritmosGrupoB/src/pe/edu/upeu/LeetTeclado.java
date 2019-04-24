/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Docente
 */
public class LeetTeclado {
    BufferedReader br=new BufferedReader(new 
    InputStreamReader(System.in));    
    
    public int leer(int dato, String mensage){
        try {
            System.out.println(mensage);
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    return dato;
    }
    public double leer(double dato, String mensage){
        try {
            System.out.println(mensage);
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    return dato;
    }
    public String leer(String dato, String mensage){
        try {
            System.out.println(mensage);
            dato=br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    return dato;
    }    
    public char leer(char dato, String mensage){
        try {
            System.out.println(mensage);
            dato=br.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    return dato;
    }
    
}
