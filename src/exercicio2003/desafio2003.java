package exercicio2003;

import java.util.Scanner;

public class desafio2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int valor;
		
		System.out.println("digite um valor");
		valor = ler.nextInt();
		
		if (valor ==1 ) {
			System.out.println("Domingo");
		}
		
		else if (valor ==2 ) {
			System.out.println("Segunda-feira");
		}
		else if (valor ==3 ) {
			System.out.println("Terça-feira");
		}
		else if (valor ==4 ) {
			System.out.println("Quarta-feira");
		}
		else if (valor ==5 ) {
			System.out.println("Quinta-feira");
		}
		else if (valor ==6 ) {
			System.out.println("Sexta-feira");
		}
		else if (valor ==7 ) {
			System.out.println("Sábado");
		}
	
		else if (valor >8 ) {
			System.out.println("Dia inválido");
	
		}
		
        
	   ler.close();
		
	}

}
