/*9) Elaborar um programa que efetue a leitura de valores positivos inteiros até que 
 * um valor negativo seja informado. Ao final devem ser apresentados o maior e o 
 * menor valores informados pelo usuário.*/

package tarefa9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int maior = 0;
		int menor = 0;
		int numero = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um Numero Positivo: ");
			numero = sc.nextInt();
			if (numero > maior) {
				maior = numero;
			} else {
				menor = numero;
			}
			
		} while (numero >= 0);

		System.out.println("maior numero é: " + maior + "menor número é: " + menor);

	}

}
