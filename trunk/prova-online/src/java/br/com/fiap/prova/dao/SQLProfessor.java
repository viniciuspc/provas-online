package br.com.fiap.prova.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leo
 */
public class SQLProfessor {
    private static SQLProfessor singleConexoes = new SQLProfessor();
    
    private SQLProfessor() {
        try {
            Class.forName("");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static SQLProfessor obterGerenciador() {
        return singleConexoes;
    }
    
    public Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:derby://localhost:1527/provaonline"
                ,"dbuser"
                ,"dbuser");
        
    }
}
