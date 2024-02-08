/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

/**
 *
 * @author zvonimir.ZI.ivancic
 */
public class Users {

    private int id;
    private String username;
    private String ppassword;
    private boolean memberRole;

    public Users() {
    }

    public Users(String username, String ppassword) {
        this.username = username;
        this.ppassword = ppassword;
    }

    public Users(int id, boolean memberRole) {
        this.id = id;
        this.memberRole = memberRole;
    }

    public String getUsername() {
        return username;
    }

    public String getPpassword() {
        return ppassword;
    }
    
    

}
