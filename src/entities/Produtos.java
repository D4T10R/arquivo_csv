package entities;

public class Produtos {

    // ATRIBUTOS
    private String nome;
    private Double preco;
    private Integer quantidade;
    // ATRIBUTOS
    
    // CONSTRUTORES
    public Produtos(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    // CONSTRUTORES
    
    
    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    // ENCAPSULAMENTO

    // METODOS
    public Double totalPreco() {
        return preco * quantidade;
    }
    // METODOS



}