package exercicio2003;

import java.util.Scanner;

public class Atividade2_2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		double n1, n2, n3, n4, notafinal;
		
		System.out.println("digite a primeira nota");
		n1 = ler.nextDouble();
		
		System.out.println("digite a segunda nota");
		n2 = ler.nextDouble();
		
		System.out.println("digite a terceira nota");
		n3 = ler.nextDouble();
		
		System.out.println("digite a quarta nota");
		n4 = ler.nextDouble();
		
		//processamento
		
		notafinal = (n1+n2+n3+n4)/4;
		
		if(notafinal >= 7) {
			System.out.println("Voce está aprovado Parabéns sua nota foi: " +notafinal);
		}
		
		else {
			System.out.println("Voce está reprovado infelizmente sua nota foi: " +notafinal);
		}
		
		ler.close();

	}

}
