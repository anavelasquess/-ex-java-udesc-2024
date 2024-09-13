package exerciciosjava;

import java.util.Scanner;

public class Ex06DoarSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar sangue.");
        } else {
            System.out.println("Você não pode doar sangue.");
        }

        scanner.close();
    }
}
