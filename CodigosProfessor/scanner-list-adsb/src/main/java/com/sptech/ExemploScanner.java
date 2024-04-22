package com.sptech;

/*
* Para utilizar o Scanner, certifique que a biblioteca importada foi essa abaixo
* */
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        /*
            Crie 2 Scanners, um para captura de valores String e o outro para qualquer outro tipo (Integer, Double, Boolean)
         */
        Scanner inputLine = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Ola, qual seu nome:");
        String nomeCompleto = inputLine.nextLine();

        System.out.println("Qual sua idade?");
        Integer idade = input.nextInt();

        System.out.println("Qual sua area de trabalho");
        String trabalho = inputLine.nextLine();

        System.out.println("Qual seu salario");
        Double meuSalarioReal = input.nextDouble();

        System.out.println("""
                Seu nome é %s
                Sua idade é %d
                Sua area de trabalho é %s
                Seu salario real: %.2f"""
                .formatted(nomeCompleto, idade, trabalho, meuSalarioReal));

        /*
            Você pode adicionar o .close() para fechar o Scanner,
            mas CUIDADO se voce fechar, não tem como abrir novamente
         */
        input.close();
        inputLine.close();
    }
}
