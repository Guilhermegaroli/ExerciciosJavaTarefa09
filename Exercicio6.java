/*6) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
final o total do somatório, a média aritmética e o total de valores lidos. O programa deve 
fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou 
seja, o programa deve parar quando o usuário fornecer um valor negativo. Não se esqueça que 
o usuário pode entrar como primeiro número um número negativo, portanto, cuidado com a 
divisão por zero no cálculo da média.*/

package tarefa9;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int totalValores = 0;
		int totalSoma = 0;
		do {

			System.out.println("Digite Um Número:");
			numero = sc.nextInt();
			if (numero > 0) {
				totalSoma = totalSoma + numero;
				totalValores++;
			}

		} while (numero > 0);
		float media = (totalSoma / totalValores);
		System.out.println("Total Soma: " + totalSoma + " Media: " + media + " Total Valores Lidos: " + totalValores);
		sc.close();
	}

}
