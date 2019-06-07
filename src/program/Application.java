package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Student; 

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		

		Student[] vect = new Student[10];

		System.out.println("How many students you want to add? ");
		int RA = sc.nextInt();

		for (int i = 1; i <= RA; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("RA " + i + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("e-mail: ");
			String email = sc.nextLine();
			System.out.println("Notas NP1: ");
			double NP1 = sc.nextDouble();
			System.out.println("Notas NP2: ");
			double NP2 = sc.nextDouble();
			double average = (NP1 + NP2) / 2; 
			System.out.print("Média: " + average);
			System.out.println();
			vect[RA] = new Student(name, email);
		}
		for (int i = 0; i <= RA; i++) {
			if (vect[i] != null)
			System.out.print(i + ": " + vect[i]);{
		}
			}
		sc.close();

	}

}

