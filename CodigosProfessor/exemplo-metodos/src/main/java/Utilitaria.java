public class Utilitaria {

    // Um método sempre possui:
    // Retorno: void (esse não possui retorno)
    // Nome: exibirLinha
    // Argumentos: esse não tem, fica dentro dos ()
    // Corpo: esse faz um print, sempre dentro das {}
    void exibirLinha(){
        System.out.println("*---------------------*");
    }

    void exibirNome(String nome){
        System.out.println("Olá " + nome);
    }

    //Podemos chamar métodos dentro de métodos
    // não precisa criar objeto se estiver na mesma classe
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
    }
}
