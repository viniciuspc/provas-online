package br.com.fiap.prova.dao;
import java.sql.*;

/**
 * Classe responsavel pela conexao no banco de dados
 *
 * @author Leonardo
 */

public class SqlCore {
    protected Connection cn;
    protected PreparedStatement st;
    protected ResultSet rs;

    protected boolean abrir() throws Exception{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/provaonline?user=dbuser&password=DBUser4me...");
            return true;
        }
        catch(Exception ex){
            //return false;
            throw ex;
        }
    }
 
    protected void fechar(){
        try{
            cn.close();
        }
        catch(Exception ex){}
    }
}

