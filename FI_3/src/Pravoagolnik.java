import java.util.Scanner;
public class Pravoagolnik {
		public static void main(String[] args) {
		double dolzina, sirina, visina, volumen;
		Scanner tastatura = new Scanner(System.in);

		System.out.println("Programata presmetuva volumen na pravoagolnik");

		System.out.println("Vnesete dolzina: ");

		dolzina = tastatura.nextDouble();

		System.out.print("Vnesete sirina: ");

		sirina = tastatura.nextDouble();
		
		System.out.print("Vnesete visina: ");

		visina = tastatura.nextDouble();
		
		volumen = dolzina*sirina*visina;
		
		System.out.println("Volumenot na pravoagolnikot iznesuva " + volumen);
		
}
}