package org.example.carrinho;

import org.example.produtos.Produto;

import java.util.List;

public class Carrinho {


        private double total;

 //   private object[] objects = new object[10];

 //   Object[] produtos = carrinho.getProdutos();
    //private Produto[] produtos2 = new Produto[10];
        private List<Produto> produtos;


    public Carrinho(double total, List<Produto> produtos) {
        this.total = total;
        this.produtos = produtos;
    }

    public void adiciona(Produto produto) {
            this.produtos.add(produto);
        }

        public void remove(int posicao) {
            this.produtos.remove(posicao);
        }

        public double getTotal() {
            return total;
        }

        public List<Produto> getProdutos() {
            return produtos;
        }
    }
