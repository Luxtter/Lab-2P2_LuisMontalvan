/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Login {
    private String Usuario, contrasena, tipo;

    public Login() {
    }

    public Login(String Usuario, String contrasena, String tipo) {
        this.Usuario = Usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Login{" + "Usuario=" + Usuario + ", contrasena=" + contrasena + ", tipo=" + tipo + '}';
    }
    
}
