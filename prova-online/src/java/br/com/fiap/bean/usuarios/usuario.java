/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.bean.usuarios;

/**
 *
 * @author Vinicius
 */
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
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
