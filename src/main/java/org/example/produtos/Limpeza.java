package org.example.produtos;

import org.example.produtos.exception.NotFoundException;

public class Limpeza extends Produto implements Desconto {

    private String modoDeUsar;


    @Override
    public double aplicaDEsconto() {
        if(getPreco() == null)
            throw new NotFoundException("Not found-- preço não pode ser nulo");
        return super.getPreco() * 0.1;
    }

    @Override
    public String toString() {
        return "Produto de Limpeza{" +
                "nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", modoDeUsar='" + modoDeUsar + '\'' +
                '}';
    }

    @Override
    public void validaPreco() {
        if (getPreco() == 9.99) {
            Math.round(getPreco() * 0.);
            System.out.println("valor arredondado de 9.99 para 10.00!!");
        }


    }

    @Override
    public void verificaPreco() {
        super.verificaPreco();
    }

//
//    public void comentario(String comentario) {
//        System.out.println("Comentario: " + comentario);
//    }
//
//    public void nota(int nota) {
//        System.out.println("Nota: " + nota);
//
//    }
}
