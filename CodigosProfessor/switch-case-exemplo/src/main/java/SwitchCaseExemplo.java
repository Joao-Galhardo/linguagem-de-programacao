import java.util.Scanner;

public class SwitchCaseExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana:");
        Integer diaDaSemana = leitor.nextInt();


        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda!!!");
                System.out.println("Segunda!!!");
            break;
            case 2:
                System.out.println("Terça!");
                break;
            case 3:
                System.out.println("AULA DE LP!");
                break;
            case 4:
                System.out.println("Quinta!");
                break;
            case 5 :
                System.out.println("Sextou!");
                break;
            default:
                System.out.println("Você não digitou um número valido!");
                break;
        }

        //Cuidado: sensitive case!
        String fruta = "Melancia";
        switch (fruta){
            case "maça":
                System.out.println("Temos no estoque!");
                break;
            case "Melancia":
                System.out.println("Não temos no estoque!");
                break;
        }

    }
}
