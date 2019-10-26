/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.Date;

/**
 * Classes qui permet de gérer les classes (niveaux d'études).
 * @author RONALD TCHUEKOU
 */
public class Salle {
    
    // Attributs.
    private String code_S;
    private String type_S;
    private Date edition_date;
    
    // Constructeur de la classe.
    public void Salle(String code_S, String type_S, Date edition_date){
        code_S = code_S;
        type_S = type_S;
        edition_date = edition_date;
    }
    
    // getters.
    public String getCode_S(){
        return code_S;
    }
    
    public String getType_S(){
        return type_S;
    }
    
    public Date getedition_date(){
        return edition_date;
    }
    
    // setters.
    public void setCode_S(String code_S){
        code_S = code_S;
    }
    
    public void setType_S(String type_S){
        type_S = type_S;
    }
    
    public void setEdition_date(Date edition_date){
        edition_date = edition_date;
    }
}
