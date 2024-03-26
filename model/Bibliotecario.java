package model;

import java.util.ArrayList;

public class Bibliotecario extends Usuario{
	
	// Atributos
	private int clt;
	
	// Construtores
	public Bibliotecario(String nome, String login, String senha, int clt) {
		super(nome, login, senha);
		this.clt = clt;
	}
	
	// Metodos
	public boolean adicionarLivro(ArrayList<Livro> livros) {
		
		
		return false;
	}
	
	public boolean removerLivro(ArrayList<Livro> livros) {
		
		
		return false;
	}
	
	public boolean atualizarLivro(ArrayList<Livro> livros) {
		
		
		return false;
	}
	
	public boolean excluirCliente(ArrayList<Cliente> clientes) {
		
		
		return false;
	}
	
	// gettersAndSetters
	public int getClt() {
		return clt;
	}
	public void setClt(int clt) {
		this.clt = clt;
	}
}