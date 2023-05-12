package aula17;

public class Autenticacao {
	public void autenticaUsuario(Autenticavel auth, String id) {
		if(auth.login(id)) {
			System.out.println("Login realizado com sucesso");
		}else {
			System.out.println("Erro no login");
		}
	}
}
