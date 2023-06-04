package org.example.produtos.exception;

public class ProduceNotFoundException extends RuntimeException {

    public ProduceNotFoundException(String mensagem) {
        super(mensagem);
    }
}
