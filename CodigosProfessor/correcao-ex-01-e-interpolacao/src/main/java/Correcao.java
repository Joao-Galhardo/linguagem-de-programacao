public class Correcao {
    public static void main(String[] args) {
        Integer quantidadeBebes = 0;
        Integer criancas = 0;
        Integer jovens = 0;

        Double valorBebes = 25.12;
        Double valorCriancas = 15.88;
        Double valorJovens = 12.44;

        System.out.println(
                "Você tem um total de "+ (quantidadeBebes + criancas + jovens)+
                        " filhos e vai receber R$"+
                        ((valorBebes * quantidadeBebes) + (valorCriancas * criancas) + (valorJovens * jovens))+
                        " de bolsa");

    }
}
