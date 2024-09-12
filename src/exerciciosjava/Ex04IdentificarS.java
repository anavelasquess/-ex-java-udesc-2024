package exerciciosjava;

import java.util.Scanner;

public class Ex04IdentificarS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sexo (M para Masculino ou F para Feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        switch (sexo) {
            case 'M':
                System.out.println("Sexo: Masculino");
                break;
            case 'F':
                System.out.println("Sexo: Feminino");
                break;
            default:
                System.out.println("Entrada inválida. Por favor, digite M para Masculino ou F para Feminino.");
                break;
        }

        scanner.close();
    }
}