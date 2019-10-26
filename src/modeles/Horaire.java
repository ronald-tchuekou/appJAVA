/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 * Cette classe permettra de gérere les horaires.
 * @author RONALD TCHUEKOU
 */
public class Horaire {
    
    // Attributs.
    private int debut;
    private int fin;
    
    // Constructeur.
    public void Horaire(int debut, int fin){
        this.debut = debut;
        this.fin = fin;
    }
    
    // getters.
    public int getDebut(){
        return this.debut;
    }
    
    public int getFin(){
        return this.fin;
    }
    
    // setters.
    public void setDebut(int debut){
        this.debut = debut;
    }
    
    public void setFin(int fin){
        this.fin = fin;
    }
    
    /**
     * Fonction qui verifie si horaire est compris dans un autre.
     * @param horaire horaire de verification.
     * @return Boolean vrai ou faux.
     */
    public boolean beetewn(Horaire horaire){
        return horaire.debut >= debut || horaire.fin <= fin;
    }
}
