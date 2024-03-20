package exercicio2003;

import java.util.Scanner;

public class Atividade1_2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int numero;
		
		System.out.println("digite um valor");
		numero = ler.nextInt();
		
		if(numero >= 10) {
			System.out.println("o numero é maior ou igual à 10");
		}
		
		else {
			System.out.println("O numero é menor que 10");
		}
		
		ler.close();

	}

}
