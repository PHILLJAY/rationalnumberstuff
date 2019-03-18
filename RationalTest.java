package rationalnumberstuff;
import java.util.Scanner;

public class RationalTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		int b = in.nextInt();
		Rational Bongus = new Rational(c,b);
		System.out.println(Bongus);
		c = in.nextInt();
		b = in.nextInt();
		Rational Fargus = new Rational(c,b);
		System.out.println(Fargus.add(Bongus));
		
		System.out.println(Bongus.printRational());

		// TODO Auto-generated method stub

	}

}
