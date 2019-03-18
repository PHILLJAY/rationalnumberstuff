package rationalnumberstuff;
/**
 * 										Bro
 * @author Philip J
 *
 */

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
	public int topInt(){
		return top;
	}
	public int botInt(){
		return bot;
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
		int v = this.gcd();
		int m = top;
		int n = bot;
		m = m/v;
		n = n/v;
		Rational Bum = new Rational(m,n);
		return Bum;
	}
	public Rational add(Rational that) {
	int bottom = this.botInt()*that.botInt();	
	int topThat = that.botInt()*this.topInt() + this.botInt()*that.topInt();
	Rational thus = new Rational(topThat,bottom);
	return thus.reduce();
	}
	public Rational subtract(Rational that) {
	int bottom = this.botInt()*that.botInt();	
	int topThat = that.botInt()*this.topInt() - this.botInt()*that.topInt();
	Rational thus = new Rational(topThat,bottom);
	return thus.reduce();
	}
	public Rational multiply(Rational that) {
	int bottom = this.botInt()*that.botInt();	
	int topThat = this.topInt()*that.botInt();
	Rational thus = new Rational(topThat,bottom);
	return thus.reduce();
	}
	public Rational divide(Rational that) {
	int bottom = this.botInt()*that.topInt();	
	int topThat = this.topInt()*that.botInt();
	Rational thus = new Rational(topThat,bottom);
	return thus.reduce();
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
