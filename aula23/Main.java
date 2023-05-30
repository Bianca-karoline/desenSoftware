package aula23;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/novo";
		String user = "root";
		String pass = "1234";
		Pessoa p1 = new Pessoa("sla", "sla@email.com");
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("Conectado!");
			//p1.inserirPessoa(con);
			listaPessoa = p1.listar(con);
			System.out.println(listaPessoa.toString());
			con.close();
		}catch(SQLException ex){
			System.out.println("Erro ao conectar no banco de dados" + ex.getMessage());
		}

	}

}
