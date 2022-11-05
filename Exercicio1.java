/*1) Apresentar os quadrados dos números inteiros de 15 a 200.*/

package tarefa9;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero1 = 14;
		int numero2;
		do {
			numero1 = numero1 + 1;
			numero2 = numero1 * numero1;
			System.out.println(numero1 + " ao quadrado=" + numero2);
		} while (numero1 < 200);

	}

}
