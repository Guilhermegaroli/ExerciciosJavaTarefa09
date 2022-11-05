/*02)Elaborar um programa que apresente no final o 
 *somatório dos valores pares existentes na faixa de 1 até 500.*/

package tarefa9;

public class Exercicio2 {

	public static void main(String[] args) {
		int soma = 0;
		int par = 2;

		do {
			soma = soma + par;
			par = par + 2;
			System.out.println(" o somatório dos valores pares é: " + soma);

		} while (par <= 500);
	}

}
