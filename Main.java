package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un dia:");
		int dia = sc.nextInt();
		System.out.println("Escribe un mes:");
		int mes = sc.nextInt();
		System.out.println("Escribe un año:");
		int anio = sc.nextInt();
		
			
		switch (mes) {
			case 1,3,5,7,8,10,12:
				if (dia >= 1 && dia <= 31);{
					System.out.println("Fecha valida");
				}
				break;
				
			case 2:
				if (dia >= 1 && dia <= 28); {
					System.out.println("Fecha valida");
				}
				break;
				
			case 4,6,9,11:
				if (dia >= 1 && dia <=30);{
					System.out.println("Fecha valida");
				}
				break;
				
			default:
				System.out.println("Fecha no valida");
				
		
		}

	}

}
