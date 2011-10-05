/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.dao;
import br.com.fiap.prova.bean.usuarios.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Leonardo
 */
public class DaoUsuario {
    private Usuario usuario;
    SqlCore gerenciador = SqlCore.obterSqlCore();
    
    /*
     * cadatraUsuario
     * procuraUsuario
     * autenticaUsuario
     * 
     */
    
    public ArrayList<Usuario> listarUsuarios(){
        Connection conexao = null;
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        try {
            conexao = gerenciador.abrir();
            
            PreparedStatement st = conexao.prepareStatement("SELECT * FROM usuario")  ;   
            ResultSet rs = st.executeQuery();
            int i = 0;
            while (rs.next()) {

                usuario = new Usuario();

                usuario.setLogin( rs.getString("login") );
                usuario.setNome( rs.getString("nome") );
                usuario.setSenha( rs.getString("senha") );
                usuario.setTipo( rs.getInt("tipo") );
                usuario.setId(rs.getInt("id"));
                listaUsuarios.add(usuario);

                i++;
            }
        }
        catch(SQLException ex) {
            System.out.println("Erro ao listar usuario do BD");
            ex.printStackTrace();
        }
        finally{
           if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Erro ao fechar conexao" + ex);
                }
           }
        }
        /*
         * Trazer do banco de dados.
        */
        
        return listaUsuarios;
    }
    
    public void cadastraUsuario(Usuario u){
        Connection conexao = null;
        try{
            conexao = gerenciador.abrir();
            
            PreparedStatement ps = conexao.prepareStatement("insert into usuario(login,senha,nome,tipo) values (?,?,?,?) ");
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getNome());
            ps.setInt(4, u.getTipo());

            ps.executeUpdate();
            
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir usuario");
            ex.printStackTrace();
        }
        finally{
           if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Erro ao fechar conexao" + ex);
                }
           }
        }
        
        
        
    }
    
    public int loginUsuario(Usuario u){
        Connection conexao = null;
        int tipo = 0;
        
        try{
            conexao = gerenciador.abrir();
            PreparedStatement ps = conexao.prepareStatement("Select tipo from usuario where login = ? and senha = ?");
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
                tipo = rs.getInt("tipo");
           
            
        }catch(SQLException ex){
            System.out.println("Erro ao autenticar o usuário");
            ex.printStackTrace();
        }
        finally{
           if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Erro ao fechar conexao" + ex);
                }
           }
        }
        
        return tipo;
        
    }
    
    public ArrayList<Usuario> procuraUsuario(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
       
        
        
        return usuarios;
    }
    
}
