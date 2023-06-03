package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PessoaDao {
	
	public void inserirPessoa(Pessoa p, Connection con) {
		String sql = "INSERT INTO pessoa (nome, email) values (?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			int rowAffected = ps.executeUpdate();
			if(rowAffected == 1) {
				System.out.println("Sucesso ao inserir!");
			}else {
				System.out.println("Erro! Linhas " + rowAffected);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir pessoa");
		}
	}
}
