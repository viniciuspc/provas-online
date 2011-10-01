/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.dao;
import br.com.fiap.prova.bean.usuarios.Usuario;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Leonardo
 */
public class DaoUsuario extends SqlCore {
    private Usuario usuario;
     
    /*
     * cadatraUsuario
     * procuraUsuario
     * autenticaUsuario
     * 
     */
    
    public ArrayList<Usuario> listarUsuarios() throws SQLException{
        
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        try {
            st = cn.prepareStatement("SELECT * FROM aluno")  ;   
            rs = st.executeQuery();
            int i = 0;
            while (rs.next()) {

                usuario = new Usuario();

                usuario.setLogin( rs.getString(1) );
                usuario.setNome( rs.getString(2) );
                usuario.setSenha( rs.getString(3) );
                usuario.setTipo( rs.getInt(4) );
                listaUsuarios.add(usuario);

                i++;
            }
        }
        catch(SQLException ex) {
            System.out.println("Erro ao listar usuario do BD");
            ex.printStackTrace();
        }
        /*
         * Trazer do banco de dados.
        */
        
        return listaUsuarios;
    }
    
}
