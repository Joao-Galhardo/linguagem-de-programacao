public class ExemploInterpolacao {
    public static void main(String[] args) {
        String nome = "Bob da Silva";
        Double altura = 1.60;
        Integer idade = 42;

        // Na interpolação usamos:
        // %s para String
        // %d para Inteiros
        // %.2f para Double (2 representa a quantidade de casas decimais, pode ser 1, 2,3...)
        String fraseFormatada = String.format(
                """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet: %s
                """,nome,idade,altura,"Caramelo"
        );

        String fraseFormatadaAlternativa2 = """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet: %s
                """.formatted(nome,idade,altura, "Caramelo");

        Boolean petVacinado = true;


        System.out.println( """
                Meu nome é: %s
                Minha idade é: %d
                Minha altura é: %.2f
                Nome do meu pet: %s
                Pet Vacinado: %s""".formatted(
                        nome, idade,
                altura, "Caramelo",(petVacinado ? "Sim" : "Não") ));


        // Se tiver menos de 15 anos, o salário é 800 reais
        // Mais de 15 anos, o salário é 1600
        Integer idadeParaGanharSalario = 15;
        Double salario = idadeParaGanharSalario < 15 ? 800.0 : 1600;
        Boolean maiorDeIdade = idade >= 18;

        // Cuidado com nome de boolean!
        Boolean usuarioBloqueadoOuNao = false;

        if (!usuarioBloqueadoOuNao){
            System.out.println("Ta Bloqueado!");
        }
    }
}
