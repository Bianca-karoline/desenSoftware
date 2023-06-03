package view;

import java.sql.Connection;
import java.sql.SQLException;

import model.FabricaConexao;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/novo";
		String user = "root";
		String pass = "1234";
		FabricaConexao fc = new FabricaConexao(user, url, pass);
		
		try {
			Connection con = fc.getConnection();
			
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
