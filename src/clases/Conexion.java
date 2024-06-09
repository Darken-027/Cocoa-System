/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.*;

/**
 *
 * @author torut
 */
public class Conexion {
    
    public static Connection Conectar(){
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://", "root", "3lm3j0rs");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la Conexion local " + e);
        }
        return (null);
    }
}
