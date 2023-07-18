/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class Cliente implements Autenticable{
    private String nombre;
    private String documento;
    private String telefono;
    private String sexo;
    private String password;

    private AutenticacionUtil util;

    public Cliente(){
        this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setClave(String password) {
        this.util.setPassword(password);
    }

    @Override
    public boolean iniciarSesion(String password) {
        return this.util.iniciarSesion(password);
    }
}

