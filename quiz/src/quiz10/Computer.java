package quiz10;

public class Computer extends Calculator{
	
	double circle(int a) {
		return a * a * Math.PI;
	}
	
	double rect(double d) {
		return d*d;
	}
	double rect(double a, double b) {
		return a*b;
	}
	double rect(double a, double b, double c) {
		return a*b*c;
	}

}
