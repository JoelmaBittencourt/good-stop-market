package org.example;

import org.example.produtos.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //var Produto = new Produto();

         AlimentosBasicos alimentosBasicos = new AlimentosBasicos();



        List<Bebidas> bebidas = new ArrayList<>();
        Bebidas bebida = new Bebidas("nome", "descrição", 5.00);
        bebidas.add(bebida);
        bebidas.remove(bebida);

        LinkedList<Limpeza> limpeza = new LinkedList<>();
        var Limpeza = new Limpeza("", "", 20.00);
        limpeza.add(Limpeza);
        limpeza.remove(limpeza);

        ArrayList   list = new ArrayList ();
        list.add(limpeza);










//        Object objetos = new Feira("", "", 0.0);
//        Object objeto = "Uma String";
//        Object objeto10 = 10;//autoboxing.
//        //Object objeto11 = new Integer(10);
//
//        var integer = 10;
//        int valor = integer;
//
//        boolean resultado = Boolean.parseBoolean("false");//transforma uma String em um booleano
//        boolean resultado2 = Boolean.getBoolean("false");
//        boolean resultado3 = Boolean.valueOf("false");
//        boolean resultado4 = Boolean.valueOf("false");
//        boolean resultado5 = Boolean.logicalAnd(true, true);
//        //boolean resultado6 = Boolean.compare(true, true);
//       // boolean resultado7 = Boolean.FALSE();
//
//
//
//        byte parseByte = Byte.parseByte("1");
//        short parseShort = Short.parseShort("10");
//        int parseInt = Integer.parseInt("10");
//        long parseLong = Long.parseLong("10");
//        float parseFloat = Float.parseFloat("10.0");
//        double parseDouble = Double.parseDouble("10.0");
//
//        String numeroEmTexto = String.valueOf(10);
//        int parseInt2 = Integer.parseInt("ABC");

//http://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
//        long round = Math.round(3.99);
//        long max = Math.max(100, 10);
//        int min = Math.min(100, 10);
//        int abs = Math.abs(-5);
//        double sqrt = Math.sqrt(4);


     //   String java = new String("Java");

//        java.replace("v", "c");
//        System.out.println(java);
//
//
//        String replace = java.replace("v", "c");
//        String upperCase = java.toUpperCase();
//        String lowerCase = "JAVA".toLowerCase();
//        char charAt = java.charAt(0);
//        boolean endsWith = java.endsWith("a");
//        boolean startsWith = java.startsWith("s");
//        boolean equals = java.equalsIgnoreCase("JAVA");

//        http://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.
//        html


        var feira = new Feira("", "", 0.0);
        feira.verificaPreco();

        var limpeza = new Limpeza("", "", 0.0);
//
//        int a = 10;
//        int b = 11;
//
//        if ( a == b) {
//        System.out.println("variaveis são iguais")  ;
//        }else
//            System.out.println("variaveis não são iguais");
//







       // double valor = ((Produto)object).getValor();//como receber object como parametro


//        try {
//// código de risco
//        } catch (NullPointerException e) {
//// tratando NPE
//        } catch (Exception e) {
//            e.printStackTrace();
//// tratando Exception
//        } finally {
//// alguma ação importante
//        }
//    }

    }
}