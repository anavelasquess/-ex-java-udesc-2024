package exerciciosjava;

import java.util.Scanner;

public class Ex01Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();



        // Exibir resultados
        System.out.println("O sucessor de " + numero + " é " + (numero +1));
        System.out.println("O antecessor de " + numero + " é " + (numero-1));

        scanner.close();
    }
}