//* Input 25
//* Output 1 1 2 1

import java.util.Scanner;

public class WeaponFactory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ironIngot = sc.nextInt();
        sc.close();

		int fullArmor = ironIngot/21;
		ironIngot %= 21;
		int sword = fullArmor + (ironIngot/10);
		ironIngot %= 10;
		int shield = fullArmor + (ironIngot/8);
		ironIngot %= 8;
		int helmet = fullArmor + (ironIngot/3);
		ironIngot %= 3;
		System.out.println(sword + " " + shield + " " + helmet + " " + ironIngot);
	}
}

//* This code is solely implemented by boyplus(GitHub), CS@SIT KMUTT Senior by chain modulo method.