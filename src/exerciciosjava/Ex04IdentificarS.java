package exerciciosjava;

import java.util.Scanner;

public class Ex04IdentificarS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sexo (M para Masculino ou F para Feminino): ");
        char sexo = scanner.next().trim().toUpperCase().charAt(0);

        if (sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else if (sexo == 'F') {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Entrada inválida. Por favor, digite M para Masculino ou F para Feminino.");
        }

        scanner.close();
    }
}