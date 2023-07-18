/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class AutenticacionUtil {
    private String password;

    public boolean iniciarSesion(String password){
        return this.password == password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
