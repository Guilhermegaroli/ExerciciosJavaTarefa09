/*3) Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o 
número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a
instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o
próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.*/

package tarefa9;

public class Exercicio3 {

	public static void main(String[] args) {
		int numero = 1;
		do {
			if (numero % 4 == 0)
				System.out.println(" o numero " + numero + " é divisível por 4 ");
			numero = numero + 1;
		} while (numero <= 200);
	}

}
