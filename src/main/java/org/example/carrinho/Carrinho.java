package org.example.carrinho;

import org.example.produtos.Bebidas;
import org.example.produtos.Produto;

import java.util.List;

public class Carrinho {

    private List<Bebidas> bebidas;

    public Carrinho(List<Bebidas> bebidas) {
        this.bebidas = bebidas;
    }
}
