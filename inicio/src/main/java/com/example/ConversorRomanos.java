package com.example;

import java.util.HashMap;
import java.util.Map;

public class ConversorRomanos {

    private Map<String, Integer> mapaRomanos = new HashMap<>();

    public ConversorRomanos() {
        mapaRomanos.put("I", 1);
        mapaRomanos.put("V", 5);
        mapaRomanos.put("X", 10);
        mapaRomanos.put("L", 50);
        mapaRomanos.put("C", 100);
        mapaRomanos.put("D", 500);
        mapaRomanos.put("M", 1000);
    }

    public int converter(String simbolo) {
        int valorSimbolo = 0;
        int soma = 0;
        int somador = 0;
        Character valorAtual;

        for (int i = simbolo.length() - 1; i >= 0; i--) {
            if (i == simbolo.length() - 1) {
                valorAtual = simbolo.charAt(i);
                valorSimbolo = mapaRomanos.get(valorAtual.toString());
                soma = valorSimbolo;
            } else {
                valorAtual = simbolo.charAt(i);
                somador = mapaRomanos.get(valorAtual.toString());
                if (valorSimbolo > somador) {
                    soma -= somador;
                } else {
                    soma += somador;
                }
            }
        }
        return soma;
    }
}
