/*4) Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de 
trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de trigo 
no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro quadro 
coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos), no terceiro 
quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8 grãos (tendo-se então 
15 grãos) até atingir o sexagésimo quarto (64o) quadro. Utilize variáveis do tipo real como acumuladores.*/

package tarefa9;

public class Exercicio4 {

	public static void main(String[] args) {
		int contadora = 0;
		double somatorio = 1;
		double inicio = 1;
		do {
			inicio = inicio * 2;
			somatorio += inicio;
			System.out.println(contadora + " casa: " + inicio);
			contadora++;
		} while (contadora <= 64);
		System.out.println("a soma final é: " + somatorio);
	}

}
