package myapp.factory;

import myapp.cadastros.Cadastro;

public class FabricaCadastro {
	
	public static Cadastro criarCadastro(String nome, String email, long telefone) {
		if(  (nome == null || email == null) ) {
			System.err.println("Campos inv�lidos");
			return null;
		}
		
		Cadastro cliente = new Cadastro();
		cliente.setNome("Carl�o de Janu�rio");
		cliente.setEmail("carlaojanuario@gmail.com");
		cliente.setTelefone(83994155333L);
		return cliente;
		
	}

}
