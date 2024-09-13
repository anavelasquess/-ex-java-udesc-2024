package exerciciosjava;

import java.util.Scanner;

public class Ex07CalcularSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Seu salário total no mês é: R$ " + (salarioPorHora*horasTrabalhadas));

        scanner.close();
    }
}
