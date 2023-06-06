package org.example.produtos;

public class Bebidas extends Produto  {


    public void validaBebidaAlcoolica(boolean teorAlcoolico, int idade) {
        if (teorAlcoolico && (idade < 18)) {
            System.out.println("Venda não permitida para menores de 18 anos!");
            System.out.println("Bebida alcoólica!");
        }
    }

    }


