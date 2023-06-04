package org.example.produtos;

import org.example.produtos.exception.ProduceNotFoundException;

public abstract class Produto {
    private String nome;
    private String descricao;
    private Double preco;

    public Produto(final String nome, final String descricao, final Double preco) {
        if (nome == null) {
            throw new ProduceNotFoundException("nome não pode ser nulo");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", descricao='" + descricao + '\'' + ", preco=" + preco + '}';
    }

    @Override
    public boolean equals(Object obj) {
        var feira = (Feira) obj;
        return this.nome.equals(feira.getNome());
    }

    public void verificaPreco() {
        if (this.preco <= 0.0) {
            System.out.println("Produto com preço invalido!!");
        }
    }
}
