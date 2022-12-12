package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConectionSQLite {
	
	private Connection conexao;  
    public Statement statement;  
    public ResultSet resultset;  
    public PreparedStatement prep; 
    
    public void Conectar()throws Exception  {
    	String pathbase = new StartSettings().getBasePath(); 
    	Class.forName("org.sqlite.JDBC");
    	conexao = DriverManager.getConnection("jdbc:sqlite:"+pathbase+"ResidencialMassa.db");
    	statement = conexao.createStatement();
    	conexao.setAutoCommit(false);
    	conexao.setAutoCommit(true);
    }
    
    public String exec(String sql) throws Exception{
    	String error="erro ao tentar carregar dados";
    	try{
    		ResultSet executeQuery = statement.executeQuery(sql);
    		
        	while (executeQuery.next()) {
        		String  name = executeQuery.getString("Dados");               
                return name ;
             
        	}
        	executeQuery.close();
        	statement.close();
    	}
    	
    	
    	catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
		return error;
    }
    
    
    public void desconectar(){
    	boolean result =  true;
    	try{
    		conexao.close();
    		System.out.println("banco fechado");
    	}catch (SQLException fecha){
    		System.out.println("Não Foi Possivel fechar o banco de dados"+fecha);
    		result = false;
    	}
    }

}
