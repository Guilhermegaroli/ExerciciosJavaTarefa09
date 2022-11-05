/*7) Elaborar um programa que apresente como resultado o valor do fatorial dos valores 
situados na faixa numérica de 1 a 10.*/

package tarefa9;

public class Exercicio7 {

	public static void main(String[] args) {
		int contadora = 1;
		while (contadora <= 10) {
			int contadoraFatorial = 1;
			int fatorial = 1;
			do {
				fatorial = fatorial * contadoraFatorial;
				contadoraFatorial++;
			} while (contadoraFatorial <= contadora);
			System.out.println("O fatorial do numero " + contadora + " é: " + fatorial);
			contadora = contadora + 2;
		}

	}

}
