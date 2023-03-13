import java.util.Scanner;

public class Triagolnik {

	public static void main(String[] args) {
		double plostina, perimetar, str1, str2, str3, visina;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Programata presmetuva plostina i volumen na raznostran triagolnik");
		System.out.print("Vnesi strana a: ");
		str1 = tastatura.nextDouble();
		System.out.print("Vnesi strana b: ");
		str2 = tastatura.nextDouble();
		System.out.print("Vnesi strana c: ");
		str3 = tastatura.nextDouble();
		System.out.print("Vnesi strana visina: ");
		visina = tastatura.nextDouble();
		perimetar = str1 + str2 + str3;
		plostina =(str2*visina)/2;
		System.out.println("Plostinata na raznostraniot triagolnik e " + plostina +" a perimetarot e " + perimetar);
		
	}

}
