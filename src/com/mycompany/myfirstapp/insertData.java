/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myfirstapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Cette classe contient les methode pour inserer les données dans la base de données.
 * @author RONALD TCHUEKOU
 */
public class insertData {
    
     // Proprietes.
    private Connection data = null; // Pour la connexion à la base de données.
    private PreparedStatement stet = null; // Pour l'exécution des requêtes.
    private ResultSet result = null; // Pour la recupération des résultats des requêtes. 

    public insertData() {
    }
    
    /**
     * Methode qui permet d'inserer un element dans la table des classes.
     * @param codeClasse pour le code de la classe.
     * @param filiere Pour la filiere.
     * @param niveau Pour le niveau.
     */
    public void inserInToClasse(String codeClasse, String filiere, String niveau){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into classe (code_classe, filiere, niveau) values (?,?,?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, codeClasse);
            stet.setString(2, filiere);
            stet.setString(3, niveau);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            System.out.println("Classe ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la classe ! --> " + e);
        }
    }
    
    /**
     * Methode qui permet d'ajouter un données dans la table dispenser.
     * @param idJour identifiant du jour concerné.
     * @param codeMatiere code de la matière concernée.
     */
    public void insertInToDispenser(String idJour, String codeMatiere){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into dispenser (id_jour, code_matiere) values (?,?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, idJour);
            stet.setString(2, codeMatiere);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            System.out.println("dispenser ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la dispenser !--> " + e);
        }
    }
    
    /**
     * Methode qui ajoute une donnée dans la table horaire.
     * @param debut Debut de l'horaire.
     * @param fin Fin de l'horaire.
     */
    public void insertInToHoraire(String debut, String fin){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into horaire (id_horaire, debut, fin) values (null,?,?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, debut);
            stet.setString(2, fin);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            System.out.println("Horaire ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la horaire ! --> " + e);
        }
    }
    
    /**
     * Method qui permet d'ajouter un élément dans la table occuper.
     * @param codeMatiere code de la matiere correspondante.
     * @param idProf identifiant du professeur correspondant.
     */
    public void insertInTojMatiere(String codeMatiere, String idProf){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into matiere (code_matiere, id_prof) values (?,?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, codeMatiere);
            stet.setString(2, idProf);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            System.out.println("Matiere ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la Matiere ! --> " + e);
        }
    }
    
    /**
     * Methode qui ajouter une donnée dans la table posseder.
     * @param idHoraire identifiant de l'horaire conrrespondante.
     * @param codeMatiere code de la matiere correspondante.
     */
    public void insertInToPosseder(String idHoraire, String codeMatiere){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into posseder (id_horaire, code_matiere) values (?,?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, idHoraire);
            stet.setString(2, codeMatiere);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            System.out.println("Posseder ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la posseder ! -->" + e);
        }
    }
    
    /**
     * Methode qui ajoute une donnée dans la table prof.
     * @param nom  nom du prof.
     */
    public void insertInToProf(String nom){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into prof (nom) values (?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, nom);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            System.out.println("Prof ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la prof ! -->" + e);
        }
    }
    
    /**
     * Methode qui permet d'ajouter un element dans la table salle.
     * @param codeSalle code de la salle.
     * @param typeSalle type de salle.
     * @param dateEdition date d'édition de l'emploi du temps.
     */
    public void insertInToSalle(String codeSalle, String typeSalle, String dateEdition){
        try{
            conDB con = new conDB();
            data = con.connexion();
            
            String request = "insert into salle (code_salle, type_salle, date_edition) values (?,?,?)";
            
            // Péparation de la requête.
            stet = data.prepareStatement(request);
            stet.setString(1, codeSalle);
            stet.setString(2, typeSalle);
            stet.setString(3, dateEdition);
            
            // Exécution de la requête.
            stet.execute();
            
            // Fermeture de la connexion à la base de données;
            stet.close();
            
            JOptionPane.showMessageDialog(null, "Salle ajouter avec succes.!!!!!");
        }catch(SQLException e){
            System.out.println("Erreur d'ajout de la salle ! --> " + e);
        }
    }
}
