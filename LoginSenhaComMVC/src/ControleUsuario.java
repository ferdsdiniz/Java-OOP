
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunocmc
 */
public class ControleUsuario {
    
    Usuario usu = new Usuario();
    
    public void logar(String log, String sen) {
        usu.setLogin(log);
        usu.setSenha(sen);
        boolean status = usu.Validar();
        if (status == true) {
            new MenuSistema().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Login / Senha incorretos!!");
        }
    }
}
