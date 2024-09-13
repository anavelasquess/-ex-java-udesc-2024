package exerciciosjava;

import java.util.Scanner;

public class Ex10GastoFumar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Há quantos anos você fuma? ");
        int anosFumando = scanner.nextInt();

        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Qual o preço de uma carteira de cigarros? ");
        double precoCarteira = scanner.nextDouble();

        int cigarrosPorAno = cigarrosPorDia * 365;
        int totalCigarros = cigarrosPorAno * anosFumando;


        System.out.printf("Você já gastou R$ %.2f com cigarro.\n", ((totalCigarros/20)*precoCarteira));

        scanner.close();
    }
}