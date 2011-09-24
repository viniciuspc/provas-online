/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.bean.usuarios;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/**
 *
 * @author Vinicius
 */
@ManagedBean(name="usuario")
@SessionScoped
public class usuario {
    private String login = "";
    private String senha = "";
    private String nome = "";
    
    /**
     * O id refere-se ao tipo de usuário
     * 1-Aluno
     * 2-Professor
     * 3-Administrador
     */
    private int tipo = 0;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String validaUsuario(){
        usuario u = new usuario();
        
        u.setSenha(senha);
        u.setLogin(login);
        
        return null;
    }
    
}
