/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 * Cette classe permettra de gérer les profs.
 * @author RONALD TCHUEKOU
 */
public class Prof {
    
    // Attributs de la classe.
    private String nom;
    
    // Constructeur de la classe.
    public void Prof(String nom){
        nom = nom;
    }
    
    // Setter.
    public void setNom(String name){
        nom = name;
    }
    
    // getter.
    public String getNom (){
        return nom;
    }
}
