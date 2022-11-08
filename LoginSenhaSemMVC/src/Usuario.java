/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunocmc
 */
public class Usuario {
    private String login;
    private String senha;

    public void setLogin(String log) {
        this.login = log;
    }

    public void setSenha(String sen) {
        this.senha = sen;
    }

    public boolean Validar () {
        if (this.login.equals("edu")&&this.senha.equals("123")) {
            return true;
        }
        else{
            return false;
        }
    }
    
}
