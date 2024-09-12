package exerciciosjava;

import java.util.Scanner;

public class Ex02MediaConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        int distancia = scanner.nextInt();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        int combustivel = scanner.nextInt();

        if (distancia == 0) {
            System.out.println("Distância não pode ser zero.");
        } else {
            double mediaConsumo = (double) combustivel / distancia;

            System.out.printf("A média de consumo do veículo é %.2f litros por km.%n", mediaConsumo);
        }

        scanner.close();
    }
}
