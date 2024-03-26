package model;

import java.util.ArrayList;

public class Cliente extends Usuario{

	// Atributos
	private ArrayList<Reserva> livrosReservados = new ArrayList<>();
	
	// Construtores
	public Cliente(String nome, String login, String senha) {
            super(nome, login, senha);
	}
	
	// Metodos
	public boolean reservarLivro(Livro livro) {
            
            if(livro.isDisponivel()){
                livrosReservados.add(new Reserva(livrosReservados.size(), this.getLogin(), livro));
                
                livro.setDisponivel(false);
                
                return true;
            }
            
            return false;
	}
	
	public boolean cancelarReserva(int codigoDaReserva){
            
            
            return false;
        }
	
	// gettersAndSetters
	public ArrayList<Reserva> getLivrosReservados() {
            return livrosReservados;
	}

	public void setLivrosReservados(ArrayList<Reserva> livrosReservados) {
            this.livrosReservados = livrosReservados;
	}
}