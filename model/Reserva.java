package model;

import java.time.LocalDate;

public class Reserva {
    
    // Atributos
    private int codigo;
    private String loginCliente;
    private Livro livro;
    private LocalDate dataDoEmprestimo;
    
    // Construtores
    public Reserva(int codigo, String loginCliente, Livro livro) {
        this.codigo = codigo;
        this.loginCliente = loginCliente;
        this.livro = livro;
        this.dataDoEmprestimo = LocalDate.now();
    }
    
    public Reserva() {}
    
    // gettersAndSetters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getLoginCliente() {
        return loginCliente;
    }
    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public LocalDate getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }
    public void setDataDoEmprestimo(LocalDate dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }
}