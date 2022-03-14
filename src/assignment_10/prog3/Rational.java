package prog10_2;

public class Rational {
	private int p;
	private int q;

	public Rational(int p1, int q1) {
		if (q1 <= 0) {
			throw new ArithmeticException("q must be greater than zero");
		}
		int g = module(p1, q1);
		p = p1 / g;
		q = q1 / g;

		if (q < 0) {
			q = -q;
			p = -p;
		}
	}

	public int getP() {
		return p;
	}

	public int getQ() {
		return q;
	}

	// adds the rational rat to this Rational
	public Rational add(Rational rat) {
		int niil1 = (this.getP() * rat.getQ() + (this.getQ() * rat.getP()));
		int niil2 = this.getQ() * rat.getQ();
		return new Rational(niil1, niil2);
	}

	private static int module(int p1, int q1) {
		if (p1 < 0)
			p1 = -p1;
		if (q1 < 0)
			q1 = -q1;
		if (q1 == 0)
			return p1;
		else
			return module(q1, p1 % q1);
	}

	// multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		return new Rational(this.getP() * rat.getP(), this.getQ() * rat.getQ());
	}

	// returns –1 if this rational is less than rat
	// returns 0 if this rational equals (see equals
	// method discussion below) rat
	// returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		int less = this.getP() * rat.getQ(); // -29 * 45 = -1305
		int great = this.getQ() * rat.getP(); // 15 * -92 = -1380
		if (less < great)
			return -1;
		if (less > great) // -1305 > -1380
			return 1;
		return 0;

	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o.getClass() != this.getClass()))
			return false;
		Rational ra = (Rational) o;
		return compareTo(ra) == 0;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		String s = new String();
		s += getP() + "/" + getQ();
		return s;
	}

	public static void main(String[] args) {
		Rational r1, r2, r3, res1, res2;
		r1 = new Rational(2, 3);
		r2 = new Rational(-17, 5);
		r3 = new Rational(1, 3);

		// 1
		res1 = r1.multiply(r2).add(r3);// 2/3 * -17/5 = -34/15
		System.out.println("1: " + res1.toString()); // -34/15 + 1/3 = -34/15 + 5/15 = -29/15

		// 2
		res2 = r2.add(r3).multiply(r1);// -17/5 + 1/3 = -51/15 + 5/15 = -46/15
		System.out.println("2: " + res2.toString()); // -46/15 * 2/3 = -92/45
		System.out.println("Compare: " + res1.compareTo(res2)); // -1305 < -1380

		switch (res1.compareTo(res2)) {
		case 1: // (2/3 * -17/5) + 1/3 is greater than 2/3 * (-17/5 + 1/3)
			System.out.printf("(%s * %s) + %s is greater than %s * (%s + %s)", r1.toString(), r2.toString(),
					r3.toString(), r1.toString(), r2.toString(), r3.toString());
			break;
		case -1:
			System.out.printf("(%s * %s) + %s is less than %s * (%s + %s)", r1.toString(), r2.toString(), r3.toString(),
					r1.toString(), r2.toString(), r3.toString());
			break;
		case 0:
			System.out.printf("(%s * %s) + %s is equlal %s * (%s + %s)", r1.toString(), r2.toString(), r3.toString(),
					r1.toString(), r2.toString(), r3.toString());
			break;
		default:
			break;
		}
	}

}
