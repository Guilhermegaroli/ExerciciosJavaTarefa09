/*8)Elaborar um programa que possibilite calcular a área total de uma residência 
 * (sala, cozinha,banheiro, quartos, área de serviço, quintal, garagem, etc.). 
 * O programa deve solicitar a entrada do nome, a largura e o comprimento de um 
 * determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também 
 * uma mensagem solicitando do usuário a confirmação de continuar calculando novos 
 * cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total 
 * acumulado da área residencial.*/

package tarefa9;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		String comodo;
		float soma;
		float totalSoma = 0;
		char continua;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Comodo: ");
			comodo = sc.next();
			System.out.println("Largura do Cômodo: ");
			float larguraComodo = sc.nextFloat();
			System.out.println("Comprimento do Cômodo: ");
			float comprimentoComodo = sc.nextFloat();
			soma = larguraComodo * comprimentoComodo;
			totalSoma = soma + totalSoma;
			System.out.println("Area: " + comodo + "\nLargura do Cômodo: " + larguraComodo + "\nComprimento do Cômodo: "
					+ comprimentoComodo);
			System.out.println("Aréa do Comodo: " + soma);
			System.out.println("Deseja adicionar mais um Cômodo? (s/n)");
			continua = sc.next().charAt(0);
			System.out.println("Valor Total Da Área Residencial: " + totalSoma);
			
			} while (continua == 's');
	
	
	}
	
}
