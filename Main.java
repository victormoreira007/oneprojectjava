import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        int idade = sc.nextInt();

        int anoAtual = 2026;

        int narceu = anoAtual - idade;

        System.out.println("===========================");

        System.out.println("Olá, " + nome);

        System.out.println("Sua idade: " + idade +" anos");

        System.out.println("você nasceu no ano: " + narceu);

        if (idade >= 18){
            System.out.println("Você é maior de idade, "+nome +"!");
        }else {
            System.out.println("Você é menor de idade, "+nome+"!");
        }

    }
}