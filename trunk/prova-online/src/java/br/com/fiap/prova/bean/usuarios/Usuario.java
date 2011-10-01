/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.bean.usuarios;

import br.com.fiap.prova.dao.DaoUsuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Vinicius
 */

@ManagedBean(name="usuario")
@SessionScoped

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    private String tipoDescricao;

    public String getTipoDescricao() {
        if(this.getTipo() == 1){
            return "Aluno";
        } else if(this.getTipo() == 2){
            return "Professor";
        } else if(this.getTipo() == 3){
            return "Adiministrador";
        } else{
            return tipoDescricao;
        }
        
    }

    public void setTipoDescricao(String tipoDescricao) {
        this.tipoDescricao = tipoDescricao;
    }
    
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
        Usuario u = new Usuario();
        
        u.setSenha(senha);
        u.setLogin(login);
        
        //Aqui deveria ir buscar o usuário no banco e trazer o tipo do usuário
        u.setTipo(new DaoUsuario().loginUsuario(u));
        
        if(u.getTipo() == 1)
            return "aluno";
        else
            if(u.getTipo() == 2)
                return "prof";
            else
                if(u.getTipo() == 3)
                    return "adm";
                else
                    return null;
    }
    
    /**
     * Função desnescesária quando tiver conexão com banco
     * Apeenas para testes
     */
    public int obtemTipo(){
        if(this.getLogin().equals("aluno")){
            return 1;
        }
        else{
            if(this.getLogin().equals("professor")){
                return 2;
            }
            else{
                if(this.getLogin().equals("adm")){
                    return 3;
                }
                else{
                    return 0;
                }
            }
        }
            
    }
    

}
