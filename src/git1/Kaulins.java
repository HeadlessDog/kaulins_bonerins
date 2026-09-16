package git1;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {

static void mestKaulinu(int reizes) {
		int sk;
		Random rand = new Random();
		
		for(int i=0; i<reizes; i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+sk);
		}
}
	
	public static void main(String[] args) {
		int reizes;	
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		mestKaulinu(reizes);
		
		scan.close();
}
}
