package br.com.fiap.prova.dao;
import java.sql.*;


/**
 * Classe responsavel pela conexao no banco de dados
 *
 * @author Leonardo
 */

public class SqlCore {
    
    private static SqlCore sigleton = new SqlCore();
    
    private SqlCore(){
        try{
             Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch(ClassNotFoundException ex){
            throw  new RuntimeException(ex);
        }
    }
    
    public static SqlCore obterSqlCore(){
        return sigleton;
    }
    
    public Connection abrir() throws SQLException{
        return DriverManager.getConnection("jdbc:derby://localhost:1527/provaonline","dbuser","DBUser4me...");
       
    }
}

