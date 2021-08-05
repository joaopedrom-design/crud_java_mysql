package br.com.loja.dal;
import java.sql.*;
public class ModuloConexão {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //chamar o driver
        String driver = "com.mysql.jdbc.Driver";
        
        String url ="jdbc:mysql://localhost";
        String user ="root";
        String password ="";
        //fazer a conexão com Banco de Dados
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch(Exception e){
            return null;
        }
    }
}
