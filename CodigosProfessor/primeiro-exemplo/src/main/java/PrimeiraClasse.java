public class PrimeiraClasse {
    // O método main é a "porta de entrada"
    //para rodar nossa aplicação java
    public static void main(String[] args) {
        //Atalho para print: sout
        System.out.println("Olá Mundo");

        // Double altura = false; //Não da, é FORTEMENTE tipado

        //Tipos que mais usaremos:
        String nome = "Giuliana";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean usuarioBloqueado = true;

        // Exibindo frase
        System.out.println("Meu nome é "
                + nome + " e minha altura é "
                + altura);

        //Tipo Wrapper = são classes, e tem métodos que ajudam!
        //Tipo primitivo = não é classe java :( só guarda algo
        //Exemplos:
        Integer primeiroNumero = 42;
        int primeiroNumeroPrimitivo = 42;
        Boolean bloqueado = false;
        boolean bloqueadoPrimitivo = false;
    }

}
