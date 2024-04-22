package com.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        /*
            Metodos importantes do List
            add(Object e) - adiciona valores na lista
            add(int index, Object e) - empurra os itens da lista para adicionar o novo valor no indice indicado
            get(int index) - busca um valor da lista pelo indice
            size() - retorna o tamanho da lista
            remove(int i) - remove um valor da lista pelo indice
            set(int index) - troca o valor dentro da lista indicado no indice
            isEmpty() - retorna um boolean indicando se a list esta vazia
            List<> - o <> indica o tipo da lista.
         */
        List listaEstranha = new ArrayList();
        listaEstranha.add("Nome");
        listaEstranha.add(12);
        listaEstranha.add(3.9);
        listaEstranha.add(false);

        System.out.println("Lista aceita qualquer coisa (não use)");
        System.out.println(listaEstranha);

        List<String> listaDeStrings = new ArrayList();
        listaDeStrings.add("William");
        listaDeStrings.add("Giuliana");

        System.out.println("Lista de String somente apenas");
        System.out.println(listaDeStrings);

        List<Integer> listaDeNumeros = new ArrayList();
        listaDeNumeros.add(12);
        listaDeNumeros.add(45);

        System.out.println("Lista de Integer somente apenas");
        System.out.println(listaDeNumeros);

        System.out.println("Exibindo os valores dentro da lista");
        for (int i=0; i < listaDeStrings.size(); i++) {
            String nomeAuxiliar = listaDeStrings.get(i);
            System.out.println(nomeAuxiliar);
        }

        System.out.println(listaDeStrings.get(1));
        listaDeStrings.remove(1);
        listaDeStrings.remove(0);
        System.out.println(listaDeStrings);

        if (listaDeStrings.size() == 0) {
            System.out.println("Lista vazia");
        }

        if (listaDeStrings.isEmpty()) {
            System.out.println("Lista vazia");
        }

        listaDeStrings.add("Manoel");
        listaDeStrings.add("Paulo");
        listaDeStrings.add("Reis");
        listaDeStrings.add("Diego");
        System.out.println("Adicionei novos nomes");
        System.out.println(listaDeStrings);

        listaDeStrings.add(1, "Pedro");
        System.out.println("Adicionando o pedro no index 1");
        System.out.println(listaDeStrings);

        System.out.println("Trocando o valor pelo index");
        listaDeStrings.set(1, "Maria");
        System.out.println(listaDeStrings);

        listaDeStrings.add(listaDeStrings.size()-1, "julia");
        System.out.println(listaDeStrings);

        listaDeStrings.clear();
        System.out.println(listaDeStrings);
    }
}
