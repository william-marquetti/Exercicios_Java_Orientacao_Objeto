package arrays;

import java.util.Arrays;

public class Classe {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		
		for ( int aux = 1; aux < numeros.length; aux++ ){
			numeros[aux] = aux;
			//System.out.println(numeros[aux]);
		}
		
		String[] nomes = new String[]{"Andiara","William","Carlos","João"};
		
		Arrays.sort(nomes);
		
		for ( int aux = 0; aux < nomes.length; aux++ ){
			System.out.println(nomes[aux]);
		}
		
		int[] numeros2 = new int[10];
		
		double soma = 0;
		
		for ( int aux = 0; aux < numeros2.length; aux++ ){
			numeros2[aux] = aux*8;
			soma += numeros2[aux];

		}
		
		double media = (soma/numeros2.length);
		System.out.println("Soma: "+ soma);
		System.out.println("Média: "+ media );
		
		int[] numeros3 = new int[]{8,9,67,215,10,43,98};
		
		Arrays.sort(numeros3);
		
		int max = numeros3[numeros3.length-1];
		
		System.out.println("Maior número do array numeros3: "+max);
		
	}

}
