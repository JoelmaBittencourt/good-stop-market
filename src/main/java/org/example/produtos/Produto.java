package org.example.produtos;

import org.example.produtos.exception.NotFoundException;

import java.util.List;

public abstract class Produto {
    private String nome;
    private String descricao;
    private Double preco;
    private List<Comentarios> comentarios;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Comentarios> getComentarios() {
        if(comentarios == null){
            throw new IllegalArgumentException("comentarios não podem ser nulos");
        }
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", comentarios=" + comentarios +
                '}';
    }

    public void verificaPreco() {
        if (nome == null) {
            if (this.preco <= 0.0) {
                throw new NotFoundException("preço não pode ser nulo");
            }
        }
    }

    public void validaPreco() {
        if (this.preco == 9.99) {
            Math.round(this.preco);
            System.out.println("valor arredondado de 9.99 para 10.00!!");
        }


    }

}
