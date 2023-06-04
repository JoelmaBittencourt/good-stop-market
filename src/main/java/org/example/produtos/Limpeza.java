package org.example.produtos;

public class Limpeza extends  Produto implements Desconto {
    public Limpeza(String nome, String descricao, Double preco) {
        super(nome, descricao, preco);
    }

    @Override
    public double aplicaDEsconto() {
        return super.getPreco() * 0.1;
    }

}
