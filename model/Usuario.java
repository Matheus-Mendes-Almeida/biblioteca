package model;

import java.util.ArrayList;

public abstract class Usuario {

	// Atributos
	private String nome;
	private String login;
	private String senha;
	
	// Construtores
	public Usuario(String nome, String login, String senha){
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	// Metodos
	public void consultarLivro(ArrayList<Livro> livros) {
		
	}
	
	// gettersAndSetters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}