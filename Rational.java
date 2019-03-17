package rationalnumberstuff;

public class Rational {
	private int top;
	private int bot;
	public String printRational(){
		return (top + "/" + bot);
	}
	public void negate(){
		top =-(top);
	}
	public void invert(){
		int c = top;
		top = bot;
		bot = c;
	}
	public double toDouble(){
		return (double) top/bot;
	}
	public String toString(){
		return ("Your number is " + top + "/" + bot);
	}
	public int gcd(){
		int m = top;
		int n = bot;
		if (m > n) {
			if ((m % n) == 0) 
				return n;
			else
				return gcd(n, m % n);
		}
		else {
			if ((n % m) == 0) 
				return m;
			else
				return gcd(m, n % m);
		}
	} 
	public int gcd (int n, int m) {

		if (m > n) {
			if ((m % n) == 0) 
				return n;
			else
				return gcd(n, m % n);
		}
		else {
			if ((n % m) == 0) 
				return m;
			else
				return gcd(m, n % m);
		}
	}
	public Rational reduce(){
		int v = gcd();
		int m = top;
		int n = bot;
		m = m/v;
		n = n/v;
		Rational Bum = new Rational(m,n);
		return Bum;
	}
	public Rational add(rational c) {
		
		return o;
	}
Rational(double c, double b){
		top = (int) Math.round(c);
		bot = (int) Math.round(b);
	}
	Rational(int c, int b){
		top = c;
		bot = b;
	}
	Rational(){
		top = 0;
		bot = 1;
	}
}
