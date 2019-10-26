/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfirstapp;

//import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Fonctionnement de la connexion à la base de données.
 * à chaque fois qu'on veux faire une requête sql, On doit faire une nouvelle connexion.
 * @author RONALD TCHUEKOU
 */
public class conDB {
    
    /**
     * Connexion a la base de données.
     */
    public Connection connexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             System.out.println("Le pilote est OK !");
             // Déclaration des variables de configurations.
             String url = "jdbc:mysql://localhost:3306/tpeinf345";
             String user = "root";
             String pass = "";
             
             // Connexion à la base de données.
             Connection connect = DriverManager.getConnection(url, user, pass);
             
             System.out.println("La conexion est éffectuée !");
             
             return connect;
        }catch(Exception e){
            System.out.println("la base de données !\n => " + e.getMessage());
        }
        return null;
    }
    
}
