package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.
 */


import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("How many rooms will be rented?: ");
		int n = sc.nextInt();
		System.out.println();
		
		
		Rooms[] vect = new Rooms[10];
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			String name=sc.next();
			sc.nextLine();
			System.out.print("Email: ");
			String mail=sc.next();
			System.out.print("Room: ");
			int room=sc.nextInt();
			System.out.println();
			
			vect[i]=new Rooms(name,mail,room);
			
		}
		
		System.out.println("Busy Rooms");
		
		for(int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i+": "+vect[i]);
			}
		}
		
		sc.close();
	
	}

}
	
		
