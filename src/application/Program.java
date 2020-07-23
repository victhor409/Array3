package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		for(int i=0; i<n; i++) {
			
			String nome=sc.next();
			double preco=sc.nextDouble();
			
			vect[i]= new Produto(nome,preco);
		}
		
		
		double sum=0.0;
		for(int i=0; i<vect.length; i++) {
			
			sum += vect[i].getPreco();
			
		}
		
		double avg = sum/n;
		
		System.out.printf("AVG: %.2f%n",avg);
		
		
		
		sc.close();
	
	}

}
	
		
