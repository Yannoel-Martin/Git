package calculette;

import java.util.Scanner;

public class CalculetteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Choississez l'opération à l'effetuer : ");
		System.out.println("1) Addition");
		System.out.println("2) Soustraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("5) Modulo");
		int choix = sc.nextInt();
		
		switch (choix) {
			case 1:
				Addition op1 = new Addition();
				break;
			case 2:
				Soustraction op2 = new Soustraction();
				break;
			case 3:
				Multiplication op3 = new Multiplication();
				break;
			case 4:
				Division op4 = new Division();
				break;
			case 5:
				Modulo op5 = new Modulo();
				break;
			default:
				System.out.println("Erreur 404.");
				break;
		}
	}
}
