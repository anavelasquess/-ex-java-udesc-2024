package exerciciosjava;

import java.util.Scanner;

public class Ex08MaiorMenor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite 4 valores inteiros:");

            int valor1 = scanner.nextInt();
            int maior = valor1;
            int menor = valor1;

            for (int i = 2; i <= 4; i++) {
                int valor = scanner.nextInt();

                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }

            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);

            scanner.close();
        }
    }