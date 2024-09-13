package exerciciosjava;

import java.util.Scanner;

public class Ex09MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite as 3 notas do aluno: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + ((n1+n2+n3)/3));

        if ((n1+n2+n3)/3 >= 7) {
            System.out.println("Aprovado");
        } else if ((n1+n2+n3)/3 >= 5) {
            System.out.println("Em exame");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}