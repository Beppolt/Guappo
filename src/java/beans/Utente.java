/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Giuseppe
 */
public class Utente implements Serializable{
    private int id;
    private boolean isAdmin;
    private boolean isRegistered;
    private boolean isSeller;
    
    public void setId(int i){
        this.id=i;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setIsAdmin(boolean b){
        this.isAdmin=b;
    }
    
    public boolean getIsAdmin(){
        return this.isAdmin;
    }
    
    public void setIsRegistered(boolean b){
        this.isRegistered=b;
    }
    
    public boolean getIsRegister(){
        return this.isRegistered;
    }
    
    public void setIsSeller(boolean b){
        this.isSeller=b;
    }
    
    public boolean getIsSeller(){
        return this.isSeller;
    }
    
}
