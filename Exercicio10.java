/*10) Elaborar um programa que apresente o resultado inteiro da divisão de dois 
 * números quaisquer.Para a elaboração do programa, não utilizar em hipótese alguma 
 * o conceito do operador aritmético DIV. A solução deve ser alcançada com a 
 * utilização de looping. Ou seja, o programa deve apresentar como resultado 
 * (quociente) quantas vezes o divisor cabe no dividendo.*/

package tarefa9;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Dividendo: ");
		float dividendo = sc.nextFloat();
		System.out.println("Digite o Divisor: ");
		float divisor = sc.nextFloat();
		float conta = dividendo;
		float quociente = 0;
		float resto = 0;
		do {
			conta = conta - divisor;
			quociente = quociente + 1;
		} while (conta >= divisor);
		sc.close();
		resto = conta;
		System.out.println("Resultado: " + quociente);
		System.out.println("Resto: " + resto);
	}

}
