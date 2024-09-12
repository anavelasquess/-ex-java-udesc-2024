package exerciciosjava;

import java.util.Scanner;

public class Ex03CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro número (" + numero1 + ").");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}