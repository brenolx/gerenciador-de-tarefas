package entities;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario() {
	}
	
	public Usuario(String nome, String email, String senha) {
		this.id = 0;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public String getSenha() {
		return senha;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
