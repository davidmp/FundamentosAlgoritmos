/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author davidmp
 */
public class ConexionDB {
    Connection conxx=null;
    
    public Connection getConnection() 
            throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        if(conxx==null){
        conxx=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
            System.out.println("Conexion exitosa!!");
        }
        return conxx;
    }  
    
    
    public void reportarRegistro() throws SQLException{
        PreparedStatement ps=getConnection().prepareStatement("select * from registro_notas");
        ResultSet rs=ps.executeQuery();
        while (rs.next()) {            
            System.out.println(""+rs.getString("nombre_estudiante")
                    +"\t"+rs.getString("apellidos_estudiante")
                    +"\t"+rs.getString("codigo")
                    +"\t"+rs.getDouble("promedio")
                    );
        }
    }
    
    public void insrtarRegistro(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre=sc.nextLine().toString();
        System.out.println("Ingrese el apellido: ");
        String apellidos=sc.nextLine();
        System.out.println("Ingrese el codigo: ");
        String codigo=sc.nextLine();
        System.out.println("Ingrese genero: ");
        String genero=sc.nextLine();
        System.out.println("Ingrese su promedio de Nota: ");
        double nota=Double.parseDouble(sc.nextLine());
        try {
            PreparedStatement ps=getConnection()
                    .prepareStatement("INSERT INTO registro.registro_notas(nombre_estudiante,apellidos_estudiante,codigo,genero,promedio) "
                            + "VALUES('"+nombre+"', '"+apellidos+"','"+codigo+"','"+genero+"', "+nota+" )");
            ps.executeUpdate();            
        } catch (Exception e) {
            System.out.println("Error en Registro:"+e.getMessage());
        }
    
    }
    
    public static void main(String[] args) {
        ConexionDB con=new ConexionDB();
        Connection conx=null;
        try {
            conx=con.getConnection();
            con.reportarRegistro();
            //con.insrtarRegistro();
            
        } catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
        }
    }
}
