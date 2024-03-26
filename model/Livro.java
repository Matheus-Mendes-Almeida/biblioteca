package model;

public class Livro {
    
    // Atributos
    private String titulo;
    private String autor;
    private String editora;
    private int ano;
    private int id;
    private boolean disponivel;
    
    // Construtores
    public Livro(String titulo, String autor, String editora, int ano, int id, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.id = id;
        this.disponivel = disponivel;
    }
    
    public Livro(){}
    
    // gettersAndSetters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
