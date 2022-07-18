package projetoCompleto;

import java.sql.*;


public class Conexao {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/projetoav3";
	private static final String USER = "root";
	private static final String PASS = "";
	
	
	public static Connection getConnection(){
		
		try {
			Class.forName(DRIVER);
			
			return DriverManager.getConnection(URL, USER, PASS);
					
		}catch (ClassNotFoundException | SQLException ex) {
			throw new RuntimeException("Erro na Conexão", ex);
			// TODO: handle exception
		}
	}
	
	public static void  closeconnection(Connection con) {		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException ex) {
				System.err.println("Erro: " + ex);
			}
	
		}
	}
	
	public static void  closeconnection(Connection con, PreparedStatement stmt) {
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException ex) {
				System.err.println("Erro: " + ex);
			}
	
		}
		
		closeconnection(con);
	}
	
	public static void  closeconnection(Connection con, PreparedStatement stmt, ResultSet rs) {
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException ex) {
				System.err.println("Erro: " + ex);
			}
	
		}
		
		closeconnection(con, stmt);
		
}	
}