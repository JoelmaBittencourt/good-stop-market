package org.example.produtos;

import org.example.produtos.exception.NotFoundException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Produto {
    private String nome;
    private String descricao;
    private Double preco;
    private List<String> caracteristicas;
    private List<String> comentarios;

    public Produto(final String nome, final String descricao, final Double preco) {
        if (nome == null) {
            throw new NotFoundException("nome não pode ser nulo");
        }
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.caracteristicas = new ArrayList<>();
        this.comentarios = new LinkedList<>();
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

    public List<String> getCaracteristicas() {
        return caracteristicas;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void addCaracteristica(String caracteristica) {
        caracteristicas.add(caracteristica);
    }

    public void addComentario(String comentario) {
        comentarios.add(comentario);
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", caracteristicas=" + caracteristicas +
                ", comentarios=" + comentarios +
                '}';
    }

    public void verificaPreco() {
        if (this.preco <= 0.0) {
            System.out.println("Produto com preço inválido!!");
        }
    }
}
