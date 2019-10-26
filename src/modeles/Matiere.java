/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 * Cette classe permet de gérer les matières.
 * @author RONALD TCHUEKOU
 */
public class Matiere {
    
    // Attributs 
    private String code_Matiere;
    
    // Constructeur de la classe.
    public void Matiere(String codei_Matiere){
        code_Matiere = code_Matiere;
    }
    
    // Getter.
    public String getCode_Matiere(){
        return code_Matiere;
    }
    
    // Setter.
    public void setCode_Matiere(String code_Matiere){
        code_Matiere = code_Matiere;
    }
}
