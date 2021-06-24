package myapp.cadastros;

public class Cadastro {
	//tipo + identificador = valor é opcional
	private Integer id;
	private String nome;
	private Long telefone;
	private String email;
	public void setTelefone(Long telefone) {
		//Quando se tem duas variaveis de mesmo nome, uma da classe e outra do parâmetro
		//usa-se o "this" para destingui-las 
		this.telefone = telefone;
	}
	public Long getTelefone() {
		
		
		return telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Integer getId() {
		return id;
	}
	private void setId(Integer id){
		this.id = id;
	}
	
}

