/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.prova.dao;
import java.sql.*;

/**
 * Classe responsavel pela execução de querys no banco de daodos
 *
 * @author Leonardo
 */

public class Dao {
    protected Connection cn;
    protected PreparedStatement st;
    protected ResultSet rs;

    protected boolean abrir() throws Exception{
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            cn = DriverManager.getConnection("jdbc:derby://localhost:1527/provaonline?user=dbuser&password=DBUser4me...");
            return true;
        }
        catch(Exception ex){
            //return false;
            System,out.println("Erro ao abrir a conexão com o banco de dados.");
            throw ex;
        }
    }
 
    protected void fechar(){
        try{
            cn.close();
        }
        catch(Exception ex){
          System.out.println("Erro ao fechar a conexão com o banco de dados");
        }
    }
}
