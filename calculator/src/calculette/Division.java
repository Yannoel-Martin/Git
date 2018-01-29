package calculette;

import java.util.Scanner;

public class Division {
	public int division(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre premier nombre :");
		int nb1 = sc.nextInt();
		System.out.println("Veuillez saisir votre second nombre :");
		int nb2 = sc.nextInt();
		int result = nb1 / nb2;
		System.out.println("Le résultat est : " + result + ".");
		return result;
	}
}
