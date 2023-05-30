package aula23;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Pessoa {
	int id;
	String nome;
	String email;
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Pessoa(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public void inserirPessoa(Connection con) {
		String sql = "INSERT INTO pessoa (nome,email) VALUES (?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, this.nome);
			ps.setString(2, this.email);
			boolean insert = ps.execute();
			if(!insert) {
				System.out.println("Inserido com sucesso");
			}else {
				System.out.println("Erro no comando INSERT");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir pessoa");
		}
	}
	public ArrayList<Pessoa> listar(Connection con){
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM pessoa");
			ResultSet resultado = ps.executeQuery();
			while(resultado.next()) {
				Pessoa temp = new Pessoa(resultado.getInt("id"),resultado.getString("nome"),resultado.getString("email"));
				listaPessoa.add(temp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir pessoa");
		}
		return listaPessoa;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}
