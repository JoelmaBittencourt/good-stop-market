package org.example;

import org.example.produtos.Constants;
import org.example.produtos.Bebidas;
import org.example.produtos.Comentarios;
import org.example.produtos.DiaSemana;
import org.example.produtos.Limpeza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final String URL= "http://localhost";

        String urlExemple = Constants.URL_EXEMPLE;


        Limpeza limpeza = new Limpeza();



        List<Limpeza> listLimpeza = new ArrayList<>();
        listLimpeza.add(limpeza);



        List<Comentarios> listaComentarios = new ArrayList<>();


        Comentarios comentario1 = new Comentarios("Comentário 1");
        listaComentarios.add(comentario1);

        Comentarios comentario2 = new Comentarios("Comentário 2");
        listaComentarios.add(comentario2);


            System.out.println(listaComentarios.get(0).getComentario());
            System.out.println("Hoje é" + DiaSemana.SEGUNDA + URL);


            var bebidas = new Bebidas();
            bebidas.validaBebidaAlcoolica(true, 15);


        }
    }

