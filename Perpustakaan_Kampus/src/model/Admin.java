/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Admin {
    private String KodeAdmin, NamaLengkap, Username;
    private transient String Password;
    public Admin(){
        
    }
    
    public Admin(String kodeAdmin, String namaLengkap, String username, String password){
        this.KodeAdmin = kodeAdmin;
        this.NamaLengkap = namaLengkap;
        this.Username = username;
        this.Password = password;
    }

    /**
     * @return the KodeAdmin
     */
    public String getKodeAdmin() {
        return KodeAdmin;
    }

    /**
     * @param KodeAdmin the KodeAdmin to set
     */
    public void setKodeAdmin(String KodeAdmin) {
        this.KodeAdmin = KodeAdmin;
    }

    /**
     * @return the NamaLengkap
     */
    public String getNamaLengkap() {
        return NamaLengkap;
    }

    /**
     * @param NamaLengkap the NamaLengkap to set
     */
    public void setNamaLengkap(String NamaLengkap) {
        this.NamaLengkap = NamaLengkap;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

  
    
}
