package fundamentos;

import java_curso.Carro;
import java_curso.CarroInterface;
import java_curso.Sandero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // tipos primitivos
        String str = "Beatriz";
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean bool = true;

        // condicionais
        if (bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (str.equals("Bárbara")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (b == 101) {
            System.out.println(b);
        } else if (str.equals("Beatriz")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // vetores - índice 0,1,2,3,4
        int[] inteiros = {1,2,3,4,5}; // declaração em criação
        System.out.println(inteiros.length);
        System.out.println(inteiros[4]);

        String[] nomesArr = new String[2];
        nomesArr[0] = "Rute"; // declaração pós criação
        System.out.println(nomesArr.length);
        System.out.println(nomesArr[0]);


        // ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Beatriz");
        lista.add("Raul");
        lista.add("Serafim");
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.remove(1)); // lista.remove("Beatriz")
        System.out.println(lista);

        // loopings
        for (int j = 0; j < lista.size(); j++){
            System.out.println(lista.get(j));
        }

        int w = 0;
        while (w < 10){
            System.out.println("w: " +w);
            w++;
        }

        int dw = 0;
        do {
            System.out.println(lista.get(dw));
            dw++;
        } while (dw < lista.size());

        // casting - converter de tipos
        double tipoD = 0.0;
        int tipoI = (int)tipoD;
        System.out.println(tipoI);

        int tipoInteiro = 10;
        double tipoDouble = tipoInteiro;
        System.out.println(tipoDouble);

        String umaString = "10";
        System.out.println("Sou string: " + umaString);
        double umaDouble = Double.parseDouble(umaString);
        System.out.println("Agora sou double: " + umaDouble);
        umaString = String.valueOf(umaDouble);
        System.out.println("Sou string de novo: " + umaString);


        // Criação de objeto
        Carro carro0 = new Carro("Fusca");
        CarroInterface carro1 = new Sandero();
        Carro carro2 = new Carro("BMW");
        // chamada do método
        carro0.acelerar();
        carro2.acelerar();
    }
}