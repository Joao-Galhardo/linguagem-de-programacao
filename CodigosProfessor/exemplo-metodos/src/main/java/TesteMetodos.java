public class TesteMetodos {
    public static void main(String[] args) {
        String nome01 = "Xampson";
        String nome02 = "William";

        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();

        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);

        System.out.println("Usando a cálculadora:");
        Double resultadoSoma = calc.somar(40.0, 2.0);
        System.out.println(resultadoSoma);
        System.out.println("Soma + 10: "+  (resultadoSoma + 10));
    }
}
